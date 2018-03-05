package com.ec.controller;


import com.ec.entity.Instructor;
import com.ec.entity.Student;
import com.ec.service.UserService;
import net.sf.json.JSONObject;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;
    //登陆
    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response, String callback)throws Exception{

        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码

        String username = request.getParameter("username");
       username = new String(username.getBytes("iso8859-1"),"utf-8");//解决get请求中文乱码
        String password = request.getParameter("password");
       password = new String(password.getBytes("iso8859-1"),"utf-8");
        String isStudent = request.getParameter("isStudent");
        isStudent = new String(isStudent.getBytes("iso8859-1"),"utf-8");

       System.out.println(username+":"+password+":"+isStudent);//参数测试

        if(isStudent.equals("true")){//学生登陆
            List<Student> studentList = userService.findStudent(username, password);

            //JSONArray.fromObject(对象)  数组和list
            //JSONObject.formObject(对象) bean和map

            if(studentList.isEmpty()) {
                response.getWriter().print(callback+"("+"{\"state\""+":"+"\"false\"}"+")");
            }else {
                if(callback==null){
                    response.getWriter().print(JSONObject.fromObject(studentList.get(0)).toString());//非异域请求
                }else {
                    System.out.println(JSONObject.fromObject(studentList.get(0)).toString());
                    response.getWriter().print(callback+"("+JSONObject.fromObject(studentList.get(0)).toString()+")");//异域请求要求callback+"("+数据+")"
                }
            }
        }else {//老师登陆
            List<Instructor> instructorList= userService.findInstructor(username,password);

            if(instructorList.isEmpty()){
                response.getWriter().print(callback+"("+"{\"state\""+":"+"\"false\"}"+")");
            }else {
                if (callback == null) {
                    response.getWriter().print(JSONObject.fromObject(instructorList.get(0)).toString());//非异域请求
                } else {
                    String s="";
                    response.getWriter().print(callback + "(" + JSONObject.fromObject(instructorList.get(0)).toString()+")");
                }
            }


        }
    }


    @RequestMapping("/register")
    public String register(HttpServletRequest request, String callback,HttpServletResponse response)throws Exception{
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        String username = request.getParameter("username");
        username = new String(username.getBytes("iso8859-1"),"utf-8");//解决get请求中文乱码
        String password = request.getParameter("password");
        password = new String(password.getBytes("iso8859-1"),"utf-8");
        String email = request.getParameter("email");
        email = new String(email.getBytes("iso8859-1"),"utf-8");
        String isStudent = request.getParameter("isStudent");
        isStudent = new String(isStudent.getBytes("iso8859-1"),"utf-8");

        if(isStudent.equals("true")){//学生注册
            int registerUser = userService.registerStudent(username, password,email);
            return getString(callback, registerUser);
        }else{//老师注册
            int registerUser = userService.registerInstructor(username, password,email);
            return getString(callback, registerUser);
        }
    }
    @RequestMapping("/repair")
    public String  repairStudent(HttpServletRequest request, String callback,HttpServletResponse response)throws Exception{
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        String username = request.getParameter("username");
        //username = new String(username.getBytes("iso8859-1"),"utf-8");//解决get请求中文乱码
        String password = request.getParameter("password");
        // password = new String(password.getBytes("iso8859-1"),"utf-8");
        String email = request.getParameter("email");
        // email = new String(email.getBytes("iso8859-1"),"utf-8");
        int repairStudent = userService.repairStudent(username,password,email);
        return getString(callback, repairStudent);
    }
    @NotNull
    private String getString(String callback, int registerUser) {
        if(registerUser!=0) {
            if(callback == null){
                return "{\"state\""+":"+"\"success\"}";
            }else {
                return callback+"("+"{\"state\""+":"+"\"success\"}"+")";
            }
        }else if (callback == null) {
            return "{\"state\"" + ":" + "\"false\"}";
        } else {
            return callback + "(" + "{\"state\"" + ":" + "\"false\"}" + ")";
        }
    }
}
