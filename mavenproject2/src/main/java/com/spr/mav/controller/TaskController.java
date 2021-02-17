
package com.spr.mav.controller;

import com.spr.mav.controller.impl.ITaskController;
import com.spr.mav.model.Task;
import com.spr.mav.service.impl.ITaskService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;




@RestController
public class TaskController implements ITaskController{
    
    
    @Autowired
    ITaskService taskService;

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /////////Save To Task Table//////////
    @Override
    @RequestMapping(value = "/saveTask",method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        taskService.save(request);
       return new ModelAndView("/admin/assignTaskPage");
    }

    
    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    @RequestMapping(value ="/sendFeedback", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
       taskService.colUpdate(request);
       return new ModelAndView("/admin/feedBackPage");
    }

    
    
    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Task> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    @RequestMapping(value ="/showTaskTable")
    public ModelAndView viewTaskTable() {
      List<Task> taskData = taskService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("allTaskData",taskData);
        
      return new ModelAndView("/admin/taskAssignTable","map",map);
        
 }
    
    
    
    //////////////////delete//////////////
    
     @RequestMapping(value = "/deleteT/{id}", method = RequestMethod.GET)
    public ModelAndView tDelete(@PathVariable("id") int id) { 
        taskService.delete(id);
         return  new ModelAndView("/admin/taskAssignTable");
         
         
    }
    
    
    
      /////////////assignTaskPage//////
    
       @RequestMapping(value ="/feedBackPage/{id}", method = RequestMethod.GET)
    public ModelAndView feedBack(ModelMap map, @PathVariable("id") int id) {
        Task task = taskService.getById(id);
        map.addAttribute("task",task);
      return new ModelAndView("/admin/feedBackPage");
        
 }
    
    
    //////////////employeeTaskTable///////
    
     @RequestMapping(value ="/empTaskTable")
    public ModelAndView empTaskTable(HttpServletRequest request) {
        int empId=Integer.parseInt(request.getParameter("empId"));
        
     List<Task> taskDatabyEmp = taskService.getTaskDetails(empId);
     
         System.out.println(taskDatabyEmp);
     
      Map<String,Object> map=new HashMap<String,Object>();
      map.put("taskDatabyEmp",taskDatabyEmp);
        
      return new ModelAndView("/admin/empTaskTable","map",map);
        
 }
    
    
    
    ////////////task details page/////////
   
       @RequestMapping(value ="/taskDetailPage/{id}", method = RequestMethod.GET)
    public ModelAndView taskDetailPage(ModelMap map, @PathVariable("id") int id) {
        Task task = taskService.getById(id);
        map.addAttribute("task",task);
      return new ModelAndView("/admin/taskDetailPage");
        
 }
    
    
    //////////////col/////
    
     @RequestMapping(value ="/updateTask", method = RequestMethod.POST)
    public ModelAndView update2(HttpServletRequest request) {
        
//         int empIdtk=Integer.parseInt(request.getParameter("empId"));
//         model.addAttribute("empIdtk",empIdtk);
       taskService.colUpdate2(request);
       return new ModelAndView("/admin/taskDetailPage");
    }
    
    
    ////////////ProjectReport///////////////
    
    @RequestMapping(value ="/projectReportHit")
    public ModelAndView projectReport() {
      List<Task> taskData = taskService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("allTaskData",taskData);
        
      return new ModelAndView("/admin/projectReport","map",map);
        
 }
    
    
    
    
}
