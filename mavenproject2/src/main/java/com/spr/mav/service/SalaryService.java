/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service;

import com.spr.mav.dao.impl.ISalaryDAO;
import com.spr.mav.model.Salary;
import com.spr.mav.service.impl.ISalaryService;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value = "salaryService")
public class SalaryService implements ISalaryService {

    
    @Autowired
    ISalaryDAO salaryDAO;
    
    
    
    
    @Override
    public Salary save(HttpServletRequest request) {
       double bSalary=Double.parseDouble(request.getParameter("bSalary"));
//       String month=request.getParameter("month");
//       String year=request.getParameter("year");
       String status="Not Paid";
       
       Salary sal=new Salary();
       
       sal.setbSalary(bSalary);
//       sal.setMonth(month);
//       sal.setYear(year);
       sal.setStatus(status);
       
       return salaryDAO.save(sal);
    }
    
    
    
    

    @Override
    public Salary update(HttpServletRequest request) {
        int id =Integer.parseInt(request.getParameter("id"));
         
         double bonus=Double.parseDouble(request.getParameter("bonus"));
          double specialPay=Double.parseDouble(request.getParameter("specialPay"));
           double bSalary=Double.parseDouble(request.getParameter("bSalary"));
           String month=request.getParameter("month");
           String year=request.getParameter("year");
           
           
             int empId =Integer.parseInt(request.getParameter("empId"));
           String empName=request.getParameter("empName");
             String empDep=request.getParameter("empDep");
           String empDeg=request.getParameter("empDeg");
         
           
           
            double netSalary=(bonus/100)*bSalary+(specialPay/100)*bSalary+bSalary;
            double increment=(bonus/100)*bSalary+(specialPay/100)*bSalary;
            
            double increPercent=(increment/bSalary)*100;
          
             String status="Not Paid";
            
       Salary salInfo=new Salary();
       
       salInfo.setId(id);
       salInfo.setBonus(bonus);
       salInfo.setIncrement(increment);
       salInfo.setIncrePercent(increPercent);
       salInfo.setSpecialPay(specialPay);
       salInfo.setbSalary(bSalary);
       salInfo.setNetSalary(netSalary);
       salInfo.setMonth(month);
       salInfo.setYear(year);
       
       salInfo.setEmpId(empId);
       salInfo.setEmpName(empName);
       salInfo.setEmpDep(empDep);
       salInfo.setEmpDeg(empDeg);
       salInfo.setStatus(status);
       
       
       return salaryDAO.update(salInfo);
    }
    
    
    
    
    
    

    @Override
    public Salary delete(int id) {
       return salaryDAO.delete(id);
    }
    
    
    

    @Override
    public List<Salary> getAll() {
        List<Salary> salrylist=salaryDAO.getAll();
       return salrylist;
    }

    @Override
    public Salary getById(int id) {
       return salaryDAO.getById(id);
    }

    
    
    
    ////Increment/////
    @Override
    public Salary saveIncrementSalary(HttpServletRequest request) {
       
        double increment=Double.parseDouble(request.getParameter("increment")); 
        double specialPay=Double.parseDouble(request.getParameter("specialPay"));
        double bSalary=Double.parseDouble(request.getParameter("bSalary"));
        String month=request.getParameter("month");
        String year=request.getParameter("year");
       
        String status="Not Paid";
       Salary sal=new Salary();
       
       double netSalary=(increment/100)*bSalary+(specialPay/100)*bSalary+bSalary;
       
       sal.setIncrement(increment);
       sal.setSpecialPay(specialPay);
       sal.setbSalary(bSalary);
       sal.setNetSalary(netSalary);
       sal.setMonth(month);
       sal.setYear(year);
       sal.setStatus(status);
       return salaryDAO.save(sal);
    }

    
    
    
    
