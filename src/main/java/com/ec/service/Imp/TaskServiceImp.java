package com.ec.service.Imp;

import com.ec.controller.converter.CustomDateConverter;
import com.ec.entity.*;
import com.ec.mapper.*;
import com.ec.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImp implements TaskService {
    @Autowired
    private ParticipateMapper participateMapper;
    @Autowired
    private TaskMapper taskMapper;
    @Autowired
    private ProjectMapper projectMapper;

    public int createTask(Integer studentId, Integer phaseId, String tTitle, String tDescription,String deadline) {
        Task task=new Task();
        task.setStudentId(studentId);
        task.setPhaseId(phaseId);
        task.settTitle(tTitle);
        task.settDescription(tDescription);
        task.setStatus(false);
        CustomDateConverter customDateConverter=new CustomDateConverter();//日期转换器
        task.setDeadline(customDateConverter.convert(deadline));
        task.settBeginTime(new Date());
        int t=taskMapper.insertSelective(task);
        if (t==0)
        return 0;

        return t;
    }

    public int deleteTask (Integer taskId, Integer leaderId){   //根据ProjectId删除project的实现
        if(taskId<=0||leaderId<=0){//若ProjectId或studentId为非正数
            return -1;
        }
        else{

            TaskExample taskExample=new TaskExample();
            TaskExample.Criteria criteria=taskExample.createCriteria();
            criteria.andTaskIdEqualTo(taskId);
            List<Task> taskList=taskMapper.selectByExample(taskExample);
            if(taskList.isEmpty()){
                return -2;                    //该任务不存在
            }
            else {
                Task t = taskList.get(0);
                int pid=t.getProjectId();
                ParticipateExample participateExample=new ParticipateExample();
                ParticipateExample.Criteria criteria_p=participateExample.createCriteria();
                criteria_p.andStudentIdEqualTo(leaderId);
                criteria_p.andProjectIdEqualTo(pid);
                criteria_p.andRoleEqualTo(1);
                List<Participate> participateList=participateMapper.selectByExample(participateExample);
                if(participateList.isEmpty()){
                    return 0;                    //该学生没有删除此task的权限（不是组长或者根本没参加此项目）
                }

                else {
                    taskMapper.deleteByPrimaryKey(taskId);
                    return 1;
                }

            }


        }
    }

    public List<Task> display(Integer studentId) {

        List<Task> taskList = new ArrayList<Task>();
        TaskExample taskExample=new TaskExample();
        TaskExample.Criteria criteria=taskExample.createCriteria();
        criteria.andStudentIdEqualTo(studentId);
        taskList=taskMapper.selectByExample(taskExample);

        if(taskList.isEmpty()){
            return taskList;
        }

        return taskList;
    }


    public List<Task> display(Integer studentId, Integer projectId) {
        List<Task> taskList = new ArrayList<Task>();

       // taskList=taskMapper.selectBySP(studentId,projectId);

        if(taskList.isEmpty()){
            return taskList;
        }

        return taskList;
    }
}
