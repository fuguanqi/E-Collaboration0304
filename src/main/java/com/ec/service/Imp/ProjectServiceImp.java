package com.ec.service.Imp;

import com.ec.entity.*;
import com.ec.mapper.InstructorMapper;
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
