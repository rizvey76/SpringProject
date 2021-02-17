/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Faculty Pc
 */

@RestController
public class IndexController {
    
    
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
    
    
//    AdminLog
    
     @RequestMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("/admin/login");
    }
    
    // employeeLog
     @RequestMapping("/employeeLog")
    public ModelAndView emplogin(){
        return new ModelAndView("/admin/employeeLog");
    }
    
    
    //Adminreg
     @RequestMapping("/adminreg")
    public ModelAndView adminreg(){
        return new ModelAndView("/admin/adminreg");
    }
    
    //AdminPage
    
//      @RequestMapping("/myAdmin")
//    public ModelAndView myAdmin(){
//        return new ModelAndView("/admin/myAdmin");
//    }
    

    
    
    //EmployeeData
    
    @RequestMapping("/employeeData")
    public ModelAndView adminDashBoard(){
        return new ModelAndView("/admin/employeeData");
    }
    
    
    
    
    
   
    
    
    
    
    //leaveData
    @RequestMapping("/leaveData")
    public ModelAndView leaveData(){
        return new ModelAndView("/admin/leaveData");
    }
    
    
    //taskData
            
    @RequestMapping("/taskData")
    public ModelAndView taskData(){
        return new ModelAndView("/admin/taskData");
    }
    
    
    //projectData
    @RequestMapping("/projectData")
    public ModelAndView projectData(){
        return new ModelAndView("/admin/projectData");
    }
    
    
    
     //leaveData
    @RequestMapping("/taskAssign")
    public ModelAndView taskAssign(){
        return new ModelAndView("/admin/taskAssign");
    }
    
    
   
    /////Reports
     @RequestMapping("/reports")
    public ModelAndView reports(){
        return new ModelAndView("/admin/empReports");
    }
    
    
    
    ////////////AdminLog///////
    
    @RequestMapping("/myAdmin")
    public ModelAndView DashBoard(HttpServletRequest request) {
        String adminemail = request.getParameter("adminemail");
        String adminpassword = request.getParameter("adminpassword");
        String companycode = request.getParameter("companycode");
        Map<String, Object> map = new HashMap<String, Object>();
        if (adminemail.equalsIgnoreCase("admin@gmail.com") && adminpassword.equalsIgnoreCase("1234") && companycode.equalsIgnoreCase("100")) {
            return new ModelAndView("/admin/myAdmin");
        } else {
            map.put("status", "Inputed values not matched!");
            return new ModelAndView("/admin/login", "map", map);
        }
    }
    
    
    
    /////////EmployeeDash//////
       @RequestMapping("/dashBoard")
    public ModelAndView dash(){
        return new ModelAndView("/admin/employeeDash");
    }
    
    
    
    
//    
//    @RequestMapping("/dashBoard")
//    public ModelAndView dashBoard(){
//        return new ModelAndView("/admin/employeeDash");
//    }
//    
    
    ///////Employee Dashboard////////
    
//    @RequestMapping("/employeeDash")
//    public ModelAndView library(){
//        return new ModelAndView("/admin/employeeDash");
//    }
//    
    
    
    
    
//    @RequestMapping("/emplev")
//    public ModelAndView notice(){
//        return new ModelAndView("/admin/empleave");
//    }
}
