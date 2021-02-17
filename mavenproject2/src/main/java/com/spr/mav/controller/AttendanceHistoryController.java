/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.spr.mav.controller.impl.IAttendanceHistoryController;
import com.spr.mav.model.AttendanceHistory;
import com.spr.mav.service.impl.IAttendanceHistoryService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author zaman
 */

@RestController
public class AttendanceHistoryController implements IAttendanceHistoryController{
    
    @Autowired
    IAttendanceHistoryService attendanceHistoryService;

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public List<AttendanceHistory> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
      /////////////////Batch Insert////////
    @RequestMapping(value ="/insertToHistory",method = RequestMethod.POST )
    public ModelAndView batchInsert(HttpServletRequest request) {
        
        attendanceHistoryService.saveToAttendaneHistory(request);
        
        
        return new ModelAndView("/admin/attendanceDataTableHistory");
    }
    
    
    //////////////////////////////////////////////////////////////////////
    
     @RequestMapping(value ="/showHistoryAttendanceData")
      public ModelAndView viewAttendanceHistory() {
      List<AttendanceHistory> attendanceHistoryData = attendanceHistoryService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("attendanceHistoryData",attendanceHistoryData);
        
      return new ModelAndView("/admin/attendanceDataTableHistory","map",map);
        
 }
      
      
      ////////////////JSON//////////////
      
     
      
    @RequestMapping(value = "/getAllAttendanceHistoryData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllEmployees() {
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        List<AttendanceHistory> e = attendanceHistoryService.getAll();
//        for (AttendanceHistory e1 : e) {
//          System.out.println(e1.getName());
//        }
        return g.toJson(e);
    }
    
    
    
     @RequestMapping("/gsonData")
    public ModelAndView login(){
        return new ModelAndView("/admin/attendanceDataTableHistoryTest");
    }
    
    /////////////////AttendanceReport////////
    
     @RequestMapping(value ="/attendanceReportHit")
      public ModelAndView attendanceReprt() {
      List<AttendanceHistory> attendanceHistoryData = attendanceHistoryService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("attendanceHistoryData",attendanceHistoryData);
        
      return new ModelAndView("/admin/attendanceReport","map",map);
        
 }
    
}
