/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service.impl;

import com.spr.mav.common.ICommonService;
import com.spr.mav.model.Salary;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author zaman
 */
public interface ISalaryService extends ICommonService<Salary> {
    public Salary saveIncrementSalary(HttpServletRequest request);
    public Salary saveDecrementSalary(HttpServletRequest request);
    
    public Salary empToSal(HttpServletRequest request);
    
    
    public Salary salaryDecrementUpdate(HttpServletRequest request);
    
    
    
     public List<Salary> getSalaryDetails(int empId);
     
     
     
     public List<Salary> getGroupSalayData(String empDep);
     
     
     
     public Salary groupIncrement(HttpServletRequest request);
     
     
      public void groupDeptIncrement(String empDep,double increment);
      
      
       public Salary saveToSalary(HttpServletRequest request); 
       
       
//        public List<Salary> getSalaryById(int id) ;
       
//        public Salary update1(HttpServletRequest request);
     
     
     
}
