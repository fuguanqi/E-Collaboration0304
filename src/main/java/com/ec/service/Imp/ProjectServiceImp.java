package com.ec.service.Imp;

import com.ec.entity.*;
import com.ec.mapper.*;
import com.ec.mapper.ParticipateMapper;
import com.ec.mapper.StudentMapper;
import com.ec.service.ProjectService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ec.mapper.ProjectMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service

public class ProjectServiceImp implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private InstructorMapper instructorMapper;
    @Autowired
    private ParticipateMapper participateMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private EventMapper eventMapper;
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private ProjectfileMapper projectfileMapper;
    @Autowired
    private PhaseMapper phaseMapper;
    public int createProject(String studentName,String instructorName, String pTitle, String pDescription) {


        if(pTitle.trim()==null||pTitle.trim().equals("")){//项目名为空
            return 0;
        }else {
            ProjectExample projectExample = new ProjectExample();
            ProjectExample.Criteria criteria = projectExample.createCriteria();//构造自定义查询条件
            criteria.andPTitleEqualTo(pTitle);
            List<Project> projects = projectMapper.selectByExample(projectExample);
            if (!projects.isEmpty()) {
                return 0;
            } else {
                Instructor instructor=new Instructor();
                InstructorExample instructorExample=new InstructorExample();
                InstructorExample.Criteria criteria1=instructorExample.createCriteria();
                criteria1.andNameEqualTo(instructorName);
                List<Instructor> Itarget=instructorMapper.selectByExample(instructorExample);

                if (Itarget.isEmpty()){
                    return 0;
                }

                Student student=new Student();
                StudentExample studentExample=new StudentExample();
                StudentExample.Criteria criteria2=studentExample.createCriteria();
                criteria2.andNameEqualTo(studentName);
                List<Student> Starget=studentMapper.selectByExample(studentExample);

                if (Starget.isEmpty()){
                    return 0;
                }
                Project project = new Project();
                project.setpTitle(pTitle);
                project.setpDescription(pDescription);
                project.setInstructorId(Itarget.get(0).getInstructorId());
                project.setpBeginTime(new Date());


                int insertProject = projectMapper.insertSelective(project);
                criteria.andPTitleEqualTo(pTitle);
                projects = projectMapper.selectByExample(projectExample);

                if(insertProject!=0){
                    Participate participate=new Participate();
                    participate.setProjectId(projects.get(0).getProjectId());
                    participate.setStudentId(Starget.get(0).getStudentId());
                    participate.setRole(1);//1代表组长，0代表组员
                    participate.setContribution(0);
                    participate.setParticipateTime(new Date());
                    int insertParticipate=participateMapper.insertSelective(participate);
                    return insertParticipate;
                }
                return 0;
            }




        }
    }

    public List<Participate> addTeammates(List<String> studentName, Integer projectId) {
        List<Participate> participates = new ArrayList<Participate>();
        List<Project> projectList = new ArrayList<Project>();
        ProjectExample projectExample=new ProjectExample();
        ProjectExample.Criteria criteria4=projectExample.createCriteria();
        criteria4.andProjectIdEqualTo(projectId);
        projectList=projectMapper.selectByExample(projectExample);
        if(projectList.isEmpty()){
            return participates;
        }

        int insertParticipate=0;
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria2=studentExample.createCriteria();
        criteria2.andNameIn(studentName);
        List<Student> Starget=studentMapper.selectByExample(studentExample);
        int i=0;
        while (!Starget.isEmpty()){
            Participate participate=new Participate();
            participate.setProjectId(projectList.get(0).getProjectId());
            participate.setStudentId(Starget.get(0).getStudentId());
            participate.setRole(0);//1代表组长，0代表组员
            participate.setContribution(0);
            participate.setParticipateTime(new Date());
            insertParticipate=participateMapper.insertSelective(participate);
            Starget.remove(0);
            i++;
        }



        ParticipateExample participateExample= new ParticipateExample();
        ParticipateExample.Criteria criteria=participateExample.createCriteria();
        criteria.andProjectIdEqualTo(projectId);
        participates=participateMapper.selectByExample(participateExample);

        return participates;

    }

    public int repairProject(String pTitle, String pDescription) {
        if(pTitle.trim()==null||pTitle.trim().equals("")){//项目名为空
            return 0;
        }else {
            ProjectExample projectExample = new ProjectExample();
            ProjectExample.Criteria criteria = projectExample.createCriteria();//构造自定义查询条件
            criteria.andPTitleEqualTo(pTitle);
            List<Project> projects = projectMapper.selectByExample(projectExample);
            if (projects.isEmpty()) {
                return 0;
            } else {
                Project project = new Project();
                project=projects.get(0);
                project.setpTitle(pTitle);
                project.setpDescription(pDescription);

                int repairProject = projectMapper.updateByExampleSelective(project,projectExample);
                return repairProject;
            }
        }
    }
    public int deleteProjectById (int projectId, int studentId){   //根据ProjectId删除project的实现
        if(projectId<=0||studentId<=0){//若ProjectId或studentId为非正数
            return -1;
        }
        else{

            ParticipateExample participateExample=new ParticipateExample();
            ParticipateExample.Criteria criteria=participateExample.createCriteria();
            criteria.andStudentIdEqualTo(studentId);
            criteria.andProjectIdEqualTo(projectId);
            criteria.andRoleEqualTo(1);
            List<Participate> participateList=participateMapper.selectByExample(participateExample);
            if(participateList.isEmpty()){
                return 0;                    //该学生没有删除此项目的权限（不是组长或者根本没参加此项目）
            }

            PhaseExample phaseExample=new PhaseExample();
            PhaseExample.Criteria critirionPh = phaseExample.createCriteria();
            critirionPh.andProjectIdEqualTo(projectId);
            List<Phase> phaseList=phaseMapper.selectByExample(phaseExample);
            if(!phaseList.isEmpty()){
                return -2;        //仍有相关联的phase或task 未删除
            }

            EventExample eventExample=new EventExample();
            EventExample.Criteria critirionEv = eventExample.createCriteria();
            critirionEv.andProjectIdEqualTo(projectId);
            eventMapper.deleteByExample(eventExample);
//            for(Event e:eventList){
//                eventMapper.deleteByPrimaryKey(e.getEventId());                 //删除一切相关的event记录
//            }

            MessageExample messageExample=new MessageExample();
            MessageExample.Criteria critirionMs = messageExample.createCriteria();
            critirionMs.andProjectIdEqualTo(projectId);
            messageMapper.deleteByExample(messageExample);
//            List<Message> messageList=messageMapper.selectByExample(messageExample);
//            for(Message m:messageList){
//                messageMapper.deleteByPrimaryKey(m.getMessageId());                 //删除一切相关的message记录
//            }

            participateExample=new ParticipateExample();
            ParticipateExample.Criteria critirionPt = participateExample.createCriteria();
            critirionPt.andProjectIdEqualTo(projectId);
//            List<Participate> participateList1=participateMapper.selectByExample(participateExample);
            participateMapper.deleteByExample(participateExample);                 //删除一切相关的participate记录


            ProjectfileExample projectfileExample=new ProjectfileExample();
            ProjectfileExample.Criteria critirionPf = projectfileExample.createCriteria();
            critirionPf.andProjectIdEqualTo(projectId);
//            List<Participate> participateList1=participateMapper.selectByExample(participateExample);
            projectfileMapper.deleteByExample(projectfileExample);                 //删除一切相关的projectFile记录


            projectMapper.deleteByPrimaryKey(projectId);
            return 1;

        }
    }

    public List<Project> displayProject(int studentId){

        List<Project> projectList = new ArrayList<Project>();
        ParticipateExample participateExample=new ParticipateExample();
        ParticipateExample.Criteria criteria4=participateExample.createCriteria();
        criteria4.andStudentIdEqualTo(studentId);
        List<Participate> participateList=participateMapper.selectByExample(participateExample);

        if(participateList.isEmpty()){
            return projectList;
        }

        List<Integer>projectIdList=new ArrayList<Integer>();
        for(int i=0;i<participateList.size();i++){
            projectIdList.add(participateList.get(i).getProjectId());
        }

        ProjectExample projectExample = new ProjectExample();
        ProjectExample.Criteria criteria = projectExample.createCriteria();
        criteria.andProjectIdIn(projectIdList);
        projectList = projectMapper.selectByExample(projectExample);

        return projectList;

    }
}
