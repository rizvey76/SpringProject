/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.controller;

import com.spr.mav.controller.impl.ILeaveController;
import com.spr.mav.model.Leave;
import com.spr.mav.model.Salary;
import com.spr.mav.service.impl.ILeaveService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author zaman
 */
@RestController
public class LeaveController implements ILeaveController {
    
     @Autowired
    ILeaveService leaveService;

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //////save leave details///////
    @Override
    @RequestMapping(value ="/savele",method = RequestMethod.POST )
    public ModelAndView save(HttpServletRequest request) {
      leaveService.save(request);
        
        return new ModelAndView("/admin/empleave");
      
    }
    
    /////////return//////
       @RequestMapping(value ="/saveleaveData",method = RequestMethod.POST )
    public ModelAndView save1(HttpServletRequest request,Model model) {
        
        int empIdv=Integer.parseInt(request.getParameter("empId"));
        model.addAttribute("empIdv",empIdv);
      leaveService.save(request);
        
        return new ModelAndView("/admin/empleave");
      
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
    public List<Leave> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
        ///////To Show Data from Leave Table//////
    
     @RequestMapping(value ="/showLeaveData")
    public ModelAndView viewleave() {
      List<Leave> leaveData = leaveService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("allLeaveData",leaveData);
        
      return new ModelAndView("/admin/leaveDataTab","map",map);
        
 }
    
    
    
    
//    ////////////Admin Leave////////////////
////        @RequestMapping(value ="/leaveD")
////    public ModelAndView leaveDe() {
//////      List<Employee> emps = employeeService.getAll();
//////      
//////     Map<String,Object> map=new HashMap<String,Object>();
//////       map.put("employees",emps);
//////        
//////      return new ModelAndView("/admin/empView","map",map);
////      return new ModelAndView("/admin/leaveDetails");
////        
////      
//        
//        
//    }
    
    
    
     /////toSelect send leave data//////
    
    
    @RequestMapping(value = "/leaveD/{id}", method = RequestMethod.GET)
    public ModelAndView selectLeaveData(ModelMap map, @PathVariable("id") int id) {
        Leave lv = leaveService.getById(id);
        map.addAttribute("lv",lv);
        return  new ModelAndView("/admin/leaveDetails");
        
        
    }
    
    
    
    
    
    
//     @RequestMapping(value = "/select/{id}", method = RequestMethod.GET)
//    public ModelAndView select(ModelMap map, @PathVariable("id") int id) {
//        Employee em = employeeService.getById(id);
//        map.addAttribute("em",em);
//        return  new ModelAndView("/admin/employeeDataUpdate1");
//    }
    
    
    /////////////////////save Leave data from Admin////////////////////////
    
    
      @RequestMapping(value = "/saveLevDataformAd",method = RequestMethod.POST)
    public ModelAndView adminLevDataSave(HttpServletRequest request) {
        leaveService.adminLevDataSave(request);
        
//        System.out.println(request.getParameter("id"));
//         System.out.println(request.getParameter("empId")); 
//         System.out.println(request.getParameter("empName"));
//          System.out.println(request.getParameter("empDep"));
//         System.out.println(request.getParameter("empDeg")); 
//         System.out.println(request.getParameter("bSalary"));
         
         
        
          
          
         
        return new ModelAndView("/admin/leaveDetails");
    }
    
    
    
    
         ///////To Show Data from Leave Table//////
    
    
    
    
    
     @RequestMapping(value ="/showHistoryData")
    public ModelAndView leaveHistoryData(@RequestParam("empId") int empId,Model model) {
        
//         int empIdv=Integer.parseInt(request.getParameter("empId"));
        model.addAttribute("empIdvs",empId);
      List<Leave> leaveData = leaveService.getLeaveHistory(empId);
      
//      for(Leave leaveHi:leaveData){
//          System.out.println(leaveHi.getReqDays());
//           System.out.println(leaveHi.getActionStatus()); 
//           System.out.println(leaveHi.getLevReason());
//            System.out.println(leaveHi.getLevType());
//             System.out.println(leaveHi.getSubDate());
//           
//          
//      }
      
      //     return new ModelAndView("/admin/empleave");
      
       Map<String,Object> map= new HashMap<String,Object>();
       map.put("leaveData",leaveData);
        
      return new ModelAndView("/admin/leaveHistoryTable","map",map);

 }
    
    //////////////LeaveReport///////////
    
        
     @RequestMapping(value ="/leaveReportHit")
    public ModelAndView leaveReport() {
      List<Leave> leaveData = leaveService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("allLeaveData",leaveData);
        
      return new ModelAndView("/admin/leaveReport","map",map);
        
 }
    
    
    
    
}
