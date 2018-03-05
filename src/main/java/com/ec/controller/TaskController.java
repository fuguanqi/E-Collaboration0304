package com.ec.controller;

import com.ec.entity.Task;
import com.ec.service.TaskService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskService taskService;
    @RequestMapping("/createTask")
    public void createTask (HttpServletRequest request, String callback,HttpServletResponse response)throws Exception{
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        Integer studentId = Integer.parseInt(request.getParameter("studentId"));
        Integer phaseId = Integer.parseInt(request.getParameter("phaseId"));
        String tTitle = request.getParameter("tTitle");
        tTitle = new String(tTitle.getBytes("iso8859-1"),"utf-8");//解决get请求中文乱码
        String tDescription = request.getParameter("tDescription");
        tDescription = new String(tDescription.getBytes("iso8859-1"),"utf-8");

        String deadline=request.getParameter("deadline");
        int t = taskService.createTask(studentId,phaseId,tTitle,tDescription,deadline);
        if(t!=0) if (callback == null) {
            response.getWriter().print(callback+"("+"{\"state\""+":"+"\"success\"}"+")");
        } else {
            response.getWriter().print(callback+"("+"{\"state\""+":"+"\"success\"}"+")");
        }
        else if (callback == null) {
            response.getWriter().print(callback+"("+"{\"state\""+":"+"\"false\"}"+")");
        } else {
            response.getWriter().print(callback+"("+"{\"state\""+":"+"\"false\"}"+")");
        }
    }


    @RequestMapping("/displayTask")
    public void display(HttpServletRequest request, String callback,HttpServletResponse response)throws Exception {
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        String studentId=request.getParameter("studentId");
        studentId=new String(studentId.getBytes("iso8859-1"),"utf-8");
        int i = Integer.parseInt(studentId);
        List<Task> taskList = taskService.display(i);

        if(taskList.isEmpty()) {
            response.getWriter().print(callback+"("+"{\"state\""+":"+"\"false\"}"+")");
        }else {
            if(callback==null){
                response.getWriter().print(JSONObject.fromObject(taskList.get(0)).toString());//非异域请求
            }else {
                response.getWriter().print(callback+"("+JSONObject.fromObject(taskList.get(0)).toString()+")");
            }
        }
    }

    @RequestMapping("/deleteTask")
    public void delete(HttpServletRequest request, String callback, HttpServletResponse response)throws Exception {
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        String taskId=request.getParameter("taskId");
        String studentId=request.getParameter("studentId");
        taskId=new String(taskId.getBytes("iso8859-1"),"utf-8");
        studentId=new String(studentId.getBytes("iso8859-1"),"utf-8");
        int tid = Integer.parseInt(taskId);
        int sid = Integer.parseInt(studentId);
        int rst = taskService.deleteTask(tid,sid);

        if(rst==-1) {
            response.getWriter().print(callback+"error:ileggal studentId or taskId");
        }
        else if(rst==0){
            response.getWriter().print(callback+"failure:This student has no authority to delete this task.");
        }
        else if(rst==-2) {
            response.getWriter().print(callback+"taskId not exists");
        }
        else {
            response.getWriter().print(callback+"delete success. taskId="+tid);//异域请求要求callback+"("+数据+")"
        }

    }

    @RequestMapping("/displayTaskByProj")
    public void displayByProj(HttpServletRequest request, String callback, HttpServletResponse response)throws Exception {
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        String studentId=request.getParameter("studentId");
        studentId=new String(studentId.getBytes("iso8859-1"),"utf-8");
        String projectId=request.getParameter("ProjectId");
        projectId=new String(projectId.getBytes("iso8859-1"),"utf-8");
        int i = Integer.parseInt(studentId);
        int j=Integer.parseInt(projectId);
        List<Task> taskList = taskService.display(i,j);

        if(taskList.isEmpty()) {
            int x=1;
            response.getWriter().print(callback+"("+"{\"state\""+":"+"\"false\"}"+")");
        }else {
            if(callback==null){
                response.getWriter().print(JSONObject.fromObject(taskList.get(0)).toString());//非异域请求
            }else {
                response.getWriter().print(callback+"("+JSONObject.fromObject(taskList.get(0)).toString()+")");
            }
        }
    }
}
