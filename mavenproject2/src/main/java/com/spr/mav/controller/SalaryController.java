
package com.spr.mav.controller;

import com.spr.mav.controller.impl.ISalaryController;
import com.spr.mav.model.Salary;
import com.spr.mav.service.impl.ISalaryService;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
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
public class SalaryController implements ISalaryController{
    
    
    @Autowired
    ISalaryService salaryService;
    
    

    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    @Override
    @RequestMapping(value = "/saveSalary",method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        salaryService.save(request);
        
        System.out.println("Hitted!");
        return new ModelAndView("/admin/salaryDataInsert");
    }

    
    
    
    
    
    
    @Override
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    ///////////up
    @Override
     @RequestMapping(value ="/salUpdate", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
         salaryService.update(request);
       return new ModelAndView("/admin/salaryDataIncrement");
    }

    
    
    
    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    @Override
    public List<Salary> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    @RequestMapping(path="/viTest",method = RequestMethod.POST)
    public ModelAndView incrementT(@RequestParam("specialPay") double specialPay,
            @RequestParam("increment") double increment,
             @RequestParam("bSalary") double bSalary,
            @RequestParam("month") String month,
            @RequestParam("year") String year ,Model model){
        
        
             
          double netSalary=(increment/100)*bSalary+(specialPay/100)*bSalary+bSalary;
        
        
        model.addAttribute("bSalary",bSalary);
        model.addAttribute("netSalary",netSalary);
      
          model.addAttribute("specialPay",specialPay);
          model.addAttribute("increment",increment);
          
        model.addAttribute("month",month);
         model.addAttribute("year",year);
        
        
        return new ModelAndView("/admin/salaryDataIncrement");
    }
    
    
    
    
    
    
    
     @RequestMapping(path="/viiTest",method = RequestMethod.POST)
    public ModelAndView deductionT(@RequestParam("insurance") double insurance,
            @RequestParam("loans") double loans,
             @RequestParam("mDeduction") double mDeduction,
            @RequestParam("bSalary") double bSalary,
            @RequestParam("month") String month ,
            @RequestParam("year") String year ,
            Model model){
        
        
             
        
        
          
           double netSalary=bSalary-(insurance/100)*bSalary-(loans/100)*bSalary-(mDeduction/100)*bSalary;
        
        model.addAttribute("bSalary",bSalary);
        model.addAttribute("netSalary",netSalary);
      
          model.addAttribute("insurance",insurance);
          model.addAttribute("loans",loans);
           model.addAttribute("mDeduction",mDeduction);
          
        model.addAttribute("month",month);
         model.addAttribute("year",year);
        
        
        return new ModelAndView("/admin/salaryData");
    }

    
    ////increment/////
    @Override
     @RequestMapping(path="/saveIncre",method = RequestMethod.POST)
    public ModelAndView saveIncrementSalary(HttpServletRequest request) {
       salaryService.saveIncrementSalary(request);
        return new ModelAndView("/admin/salaryData");
    }

    
    
    ////Decriment/////
   
     @RequestMapping(path="/saveDecre",method = RequestMethod.POST)
    public ModelAndView saveDecrementSalary(HttpServletRequest request) {
        salaryService.saveDecrementSalary(request);
         return new ModelAndView("/admin/salaryData");
    }
    
    
    
    //////Save to Salary From Employee/////
    
    
   
    
    
    
    @RequestMapping(value = "/employeeToSalary",method = RequestMethod.POST)
    public ModelAndView empToSave(HttpServletRequest request) {
        salaryService.empToSal(request);
        
//        System.out.println(request.getParameter("id"));
//         System.out.println(request.getParameter("empId")); 
//         System.out.println(request.getParameter("empName"));
//          System.out.println(request.getParameter("empDep"));
//         System.out.println(request.getParameter("empDeg")); 
//         System.out.println(request.getParameter("bSalary"));
         
         
        
          
          
         
        return new ModelAndView("/admin/salaryDataInsert");
    }
    
    
    ///////To Show Data from Salary Table//////
    
