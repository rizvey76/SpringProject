/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service;

import com.spr.mav.dao.impl.IAttendanceDAO;
import com.spr.mav.model.Attendance;
import com.spr.mav.service.impl.IAttendanceService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zaman
 */

@Service(value = "attendanceService")
public class AttendanceService implements IAttendanceService{
    
    @Autowired
    IAttendanceDAO attendanceDAO;

    
    ///////Save////////
    @Override
    public Attendance save(HttpServletRequest request) {
           //////from other table/////////
        
      int id=Integer.parseInt(request.getParameter("id")); 
      
      int empId=Integer.parseInt(request.getParameter("empId"));
      String empName=request.getParameter("empName");
      String empDep=request.getParameter("empDep");
      String empDeg=request.getParameter("empDeg");
      
      String day=request.getParameter("day");
      String submissionDate=request.getParameter("submissionDate");
      String ip=request.getParameter("ip");
      
      
       SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
         Date date = new Date(); 
         String submissionTime=formatter.format(date);
      
      String statusSend="Present";
      
      
      
      
      Attendance attendanceValue=new Attendance();
      
     
      attendanceValue.setId(id);
      attendanceValue.setEmpId(empId);
      attendanceValue.setEmpName(empName);
      attendanceValue.setEmpDep(empDep);
      attendanceValue.setEmpDeg(empDeg);
      
      attendanceValue.setDay(day);
      attendanceValue.setSubmissionDate(submissionDate);
      attendanceValue.setIp(ip);
      attendanceValue.setSubmissionTime(submissionTime);
      attendanceValue.setStatusSend(statusSend);
      
      return attendanceDAO.update(attendanceValue);
    }

    
    
    
    @Override
    public Attendance update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Attendance delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ////////////getAttendance//////
    @Override
    public List<Attendance> getAll() {
        List<Attendance> attendanceList=attendanceDAO.getAll();
       return attendanceList;
    }

    
    @Override
    public Attendance getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    ///////////////Batch Insert/////////

    @Override
    public Attendance saveToAttendane(HttpServletRequest request) {
         Map<String, String[]> requestMap = request.getParameterMap();
         
        String[] id = (String[]) requestMap.get("id[]"); 
        String[] empId = (String[]) requestMap.get("empId[]");
         
        String[] empName = (String[]) requestMap.get("empName[]");
        String[] empDep = (String[]) requestMap.get("empDep[]");
        String[] empDeg = (String[]) requestMap.get("empDeg[]");
        
        
        
       
        
        String[] statusSend = (String[]) requestMap.get("statusSend[]");
        
        
        
        Attendance attendance;
        
        for(int i = 0; i < empId.length; i++){
            
           attendance=new Attendance();
           
           attendance.setId(Integer.parseInt(id[i]));
           attendance.setEmpId(Integer.parseInt(empId[i]));
           attendance.setEmpName(empName[i]);
           attendance.setEmpDep(empDep[i]);
           attendance.setEmpDeg(empDeg[i]);
           
           attendance.setStatusSend(statusSend[i]);
           
           attendanceDAO.update(attendance);
            
        }
       return null;
    }

    /////////update Attendence/////////
   

    @Override
    public void attendanceUpdate(HttpServletRequest request) {
        int id=Integer.parseInt(request.getParameter("id")); 
      
        int empId=Integer.parseInt(request.getParameter("empId"));
        
        
        String day=request.getParameter("day");
        String submissionDate=request.getParameter("submissionDate");
        String statusSend=request.getParameter("statusSend");
        String ip=request.getParameter("ip");
        
        
        
           SimpleDateFormat formatterTime = new SimpleDateFormat("HH:mm:ss");  
           Date dateTime = new Date(); 
           String submissionTime=formatterTime.format(dateTime);
             
             
           attendanceDAO.attendanceUpdate(id, empId, submissionDate, statusSend, ip, day, submissionTime);
        
        
        
        
        
    }

    ////////////delete Alll//////////
    @Override
    public void deleteAll() {
       attendanceDAO.deleteAll();
    }
    
    
    
}
