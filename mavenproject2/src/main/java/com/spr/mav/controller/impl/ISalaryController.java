/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.controller.impl;

import com.spr.mav.common.ICommonController;
import com.spr.mav.model.Salary;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author zaman
 */
public interface ISalaryController extends ICommonController<Salary> {
   public ModelAndView saveIncrementSalary(HttpServletRequest request); 
    public ModelAndView salaryDecrementUpdate(HttpServletRequest request); 
    
     public ModelAndView salaryDataSearch(HttpServletRequest request); 
   
}