     @RequestMapping(value ="/salIncreView")
    public ModelAndView viewSalary() {
      List<Salary> salayData = salaryService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("allSalaryData",salayData);
        
      return new ModelAndView("/admin/salaryDataIncrement","map",map);
        
 }
    
    
    
     ///////To Show Data from Salary Table//////
    
     @RequestMapping(value ="/salDecreView")
    public ModelAndView viewSalary1() {
      List<Salary> salayData = salaryService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("allSalaryData",salayData);
        
      return new ModelAndView("/admin/salaryDataDecrement","map",map);
        
 }
    
    
     ///////To Show Data from Salary Table//////
    
     @RequestMapping(value ="/salAction")
    public ModelAndView actionSalary(Model model) {
      List<Salary> salayData = salaryService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("allSalaryData",salayData);
       
       /////////getMonth////////
       
        LocalDate currentdate = LocalDate.now();
       Month currentMonth = currentdate.getMonth();
       
       model.addAttribute("currentMonth",currentMonth);
       
       
        
      return new ModelAndView("/admin/salaryDataAction","map",map);
        
 }
    
    
     /////toSelect
    
    
    @RequestMapping(value = "/selectSal/{id}", method = RequestMethod.GET)
    public ModelAndView selectSalary(ModelMap map, @PathVariable("id") int id) {
        Salary sm = salaryService.getById(id);
        map.addAttribute("sm",sm);
        return  new ModelAndView("/admin/salaryDataIncrement");
    }
    
    
        @RequestMapping(value = "/selectSalDec/{id}", method = RequestMethod.GET)
    public ModelAndView selectSalaryDec(ModelMap map, @PathVariable("id") int id) {
        Salary sm = salaryService.getById(id);
        map.addAttribute("sm",sm);
        return  new ModelAndView("/admin/salaryDataDecrement");
    }
    
    
    
    
    /////////Salary Decrement Update ////////

    @Override
     @RequestMapping(value ="/salDecrementUpdate", method = RequestMethod.POST)
    public ModelAndView salaryDecrementUpdate(HttpServletRequest request) {
          salaryService.salaryDecrementUpdate(request);
       return new ModelAndView("/admin/salaryDataDecrement");
    }
    
    
////////////////////Show IncrementPage//////////
    
    
    
      @RequestMapping(value ="/salIncrementView")
    public ModelAndView salaryIncrementView() {
        
        
        
         
       return new ModelAndView("/admin/salaryDataIncrement");
    }
    
    
    
    
    
    
    
    
    ////////////////////Show IsertPage//////////
    
      @RequestMapping(value ="/salInsertView")
    public ModelAndView salaryInserttView() {
        
        
        
        
        
        
        
         
       return new ModelAndView("/admin/salaryDataInsert");
    }
    
    
    ////////////////////Show DecrementPage//////////
    
      @RequestMapping(value ="/salDecrementView")
    public ModelAndView salaryDecrementtView() {
         
       return new ModelAndView("/admin/salaryDataDecrement");
    }
    
    
    
    
    
    ////////////////////Show ActionPage//////////
    
      @RequestMapping(value ="/salActionView")
    public ModelAndView salaryActionView() {
         
       return new ModelAndView("/admin/salaryDataAction");
    }
    
    
    
    
    
     ////delete/////
    
    
    @RequestMapping(value = "/sdelete/{id}", method = RequestMethod.GET)
    public ModelAndView sDelete(@PathVariable("id") int id) { 
        salaryService.delete(id);
         return  new ModelAndView("/admin/salaryDataAction");
    }
    
    
    
    
    //////////////Employee Dashboard log with data/////////
//     @RequestMapping("/employeeDash")
//    public ModelAndView library(){
//        return new ModelAndView("/admin/employeeDash");
//    }

