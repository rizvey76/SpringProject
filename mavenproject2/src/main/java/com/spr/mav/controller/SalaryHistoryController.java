/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.controller;

import com.spr.mav.controller.impl.ISalaryHistoryController;
import com.spr.mav.model.SalaryHistory;
import com.spr.mav.service.impl.ISalaryHistoryService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author zaman
 */

@RestController
public class SalaryHistoryController implements ISalaryHistoryController {

    @Autowired
    ISalaryHistoryService salaryHistoryService;
    
    
    @Override
    public ModelAndView create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public List<SalaryHistory> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    /////////////////Batch Insert////////
    @RequestMapping(value ="/batchInsertToHistoryTable",method = RequestMethod.POST )
    public ModelAndView batchInsert(HttpServletRequest request) {
        
        salaryHistoryService.saveToHistory(request);
        
        
        return new ModelAndView("/admin/salaryDataHistory");
    }
    
    
    
    
    @RequestMapping(value ="/salAllDataHistory")
    public ModelAndView actionSalary() {
      List<SalaryHistory> salayData = salaryHistoryService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("allSalaryData",salayData);
        
      return new ModelAndView("/admin/salaryDataHistory","map",map);
        
 }
    
    
    //////Salaryreport//////
        @RequestMapping(value ="/salaryReportHit")
    public ModelAndView salaryReport() {
      List<SalaryHistory> salayData = salaryHistoryService.getAll();
      
       Map<String,Object> map=new HashMap<String,Object>();
       map.put("allSalaryData",salayData);
        
      return new ModelAndView("/admin/salaryReport","map",map);
        
 }
    
    
}
