package com.ec.service.Imp;

import java.util.Date;

import com.ec.entity.*;
import com.ec.mapper.*;
import com.ec.service.PhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PhaseServiceImp implements PhaseService {

    @Autowired
    private PhaseMapper phaseMapper;
    @Autowired
    private ParticipateMapper participateMapper;
    @Autowired
    private TaskMapper taskMapper;

    public int createPhase(Integer studentId, Integer projectId, String phTitle, String phDescription) {
        ParticipateExample participateExample = new ParticipateExample();
        ParticipateExample.Criteria criteria = participateExample.createCriteria();
        criteria.andStudentIdEqualTo(studentId);
        criteria.andProjectIdEqualTo(projectId);
        List<Participate> participateList = participateMapper.selectByExample(participateExample);
        if(participateList.isEmpty()){
            return 0;
        }
        Phase phase = new Phase();
        phase.setProjectId(projectId);
        phase.setPhTitle(phTitle);
        phase.setPhDescription(phDescription);

        phase.setPhBeginTime(new Date());
        int i = phaseMapper.insertSelective(phase);
        return i;

    }

    public int deletePhaseById (Integer phaseId,Integer leaderId){   //根据ProjectId删除project的实现
        if(phaseId<=0){//若ProjectId为非正数
            return -1;
        }
        else {
            PhaseExample phaseExample = new PhaseExample();
            PhaseExample.Criteria criteria = phaseExample.createCriteria();
            criteria.andPhaseIdEqualTo(phaseId);
            List<Phase> phaseList = phaseMapper.selectByExample(phaseExample);

            if (phaseList.isEmpty()) {
                return -2;                    //该phase不存在
            } else {
                Phase ph = phaseList.get(0);
                int pid = ph.getProjectId();
                ParticipateExample participateExample = new ParticipateExample();
                ParticipateExample.Criteria criteria_p = participateExample.createCriteria();
                criteria_p.andStudentIdEqualTo(leaderId);
                criteria_p.andProjectIdEqualTo(pid);
                criteria_p.andRoleEqualTo(1);
                List<Participate> participateList = participateMapper.selectByExample(participateExample);
                if (participateList.isEmpty()) {
                    return 0;                    //该学生没有删除此phase的权限（不是组长或者根本没参加此项目）
                }
                else {
                    int phid=ph.getPhaseId();
                    TaskExample taskExample=new TaskExample();
                    TaskExample.Criteria criteriat=taskExample.createCriteria();
                    criteriat.andPhaseIdEqualTo(phid);
                    List<Task> taskList=taskMapper.selectByExample(taskExample);
//                    TaskServiceImp tsi=new TaskServiceImp();
                    for(Task t : taskList){
                        int tid=t.getTaskId();
                        taskMapper.deleteByPrimaryKey(tid);
                    }
                    phaseMapper.deleteByPrimaryKey(phaseId);
                    return 1;
                }

            }
        }
    }
}