    ///decriment///
    @Override
    public Salary saveDecrementSalary(HttpServletRequest request) {
        
        double insurance=Double.parseDouble(request.getParameter("insurance")); 
        double loans=Double.parseDouble(request.getParameter("loans"));
        double mDeduction=Double.parseDouble(request.getParameter("mDeduction"));
        double bSalary=Double.parseDouble(request.getParameter("bSalary"));
        String month=request.getParameter("month");
        String year=request.getParameter("year");
        String status="Not Paid";
       
       Salary sal=new Salary();
       
       double netSalary=bSalary-(insurance/100)*bSalary-(loans/100)*bSalary-(mDeduction/100)*bSalary;
       
       sal.setInsurance(insurance);
       sal.setLoans(loans);
       sal.setmDeduction(mDeduction);
       sal.setbSalary(bSalary);
       sal.setNetSalary(netSalary);
       sal.setMonth(month);
       sal.setYear(year);
       sal.setStatus(status);
       
       return salaryDAO.save(sal);
    }
    
    
    
    
 
    
 

     
    
    
    
     
     /////decrementUpdate////
    @Override
    public Salary salaryDecrementUpdate(HttpServletRequest request) {
        int id =Integer.parseInt(request.getParameter("id"));
         
         double insurance=Double.parseDouble(request.getParameter("insurance"));
          double loans=Double.parseDouble(request.getParameter("loans"));
           double bSalary=Double.parseDouble(request.getParameter("bSalary"));
            double mDeduction=Double.parseDouble(request.getParameter("mDeduction"));
           String month=request.getParameter("month");
           String year=request.getParameter("year");
           
           
             int empId =Integer.parseInt(request.getParameter("empId"));
           String empName=request.getParameter("empName");
             String empDep=request.getParameter("empDep");
           String empDeg=request.getParameter("empDeg");
         
           
           
             double netSalary=bSalary-(insurance/100)*bSalary-(loans/100)*bSalary-(mDeduction/100)*bSalary;
             double deduction=(insurance/100)*bSalary+(loans/100)*bSalary+(mDeduction/100)*bSalary;
             double deducPercent=(deduction/bSalary)*100;
           
              String status="Not Paid";
       Salary salInfo=new Salary();
       
       salInfo.setId(id);
       salInfo.setmDeduction(mDeduction);
       salInfo.setLoans(loans);
       salInfo.setDeduction(deduction);
       salInfo.setDeducPercent(deducPercent);
       salInfo.setInsurance(insurance);
       salInfo.setbSalary(bSalary);
       salInfo.setNetSalary(netSalary);
       salInfo.setMonth(month);
       salInfo.setYear(year);
       
       salInfo.setEmpId(empId);
       salInfo.setEmpName(empName);
       salInfo.setEmpDep(empDep);
       salInfo.setEmpDeg(empDeg);
       
       salInfo.setStatus(status);
       return salaryDAO.update(salInfo);
        
        
    }
    
    
    
    
    
    

    @Override
    public Salary empToSal(HttpServletRequest request) {
         int id=Integer.parseInt(request.getParameter("id"));
         
        int empId=Integer.parseInt(request.getParameter("empId"));
        String empName=request.getParameter("empName");
        String empDep=request.getParameter("empDep");
        String empDeg=request.getParameter("empDeg");
        double bSalary=Double.parseDouble(request.getParameter("bSalary"));
        String month=request.getParameter("month");
        String year=request.getParameter("year");
        
         String status="Not Paid";
         Salary sal=new Salary();
         sal.setId(id);
         sal.setEmpId(empId);
         sal.setEmpName(empName);
         sal.setEmpDep(empDep);
         sal.setEmpDeg(empDeg);
         sal.setbSalary(bSalary);
         sal.setMonth(month);
         sal.setYear(year);
        sal.setStatus(status);
       return salaryDAO.update(sal);
        
    }

    ///////////query for Salary data//////
    @Override
    public List<Salary> getSalaryDetails(int empId) {
       return salaryDAO.getSalaryDetails(empId);
    }

    
    
    ///////////////////SalaryGroupData//////////
    @Override
    public List<Salary> getGroupSalayData(String empDep) {
        return salaryDAO.getGroupSalayData(empDep);
    }

    
    //////////////////////ColumnUpdate////////
    @Override
    public Salary groupIncrement(HttpServletRequest request) {
     
       
       
       return salaryDAO.updateColumn(request);
    }

    ///////////udate Salary by group/////////////////
    @Override
    public void groupDeptIncrement(String empDep, double increment) {
         salaryDAO.groupDeptIncrement(empDep, increment);
    }
    
   /////BatchInsert To Salary/////

    @Override
    public Salary saveToSalary(HttpServletRequest request) {
      Map<String, String[]> requestMap = request.getParameterMap();
         
        String[] id = (String[]) requestMap.get("id[]"); 
        String[] empId = (String[]) requestMap.get("empId[]");
         
        String[] empName = (String[]) requestMap.get("empName[]");
        String[] empDep = (String[]) requestMap.get("empDep[]");
        String[] empDeg = (String[]) requestMap.get("empDeg[]");
        String[] bSalary = (String[]) requestMap.get("bSalary[]");
        
        
//         String[] status ={"NotPaid"};
        
        
       
        
       
        
        
        
        Salary salData;
        
        for(int i = 0; i < empId.length; i++){
            
           salData=new Salary();
           
           salData.setId(Integer.parseInt(id[i]));
           salData.setEmpId(Integer.parseInt(empId[i]));
           salData.setEmpName(empName[i]);
           salData.setEmpDep(empDep[i]);
           salData.setEmpDeg(empDeg[i]);
           salData.setbSalary(Double.parseDouble(bSalary[i]));
           salData.setStatus("Not Paid");
           
          
           
           salaryDAO.update(salData);
            
        }
       return null;
    }

    
    ///////////GetById////////////////
//    @Override
//    public List<Salary> getSalaryById(int id) {
//         return salaryDAO.getSalaryById(id);
//    }

  

//    @Override
//    public Salary update(HttpServletRequest request) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    

    
}
