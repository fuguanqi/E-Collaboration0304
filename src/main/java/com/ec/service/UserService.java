package com.ec.service;

import com.ec.entity.Instructor;
import com.ec.entity.Student;

import java.util.List;

public interface UserService {

    //根据用户名密码找学生
    List<Student> findStudent(String username, String password);
    //根据用户名密码找老师
    List<Instructor> findInstructor(String username, String password);
    //学生注册
    int registerStudent(String username, String password, String email);
    //老师注册
    int registerInstructor(String username, String password, String email);
    int repairStudent(String username,String password,String email);
}
