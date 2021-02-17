/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service;

import com.spr.mav.dao.impl.IAttendanceHistoryDAO;
import com.spr.mav.model.AttendanceHistory;
import com.spr.mav.service.impl.IAttendanceHistoryService;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zaman
 */

@Service(value = "attendanceHistoryService")
public class AttendanceHistoryService implements IAttendanceHistoryService{

    @Autowired
    IAttendanceHistoryDAO attendanceHistoryDAO;
    
    
    @Override
    public AttendanceHistory save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AttendanceHistory update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AttendanceHistory delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public List<AttendanceHistory> getAll() {
        List<AttendanceHistory> attendanceHistoryList=attendanceHistoryDAO.getAll();
       return attendanceHistoryList;
    }

    
    @Override
    public AttendanceHistory getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    @Override
    public AttendanceHistory saveToAttendaneHistory(HttpServletRequest request) {
        
        Map<String, String[]> requestMap = request.getParameterMap();
         
        String[] empId = (String[]) requestMap.get("empId[]");
         
        String[] empName = (String[]) requestMap.get("empName[]");
        String[] empDep = (String[]) requestMap.get("empDep[]");
        String[] empDeg = (String[]) requestMap.get("empDeg[]");
        
        
        
       
        
        String[] statusSend = (String[]) requestMap.get("statusSend[]");
        
         String[] submissionDate = (String[]) requestMap.get("submissionDate[]");
        String[] submissionTime = (String[]) requestMap.get("submissionTime[]");
        String[] ip = (String[]) requestMap.get("ip[]");
        String[] day = (String[]) requestMap.get("day[]");
       
        
        
        
        AttendanceHistory attendanceHistory;
        
        for(int i = 0; i < empId.length; i++){
            
           attendanceHistory=new AttendanceHistory();
           
           attendanceHistory.setEmpId(Integer.parseInt(empId[i]));
           attendanceHistory.setEmpName(empName[i]);
           attendanceHistory.setEmpDep(empDep[i]);
           attendanceHistory.setEmpDeg(empDeg[i]);
           
           attendanceHistory.setStatusSend(statusSend[i]);
           
           attendanceHistory.setSubmissionDate(submissionDate[i]);
           attendanceHistory.setSubmissionTime(submissionTime[i]);
           attendanceHistory.setIp(ip[i]);
           attendanceHistory.setDay(day[i]);
           attendanceHistoryDAO.save(attendanceHistory);
            
        }
       return null;
    }
    
}
