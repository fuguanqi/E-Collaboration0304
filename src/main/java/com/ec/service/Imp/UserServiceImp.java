package com.ec.service.Imp;

import com.ec.entity.Instructor;
import com.ec.entity.InstructorExample;
import com.ec.entity.Student;
import com.ec.entity.StudentExample;
import com.ec.mapper.InstructorMapper;
import com.ec.mapper.StudentMapper;
import com.ec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private InstructorMapper instructorMapper;

    public List<Student> findStudent(String username, String password) {

        System.out.println("我要找学生");
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();//构造自定义查询条件

        criteria.andNameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<Student> studentList = studentMapper.selectByExample(studentExample);

        return studentList;
    }

    public List<Instructor> findInstructor(String username, String password) {
        System.out.println("我要找老师");
        InstructorExample instructorExample = new InstructorExample();
        InstructorExample.Criteria criteria = instructorExample.createCriteria();
        criteria.andNameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<Instructor> instructorList = instructorMapper.selectByExample(instructorExample);
        return instructorList;
    }

    public int registerStudent(String username, String password, String email) {
        System.out.println("我要注册学生");
        if(username.trim()==null||username.trim().equals("")){//用户名为空
            return 0;
        }if(password.trim()==null||password.trim().equals("")){//密码为空
            return 0;
        }else{
            StudentExample studentExample = new StudentExample();
            StudentExample.Criteria criteria = studentExample.createCriteria();//构造自定义查询条件
            criteria.andNameEqualTo(username);
            List<Student> userList = studentMapper.selectByExample(studentExample);
            if(!userList.isEmpty()){
                return 0;
            }else {
                Student student = new Student();
                student.setName(username);
                student.setPassword(password);
                student.setEmailAdd(email);

                int insertUser = studentMapper.insertSelective(student);

                return insertUser;
            }

        }

    }

    public int registerInstructor(String username, String password, String email) {
        System.out.println("我要注册老师");
        if(username.trim()==null||username.trim().equals("")){//用户名为空
            return 0;
        }if(password.trim()==null||password.trim().equals("")){//密码为空
            return 0;
        }else {
            InstructorExample instructorExample = new InstructorExample();
            InstructorExample.Criteria criteria = instructorExample.createCriteria();
            criteria.andNameEqualTo(username);
            List<Instructor> userList = instructorMapper.selectByExample(instructorExample);
            if (!userList.isEmpty()) {
                return 0;
            } else {
                Instructor instructor = new Instructor();
                instructor.setName(username);
                instructor.setPassword(password);
                instructor.setEmailAdd(email);
                int insertUser = instructorMapper.insertSelective(instructor);

                return insertUser;
            }
        }
    }
    public int repairStudent(String username,String password, String email) {
        if (username.trim() == null || username.trim().equals("")) {//用户名为空
            return 0;
        }
        else {
            StudentExample studentExample = new StudentExample();
            StudentExample.Criteria criteria = studentExample.createCriteria();//构造自定义查询条件
            criteria.andNameEqualTo(username);
            List<Student> userList = studentMapper.selectByExample(studentExample);
            if (userList.isEmpty()) {
                return 0;
            } else {

                Student student = new Student();
                student=userList.get(0);
                student.setEmailAdd(email);
                student.setPassword(password);
                int repairUser = studentMapper.updateByExampleSelective(student,studentExample);

                return repairUser;
            }
        }
    }
}
