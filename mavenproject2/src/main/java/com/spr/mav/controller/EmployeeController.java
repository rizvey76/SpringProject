
package com.spr.mav.controller;

import com.spr.mav.controller.impl.IEmployeeController;
import com.spr.mav.dao.impl.IEmployeeDAO;
import com.spr.mav.model.Employee;
import com.spr.mav.service.impl.IEmployeeService;
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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class EmployeeController implements IEmployeeController {
     @Autowired
      IEmployeeService employeeService;
     
      @Autowired
       IEmployeeDAO employeeDAO;

    @Override
    public String getAllEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
   
     @RequestMapping(value ="/save", method = RequestMethod.POST)
      public ModelAndView save(HttpServletRequest request,Model model) {
          
          String msg="Data Save";
      employeeService.save(request);
      System.out.println("hello");
      
      model.addAttribute("msg",msg);
      return new ModelAndView("/admin/employeeData");
    }
    
    
    
    
    
    
    

    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
//    @RequestMapping(value ="/empUpdate", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
//        employeeService.update(request);
        return  new ModelAndView("");
    }

    
    
    
    
    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
//    New Generated Method
    
    
     @RequestMapping(value ="/empVi")
    public ModelAndView viewEmp() {
      List<Employee> emps = employeeService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("employees",emps);
        
      return new ModelAndView("/admin/empView1","map",map);
        
 }
    
    
  
    
    
    
    
    
    
    //new
    
       @RequestMapping(value ="/empVi2")
    public ModelAndView view() {
      List<Employee> emps = employeeService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("employees",emps);
        
      return new ModelAndView("/admin/salaryDataInsert","map",map);
        
 }
    
    

    
    
    
    
    
    
    
    
    
    
    
    //////empAction///
    
    
       @RequestMapping(value ="/empAction")
    public ModelAndView empAction() {
      List<Employee> emps = employeeService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("employees",emps);
        
      return new ModelAndView("/admin/employeeDataUpdate1","map",map);
        
       
        
 }
    
    
    
    ////select/////
    
    @RequestMapping(value = "/select/{id}", method = RequestMethod.GET)
    public ModelAndView select(ModelMap map, @PathVariable("id") int id) {
        Employee em = employeeService.getById(id);
        map.addAttribute("em",em);
        return  new ModelAndView("/admin/employeeDataUpdate1");
    }
    
    
    
    @RequestMapping(value = "/selectToSalary/{id}", method = RequestMethod.GET)
    public ModelAndView selectS(ModelMap map, @PathVariable("id") int id) {
        Employee em = employeeService.getById(id);
        map.addAttribute("em",em);
        return  new ModelAndView("/admin/salaryDataInsert");
    }
    
    
    
    ////delete/////
    
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView eDelete(@PathVariable("id") int id) { 
        employeeService.delete(id);
         return  new ModelAndView("/admin/employeeDataUpdate1");
    }
    
    
    
    ////update/////
    
    @RequestMapping(value ="/empUpdate", method = RequestMethod.POST)
    public ModelAndView eupdate(HttpServletRequest request) {
        employeeService.update(request);
        System.out.println("Employee Id: "+request.getParameter("empId"));
        
        
        
        
        
        
        
        return  new ModelAndView("/admin/employeeDataUpdate1");
    }
    
    
    
    
          ///////To Show Data from Leave Table//////
//    
//     @RequestMapping(value ="/showGroupWiseData")
//    public ModelAndView employeeGroupData(@RequestParam("empDep") String empDep) {
//      List<Employee> leaveData = leaveService.getLeaveHistory(empId);
//      
////      for(Leave leaveHi:leaveData){
////          System.out.println(leaveHi.getReqDays());
////           System.out.println(leaveHi.getActionStatus()); 
////           System.out.println(leaveHi.getLevReason());
////            System.out.println(leaveHi.getLevType());
////             System.out.println(leaveHi.getSubDate());
////           
////          
////      }
//      
//      //     return new ModelAndView("/admin/empleave");
//      
//       Map<String,Object> map= new HashMap<String,Object>();
//       map.put("leaveData",leaveData);
//        
//      return new ModelAndView("/admin/leaveHistoryTable","map",map);
//
// }
    
    
    
    
    
    
    /////////////employee data for attendence///////////
     @RequestMapping("/attendanceData")
    public ModelAndView empData(){
        
         List<Employee> emps = employeeService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("emps",emps);
       
        
        return new ModelAndView("/admin/attendanceData","map",map);
    }
    
    
