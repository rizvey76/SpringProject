/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.controller;

import com.spr.mav.controller.impl.IAttendanceController;
import com.spr.mav.model.Attendance;
import com.spr.mav.service.impl.IAttendanceService;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author zaman
 */


@RestController
public class AttendanceController implements IAttendanceController{
    
    @Autowired
    IAttendanceService attendanceService;

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    //////Save Attendance//////
    @Override
    @RequestMapping(value ="/saveAttendance",method = RequestMethod.POST )
    public ModelAndView save(HttpServletRequest request) {
        
        attendanceService.save(request);
        return new ModelAndView("/admin/empAttendance");
    }
    
    
    
    
    

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Attendance> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    //////////////////MyMethod to dispaly////////
    
    
     @RequestMapping(path="/forDateTime")
    public ModelAndView deductionT(Model model) throws UnknownHostException{
            
         Calendar calendar = Calendar.getInstance();
         Date date = calendar.getTime();
        
         String day= new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
       
         System.out.println(day);
       
         model.addAttribute("day",day);
          ///////////////////////Date Provider/////////////////
         
         final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         LocalDate now = LocalDate.now();
         
          
          
          
          String submissionDate=formatter.format(now);
          
          model.addAttribute("submissionDate",submissionDate);
          
          /////////////////////////Ip Address////////////
          InetAddress myIP=InetAddress.getLocalHost();
          String ip= myIP.getHostAddress();
          
          model.addAttribute("ip",ip);
          
          
          ///////////Time Show/////////
          
//         SimpleDateFormat formatterTime = new SimpleDateFormat("HH:mm:ss");  
//         Date dateTime = new Date(); 
//         String submissionTime=formatterTime.format(dateTime);
//         
//         System.out.println(submissionTime);
//         model.addAttribute("submissionTime",submissionTime);
        

         
        
        
        return new ModelAndView("/admin/empAttendance");
    }
    
    
    
    
    
    
    /////////////////Batch Insert////////
    @RequestMapping(value ="/batchInsertToAttendance",method = RequestMethod.POST )
    public ModelAndView batchInsert(HttpServletRequest request,Model model) {
        
        attendanceService.saveToAttendane(request);
        
        
        //////////////////////////////////////////////////
         Calendar calendar = Calendar.getInstance();
         Date date = calendar.getTime();
        
         String day= new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
       
         System.out.println(day);
       
         model.addAttribute("day",day);
         
         //////////////////////////////////////////////////
         final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         LocalDate now = LocalDate.now();
         
          
          
          
          String submissionDate=formatter.format(now);
          
          model.addAttribute("submissionDate",submissionDate);
         
         
        
        
        
        
        
        
        return new ModelAndView("/admin/attendanceDataTable");
    }
    
    
    
    
    
    
    
    
    /////////////////Attendance Update///////
    
    @RequestMapping(value ="/saveAttendanceData",method = RequestMethod.POST )
     public ModelAndView attendanceUpdate(HttpServletRequest request,Model model){
         
          int empIda=Integer.parseInt(request.getParameter("empId"));
          String empNames=request.getParameter(request.getParameter("empName"));
          model.addAttribute("empIda",empIda);
          model.addAttribute("empNames",empNames);
         attendanceService.attendanceUpdate(request);
       
         return new ModelAndView("/admin/empAttendance");
     }
     
     
     /////////////////////attendence Data to admin//////////
     
        @RequestMapping(value ="/showAttendanceData")
      public ModelAndView viewAttendance(Model model) {
          
          
         Calendar calendar = Calendar.getInstance();
         Date date = calendar.getTime();
        
         String day= new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
       
         System.out.println(day);
       
         model.addAttribute("day1",day);
          ///////////////////////Date Provider/////////////////
         
         final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         LocalDate now = LocalDate.now();
         
          
          
          
          String submissionDate=formatter.format(now);
          
          model.addAttribute("submissionDate1",submissionDate);
          
          
          
      List<Attendance> attendanceData = attendanceService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("attendanceData",attendanceData);
        
      return new ModelAndView("/admin/attendanceDataTable","map",map);
        
 }
      
      
      
      ////////////delete all/////
     @RequestMapping(value ="/deleteAttendanceData")
      public ModelAndView deleteAttendance() {
      attendanceService.deleteAll();
        
      return new ModelAndView("/admin/attendanceDataTable");
        
 }

    
}