    @Override
//    @RequestMapping("/employeeDash")
    public ModelAndView salaryDataSearch(HttpServletRequest request) {
//        int empId=Integer.parseInt(request.getParameter("empId"));
//        
//        
//        List<Salary> sList=salaryService.getSalaryDetails(empId);
//        
//        for(Salary salData:sList){
//            System.out.println(salData.getEmpName());
//            System.out.println(salData.getEmpDeg());
//            System.out.println(salData.getEmpDep());
//            System.out.println(salData.getIncrePercent());
//            
//            
//            
//        }
//        
//
//        return new ModelAndView("/admin/employeeDash");
        return null;
    }
    
    
    
    
    ///////////////////salary Catch////////
    
//    @RequestMapping("/dep")
//    public ModelAndView salaryDataSearch2(@RequestParam("empId") int empId,Model model) {
//       
//
//        
//        
//        List<Salary> sList=salaryService.getSalaryDetails(empId);
//        
//        for(Salary salData:sList){
//            System.out.println(salData.getEmpName());
//            System.out.println(salData.getEmpDeg());
//            System.out.println(salData.getEmpDep());
//            System.out.println(salData.getIncrePercent());
//            
//            String empName=salData.getEmpName();
//            
//            int empIdp=salData.getEmpId();
//            
//            model.addAttribute("empName",empName);
//            
//            model.addAttribute("empIdp",empIdp);
//            
//            
//            
//        }
//        
//
//       
//        return new ModelAndView("/admin/employeeDash");
//    }
    
    
    
    
    
    
    
        ///////////////////leave page////////
//    
//     @RequestMapping("/emplev")
//    public ModelAndView salaryDataSearch(@RequestParam("empId") int empId,Model model) {
//       
////        int empId=Integer.parseInt(request.getParameter("empId"));
//        
//        
//        List<Salary> sList=salaryService.getSalaryDetails(empId);
//        
//        for(Salary salData:sList){
//            System.out.println(salData.getEmpName());
//            System.out.println(salData.getEmpDeg());
//            System.out.println(salData.getEmpDep());
//            System.out.println(salData.getIncrePercent());
//            
//            String empName=salData.getEmpName();
//            String empDep=salData.getEmpDep();
//            String empDeg=salData.getEmpDeg();
//            int empIdp=salData.getEmpId();
//            
//            
//            
//            model.addAttribute("empName",empName);
//            model.addAttribute("empDep",empDep);
//            model.addAttribute("empDeg",empDeg);
//            model.addAttribute("empIdp",empIdp);
//            
////            
////            
////            
////        }
//        
//
//       
////        return new ModelAndView("/admin/employeeDash");
//        
//       
//    }
//    
//    
//     return new ModelAndView("/admin/empleave");
//    
//    
//  
//   
//    
//    
//    
//    
//    
//}
    
       ///////////////////leave page////////
//    
//     @RequestMapping("/empAttendance")
//    public ModelAndView attendanceSearch(@RequestParam("empId") int empId,Model model) throws UnknownHostException {
//       
////        int empId=Integer.parseInt(request.getParameter("empId"));
//        
//        
//        List<Salary> sList=salaryService.getSalaryDetails(empId);
//        
//        for(Salary salData:sList){
//            System.out.println(salData.getEmpName());
//            System.out.println(salData.getEmpDeg());
//            System.out.println(salData.getEmpDep());
//            System.out.println(salData.getIncrePercent());
//            
//            String empName=salData.getEmpName();
//            String empDep=salData.getEmpDep();
//            String empDeg=salData.getEmpDeg();
//            int empIdp=salData.getEmpId();
//            
//            int id=salData.getId();
//            
//            
//            model.addAttribute("id",id);
//            
//            model.addAttribute("empName",empName);
//            model.addAttribute("empDep",empDep);
//            model.addAttribute("empDeg",empDeg);
//            model.addAttribute("empIdp",empIdp);
//            
//            
//            
//             //////////////////new//////////////////////////////
//         Calendar calendar = Calendar.getInstance();
//         Date date = calendar.getTime();
//        
//         String day= new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
//       
//         System.out.println(day);
//       
//         model.addAttribute("day",day);
//          ///////////////////////Date Provider/////////////////
//         
//         final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//         LocalDate now = LocalDate.now();
//         
//          
//          
//          
//          String submissionDate=formatter.format(now);
//          
//          model.addAttribute("submissionDate",submissionDate);
//          
//          /////////////////////////Ip Address////////////
//          InetAddress myIP=InetAddress.getLocalHost();
//          String ip= myIP.getHostAddress();
//          
//          model.addAttribute("ip",ip);
//            
////            
////            
////            
////        }
//        
//
//       
////        return new ModelAndView("/admin/employeeDash");
//        
//       
//    }
//        
//        
//       
//        
//        
//        
//        
//        
//    
//    
//     return new ModelAndView("/admin/empAttendance");
//    
//    
//  
//   
//    
//    
//    
//    
//    
//} 
//    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ///////////////////////map////////
    
