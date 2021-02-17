/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.dao.impl;

import com.spr.mav.common.ICommonDAO;
import com.spr.mav.model.Salary;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author zaman
 */
public interface ISalaryDAO extends ICommonDAO<Salary>{
    
    public List<Salary> getSalaryDetails(int empId);
    
    public List<Salary> getGroupSalayData(String empDep);
    
    
    public Salary updateColumn(Salary t) ;
    
     public Salary updateColumn(HttpServletRequest request);
     
     
      public void groupDeptIncrement(String empDep, double increment);
      
//      public List<Salary> getSalaryById(int id);
      
      
      public Salary update1(Salary t);
    
}
