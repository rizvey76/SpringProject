/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service;

import com.spr.mav.dao.impl.ILeaveDAO;
import com.spr.mav.model.Leave;
import com.spr.mav.service.impl.ILeaveService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zaman
 */


@Service(value = "leaveService")
public class LeaveService implements ILeaveService {
    
   @Autowired
    ILeaveDAO leaveDAO;

     
     
     
   /////////Leave Data Save////////
    @Override
    public Leave save(HttpServletRequest request) {
        
         
           
          
        //////from other table/////////
      int empId=Integer.parseInt(request.getParameter("empId"));
      String empName=request.getParameter("empName");
      String empDep=request.getParameter("empDep");
      String empDeg=request.getParameter("empDeg");
      
      //////Local Date ///////
      
//      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
//   LocalDateTime now = LocalDateTime.now();  
//   System.out.println(dtf.format(now)); 
      
      
      
      ////from Employee table/////
        String fromDate=request.getParameter("fromDate");
        String toDate=request.getParameter("toDate");
//         int reqDays=Integer.parseInt(request.getParameter("reqDays"));
         String levType=request.getParameter("levType");
        
         String levReason=request.getParameter("levReason");
         
         
         
         final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
          LocalDate now = LocalDate.now();
         
          
          
          
          String subDate=formatter.format(now);
          
          
          
          
          final LocalDate fromDate1 = LocalDate.parse(request.getParameter("fromDate"),formatter);
          final LocalDate toDate2= LocalDate.parse(request.getParameter("toDate"),formatter);
         
           long days = ChronoUnit.DAYS.between(fromDate1,toDate2);
            int reqDays=(int)days;
         
         
         
         
//         System.out.println(fromDate);
//         System.out.println(toDate);
//         System.out.println(reqDays);
//         System.out.println(levType);
//         System.out.println(levReason);
         
       
            
     String changeStatus="Not Seen";       
       
      Leave leave=new Leave();
      
      leave.setChangeStatus(changeStatus);
      
      leave.setFromDate(fromDate);
      leave.setToDate(toDate);
      leave.setReqDays(reqDays);
      //////////////////Submission///////////
      leave.setSubDate(subDate);
     
      leave.setLevType(levType);
      leave.setLevReason(levReason);
      
      
      //////////////////////
      leave.setEmpId(empId);
      leave.setEmpName(empName);
      leave.setEmpDep(empDep);
      leave.setEmpDeg(empDeg);
       
//      leave.setId(id);
//      leave.setFromDate(fromDate);
//      leave.setToDate(toDate);
//      leave.setReqDays(reqDays);
//      leave.setLevReason(levReason);
//      leave.setLevType(levType);
     
       
//       return leaveDAO.save(leave);
         return leaveDAO.save(leave);
        
    }

    
    
    
    
    
    @Override
    public Leave update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Leave delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //////////fatch data/////////////
    @Override
    public List<Leave> getAll() {
        List<Leave> levList=leaveDAO.getAll();
       return levList;
    }

    
    ///////get individual data///////////////
    @Override
    public Leave getById(int id) {
       return leaveDAO.getById(id);
    }

    
    
    
    
    
    
    
    ////////////LevDataSaveFromAdmin///////
    @Override
    public Leave adminLevDataSave(HttpServletRequest request) {
         int empId=Integer.parseInt(request.getParameter("empId"));
      String empName=request.getParameter("empName");
      String empDep=request.getParameter("empDep");
      String empDeg=request.getParameter("empDeg");
      //////////////////////////////////////////////////
       String fromDate=request.getParameter("fromDate");
        String toDate=request.getParameter("toDate");
        
         String levType=request.getParameter("levType");
        
         String levReason=request.getParameter("levReason");
         
          String changeStatus="Seen"; 
          
           String subDate=request.getParameter("subDate");
           
            int reqDays=Integer.parseInt(request.getParameter("reqDays"));
        
        /////////////////////////////////////////////////
         int id=Integer.parseInt(request.getParameter("id"));
         int approvDays=Integer.parseInt(request.getParameter("approvDays"));
         String actionStatus=request.getParameter("actionStatus");
      
         Leave leaveAddata=new Leave();
         
         leaveAddata.setId(id);
         leaveAddata.setEmpId(empId);
         leaveAddata.setEmpName(empName);
         leaveAddata.setEmpDep(empDep);
         leaveAddata.setEmpDeg(empDeg);
         leaveAddata.setFromDate(fromDate);
         leaveAddata.setToDate(toDate);
         leaveAddata.setLevType(levType);
         leaveAddata.setLevReason(levReason);
         leaveAddata.setChangeStatus(changeStatus);
         leaveAddata.setSubDate(subDate);
         leaveAddata.setReqDays(reqDays);
         leaveAddata.setApprovDays(approvDays);
         leaveAddata.setActionStatus(actionStatus);
         
         return leaveDAO.update(leaveAddata);
        
    }

    /////getLeave History////////
    @Override
    public List<Leave> getLeaveHistory(int empId) {
        return leaveDAO.getLeaveHistory(empId);
    }
    
}
