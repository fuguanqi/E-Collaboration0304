package com.ec.controller;


import com.ec.service.PhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@CrossOrigin
public class PhaseController {

    @Autowired
    private PhaseService phaseService;
    //登陆
    @RequestMapping("/createPhase")
    @ResponseBody
    public String createPhase (HttpServletRequest request, String callback)throws Exception{
        Integer studentId = Integer.parseInt(request.getParameter("studentId"));
        Integer projectId = Integer.parseInt(request.getParameter("projectId"));
        String phTitle = request.getParameter("phTitle");
        phTitle = new String(phTitle.getBytes("iso8859-1"),"utf-8");//解决get请求中文乱码
        String phDescription = request.getParameter("phDescription");
        phDescription = new String(phDescription.getBytes("iso8859-1"),"utf-8");

        int f = phaseService.createPhase(studentId,projectId,phTitle,phDescription);
        if(f!=0) {
            int a=0;
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

    @RequestMapping("/deletePhase")
    public void deletePhs(HttpServletRequest request, String callback, HttpServletResponse response)throws Exception {
        response.setHeader("Content-type", "text/html;charset=UTF-8");//解决response乱码
        String phaseId=request.getParameter("phaseId");
        String studentId=request.getParameter("studentId");
        phaseId=new String(phaseId.getBytes("iso8859-1"),"utf-8");
        studentId=new String(studentId.getBytes("iso8859-1"),"utf-8");
        int phid = Integer.parseInt(phaseId);
        int sid = Integer.parseInt(studentId);
        int rst = phaseService.deletePhaseById(phid,sid);

        if(rst==-1) {
            response.getWriter().print(callback+"error:ileggal studentId or phaseId");
        }
        else if(rst==0){
            response.getWriter().print(callback+"failure:This student has no authority to delete this phase.");
        }
        else if(rst==-2) {
            response.getWriter().print(callback+"phaseId not exists");
        }
        else {
            response.getWriter().print(callback+"delete success. phaseId="+phaseId);//异域请求要求callback+"("+数据+")"
        }
    }

}