//    ///////////////////////employee data show/////////
//    
//    @RequestMapping("/attendanceDataTab")
//    public ModelAndView empDataShow(){
//        
//        List<Employee> emps = employeeService.getAll();
//      
//       Map<String,Object> map=new HashMap<String,Object>();
//       map.put("employees",emps);
//       
//        
//        return new ModelAndView("/admin/attendanceDataTab","map",map);
//    }
    
    
    
    
    //////////////////Employee catch/////////
    
    @RequestMapping("/employeeDash")
    public ModelAndView empDataSearch2(@RequestParam("empId") int empId,Model model) {
       

        
        
        List<Employee> empList=employeeService.getEmployeeDetails(empId);
        
        for(Employee empData:empList){
            System.out.println(empData.getEmpName());
            System.out.println(empData.getEmpDeg());
            System.out.println(empData.getEmpDep());
           
            
            String empName=empData.getEmpName();
            int id=empData.getId();
            
            int empIdp=empData.getEmpId();
            
            model.addAttribute("empName",empName);
            
            model.addAttribute("empIdp",empIdp);
            
            
            
        }
        

       
        return new ModelAndView("/admin/employeeDash");
    }
    
    
    
    
   //////getEmployeeDetailsInAttendencePage//////
    
    
     @RequestMapping("/empAttendance")
    public ModelAndView attendanceSearch(@RequestParam("empId") int empId,Model model) throws UnknownHostException {
       

        
        
        List<Employee> sList=employeeService.getEmployeeDetails(empId);
        
        for(Employee empData:sList){
            System.out.println(empData.getEmpName());
            System.out.println(empData.getEmpDeg());
            System.out.println(empData.getEmpDep());
            System.out.println(empData.getId());
            
            String empName=empData.getEmpName();
            String empDep=empData.getEmpDep();
            String empDeg=empData.getEmpDeg();
            int empIdp=empData.getEmpId();
            
            int id=empData.getId();
            
            
            model.addAttribute("id",id);
            
            model.addAttribute("empName",empName);
            model.addAttribute("empDep",empDep);
            model.addAttribute("empDeg",empDeg);
            model.addAttribute("empIdp",empIdp);
            
            
            
             //////////////////new//////////////////////////////
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
            
//            
//            
//            
//        }
        

       
//        return new ModelAndView("/admin/employeeDash");
        
       
    }
        
        
       
        
        
        
        
        
    
    
     return new ModelAndView("/admin/empAttendance");
    
    
  
   
    
    
    
    
    
} 
    
    
    
    //////////////////////leavePageget/////////////
    
    
         @RequestMapping("/emplev")
    public ModelAndView salaryDataSearch(@RequestParam("empId") int empId,Model model) {
       
//        int empId=Integer.parseInt(request.getParameter("empId"));
        
        
        List<Employee> sList=employeeService.getEmployeeDetails(empId);
        
        for(Employee empData:sList){
            System.out.println(empData.getEmpName());
            System.out.println(empData.getEmpDeg());
            System.out.println(empData.getEmpDep());
            System.out.println(empData.getId());
            
            String empName=empData.getEmpName();
            String empDep=empData.getEmpDep();
            String empDeg=empData.getEmpDeg();
            int empIdp=empData.getEmpId();
            
            
            
            model.addAttribute("empName",empName);
            model.addAttribute("empDep",empDep);
            model.addAttribute("empDeg",empDeg);
            model.addAttribute("empIdp",empIdp);
            
//            
//            
//            
//        }
        

       
//        return new ModelAndView("/admin/employeeDash");
        
       
    }
    
    
     return new ModelAndView("/admin/empleave");
    
    
  
   
    
    
    
    
    
}
    
    
    
    /////////////assignTaskPage//////
    
       @RequestMapping(value ="/assignTaskPage")
    public ModelAndView assignTaskPage() {
      List<Employee> emps = employeeService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("employees",emps);
        
      return new ModelAndView("/admin/assignTaskPage","map",map);
        
 }
    
    
    ////////select to assignTask//////
    
   
    
    @RequestMapping(value = "/selectToAssign/{id}", method = RequestMethod.GET)
    public ModelAndView selectToAssign(ModelMap map,@PathVariable("id") int id) {
        Employee emp = employeeService.getById(id);
        map.addAttribute("emp",emp);
        return  new ModelAndView("/admin/assignTaskPage");
    }

    @Override
    public ModelAndView save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    

 //Emp to SalFirstStage////
    @RequestMapping("/salaryData")
    public ModelAndView salaryData(){
        
        

      List<Employee> emps = employeeService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("employees",emps);
        
       return new ModelAndView("/admin/salaryData","map",map);
    }
    
    
    
    //////////////Employee Report/////
     @RequestMapping(value ="/empReportHit")
    public ModelAndView viewReport() {
      List<Employee> emps = employeeService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("employees",emps);
        
      return new ModelAndView("/admin/empReport","map",map);
        
 }

    
   
    
    
    
}
