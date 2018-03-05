package com.ec.controller;

import com.ec.entity.Participate;
import com.ec.entity.Project;
import com.ec.service.ProjectService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import net.sf.json.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
public class ProjectController {
    @Autowired
    private ProjectService projectService;


    @RequestMapping("/createProject")
    @ResponseBody
    public String createProject(HttpServletRequest request, String callback)throws Exception {
       // String[] strings=request.getParameterValues("conditions");

        String studentName=request.getParameter("studentName");
        studentName=new String(studentName.getBytes("iso8859-1"),"utf-8");

        String instructorName = request.getParameter("instructorName");
        instructorName = new String(instructorName.getBytes("iso8859-1"), "utf-8");
        //解决get请求中文乱码
        String pTitle = request.getParameter("pTitle");
        pTitle = new String(pTitle.getBytes("iso8859-1"), "utf-8");

        String pDescription = request.getParameter("pDescription");
        pDescription = new String(pDescription.getBytes("iso8859-1"), "utf-8");

        int createProject = projectService.createProject(studentName,instructorName, pTitle, pDescription);
        return getString(callback, createProject);
    }


    @NotNull
    private String getString(String callback, int createProject) {
            if(createProject!=0) {
                if(callback == null){
                    return "{\"state\""+":"+"\"success\"}";
                }else {
                    return callback+"("+"{\"state\""+":"+"\"success\"}"+")";
                }
            }else {
                if(callback == null){
                    return "{\"state\""+":"+"\"false\"}";
                }else {
                    return callback+"("+"{\"state\""+":"+"\"false\"}"+")";
                }
            }
        }

    @RequestMapping("/addTeammates")
    @ResponseBody
    public void addTeammates(HttpServletRequest request, String callback, HttpServletResponse response)throws Exception {
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        String studentName1=request.getParameter("studentName1");

        String studentName2=request.getParameter("studentName2");
        String studentName3=request.getParameter("studentName3");

        String projectId=request.getParameter("projectId");
        //projectId=new String(projectId.getBytes("iso8859-1"),"utf-8");
        List<String>studentNames=new ArrayList<String>();
        studentNames.add(studentName1);
        studentNames.add(studentName2);
        studentNames.add(studentName3);
        int i = Integer.parseInt(projectId);
        List<Participate> participates= projectService.addTeammates(studentNames,i);
        if(participates.isEmpty()) {
            int o=9;
            response.getWriter().print(callback+"("+"{\"state\""+":"+"\"false\"}"+")");
        }else {
            if(callback==null) response.getWriter().print(JSONObject.fromObject(participates.get(0)).toString());//非异域请求
            else {
                response.getWriter().print(callback+"("+JSONObject.fromObject(participates.get(0)).toString()+")");//异域请求要求callback+"("+数据+")"
            }
        }
    }
    @RequestMapping("/displayProject")
    public void display(HttpServletRequest request, String callback, HttpServletResponse response)throws Exception {
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        String studentId=request.getParameter("studentId");
        studentId=new String(studentId.getBytes("iso8859-1"),"utf-8");
        int i = Integer.parseInt(studentId);
        List<Project> projectList = projectService.displayProject(i);

        if(projectList.isEmpty()) {
            response.getWriter().print(callback+"("+"{\"state\""+":"+"\"false\"}"+")");
        }else {
            if(callback==null) response.getWriter().print(JSONObject.fromObject(projectList.get(0)).toString());//非异域请求
            else {
                response.getWriter().print(callback+"("+JSONObject.fromObject(projectList.get(0)).toString()+")");//异域请求要求callback+"("+数据+")"
            }
        }
    }

    @RequestMapping("/repairProject")
    @ResponseBody
    public  String repairProject(HttpServletRequest request, String callback, HttpServletResponse response)throws Exception{

        String pTitle = request.getParameter("pTitle");
        //pTitle = new String(pTitle.getBytes("iso8859-1"), "utf-8");

        String pDescription = request.getParameter("pDescription");
        //pDescription = new String(pDescription.getBytes("iso8859-1"), "utf-8");

        int repairProject= projectService.repairProject(pTitle, pDescription);
        return getString(callback, repairProject);
    }

    @RequestMapping("/deleteProject")
    public void deletePj(HttpServletRequest request, String callback, HttpServletResponse response)throws Exception {
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        String projectId=request.getParameter("projectId");
        String studentId=request.getParameter("studentId");
        projectId=new String(projectId.getBytes("iso8859-1"),"utf-8");
        studentId=new String(studentId.getBytes("iso8859-1"),"utf-8");
        int pid = Integer.parseInt(projectId);
        int sid = Integer.parseInt(studentId);
        int rst = projectService.deleteProjectById(pid,sid);

        if(rst==-1) {
            response.getWriter().print(callback+"error:ileggal studentId or projectId");
        }
        else if(rst==0){
            response.getWriter().print(callback+"failure:This student has no authority to delete this project.");
        }
        else if(rst==-2){
            response.getWriter().print(callback+"failure:This project still has phases or tasks.");
        }
        else   {
            if(callback==null) response.getWriter().print("delete success. projectId="+pid);//非异域请求
            else {
                response.getWriter().print(callback+"delete success. projectId="+pid);//异域请求要求callback+"("+数据+")"
            }
        }
    }

}
