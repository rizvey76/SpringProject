/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service;

import com.spr.mav.dao.impl.ITaskDAO;
import com.spr.mav.model.Task;
import com.spr.mav.service.impl.ITaskService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zaman
 */

@Service(value = "taskService")
public class TaskService implements ITaskService{
    
    
    @Autowired
    ITaskDAO taskDAO;

    ///////SaveToTaskTable///////
    @Override
    public Task save(HttpServletRequest request) {
//        int id=Integer.parseInt(request.getParameter("id"));
         
        int empId=Integer.parseInt(request.getParameter("empId"));
        String empName=request.getParameter("empName");
        String empDep=request.getParameter("empDep");
        String empDeg=request.getParameter("empDeg");
        
        
        String taskId=request.getParameter("taskId");
        String taskName=request.getParameter("taskName");
        String description=request.getParameter("description");
        
        String startDate=request.getParameter("startDate");
        String estmDate=request.getParameter("estmDate");
        String status=request.getParameter("status");
        String note=request.getParameter("note");
        
        
        
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
          LocalDate now = LocalDate.now();
         
          
          
          
          String assignDate=formatter.format(now);
        
        
        Task taskSave=new Task();
        
//        taskSave.setId(id);
        
        taskSave.setEmpId(empId);
        
        taskSave.setEmpName(empName);
        
        taskSave.setEmpDep(empDep);
        
        taskSave.setEmpDeg(empDeg);
        
        taskSave.setTaskId(taskId);
        
        taskSave.setTaskName(taskName);
        
        taskSave.setDescription(description);
        
        taskSave.setStartDate(startDate);
        
        taskSave.setEstmDate(estmDate);
        
        taskSave.setAssignDate(assignDate);
        
        taskSave.setStatus(status);
        
        taskSave.setNote(note);
        
        return taskDAO.update(taskSave);
        
        
        
        
        
        
    }

    
    @Override
    public Task update(HttpServletRequest request) {
        int id =Integer.parseInt(request.getParameter("id"));
         String empMessageDate = request.getParameter("empMessageDate");
         
         Task task=new Task();
         task.setId(id);
         task.setEmpMessageDate(empMessageDate);
         
         return taskDAO.update(task);
    }

    
    
    @Override
    public Task delete(int id) {
        return taskDAO.delete(id);
    }

    @Override
    public List<Task> getAll() {
        List<Task> tasklist=taskDAO.getAll();
       return tasklist;
    }

    
    @Override
    public Task getById(int id) {
       return taskDAO.getById(id);
    }

    @Override
    public void colUpdate(HttpServletRequest request) {
         int id =Integer.parseInt(request.getParameter("id"));
         String empMessageDate = request.getParameter("empMessageDate");
         
         taskDAO.colUpdate(id, empMessageDate);
    }

    ////////employeeTaskData//////
    @Override
    public List<Task> getTaskDetails(int empId) {
        return taskDAO.getTaskDetails(empId);
    }
    
    
    
    @Override
    public void colUpdate2(HttpServletRequest request) {
         int id =Integer.parseInt(request.getParameter("id"));
         String taskStatus = request.getParameter("taskStatus");
         
         String status="Seen";
         
         taskDAO.colUpdate2(id,taskStatus,status);
    }
    
    
}