      @RequestMapping(value ="/showGroupSalaryDataPage")
    public ModelAndView leaveHistoryData() {

        
      return new ModelAndView("/admin/salaryDataInsertByGroup");
    
}
    
    
    
    
    
        
         ///////To Show Data from Leave Table//////
    
     @RequestMapping(value ="/showGroupSalaryData")
    public ModelAndView leaveHistoryData(@RequestParam("empDep") String empDep) {
      List<Salary> gSalaryData = salaryService.getGroupSalayData(empDep);
      
//      for(Salary salGroup:gSalaryData){
//          System.out.println(salGroup.getbSalary());
//           System.out.println(leaveHi.getActionStatus()); 
//           System.out.println(leaveHi.getLevReason());
//            System.out.println(leaveHi.getLevType());
//             System.out.println(leaveHi.getSubDate());
           
          
//      }
      
      //     return new ModelAndView("/admin/empleave");
      
       Map<String,Object> map= new HashMap<String,Object>();
       map.put("gSalaryData",gSalaryData);
        
      return new ModelAndView("/admin/salaryDataInsertByGroup","map",map);
      
      
//       return new ModelAndView("/admin/salaryDataInsertByGroup");
    
}
    
    
 /////////////////column update///////////////////////////////////   
    
    
     @RequestMapping(value = "/colunIncrement",method = RequestMethod.POST)
    public ModelAndView columnUpdate(@RequestParam("empDep") String empDep,@RequestParam("increment") double increment) {
        
        salaryService.groupDeptIncrement(empDep, increment);
         System.out.println(empDep);
          System.out.println(increment);

       
        return new ModelAndView("/admin/salaryDataInsertByGroup");
    }
    
    
    
    
//    ////////////////testSave/////
   @RequestMapping(value ="/batchInsertToSalary", method = RequestMethod.POST)
  public ModelAndView saveToSalary(HttpServletRequest request) {
       salaryService.saveToSalary(request);
     
      return new ModelAndView("/admin/salaryData");
   }
  
  
  ////////////////////////////////
  
     @RequestMapping(value ="/batchInsertToSalaryDec", method = RequestMethod.POST)
  public ModelAndView saveToSalaryDec(HttpServletRequest request) {
       salaryService.saveToSalary(request);
     
      return new ModelAndView("/admin/salaryDataDecrement");
   }
  
  /////////////////getById//////////////////
  
//     @RequestMapping(value ="/showIdData")
//    public ModelAndView getSalaryById(@RequestParam("id") int id) {
//        
//         System.out.println(id);
//      List<Salary> leaveData = salaryService.getSalaryById(id);
//      
//
//      
//       Map<String,Object> map= new HashMap<String,Object>();
//       map.put("salById",leaveData);
//        
//      return new ModelAndView("/admin/salaryDataIncrement");
//
// }
    
    
    
    
    
    
    
    
    
    
    
    
    
}


