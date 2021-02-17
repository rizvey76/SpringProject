/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service;

import com.spr.mav.dao.impl.ISalaryHistoryDAO;
import com.spr.mav.model.SalaryHistory;
import com.spr.mav.service.impl.ISalaryHistoryService;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zaman
 */

@Service(value = "salaryHistoryService")
public class SalaryHistoryService implements ISalaryHistoryService{
    
    @Autowired
    ISalaryHistoryDAO salaryHistoryDAO;
    
    

    @Override
    public SalaryHistory save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SalaryHistory update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SalaryHistory delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public List<SalaryHistory> getAll() {
        List<SalaryHistory> salrylist=salaryHistoryDAO.getAll();
       return salrylist;
    }

    
    @Override
    public SalaryHistory getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    @Override
    public SalaryHistory saveToHistory(HttpServletRequest request) {
         Map<String, String[]> requestMap = request.getParameterMap();
         
        String[] empId = (String[]) requestMap.get("empId[]");
        
        
         
        String[] empName = (String[]) requestMap.get("empName[]");
        String[] empDep = (String[]) requestMap.get("empDep[]");
        String[] empDeg = (String[]) requestMap.get("empDeg[]");
        
        
        
       
        
        String[] bSalary = (String[]) requestMap.get("bSalary[]");
        
        String[] increment = (String[]) requestMap.get("increment[]");
         
        String[] deduction = (String[]) requestMap.get("deduction[]");
        String[] netSalary = (String[]) requestMap.get("netSalary[]");
        String[] increPercent = (String[]) requestMap.get("increPercent[]");
        
        
        
       
        
        String[] deducPercent = (String[]) requestMap.get("deducPercent[]");
        
        String[] month = (String[]) requestMap.get("month[]");
        String[] year = (String[]) requestMap.get("year[]");
        
//        String[] status={"Not Paid"};
        
        
        
        
        
        
       SalaryHistory salHistory;
        
        for(int i = 0; i < empId.length; i++){
            
           salHistory=new SalaryHistory();
           
          
           
           salHistory.setEmpId(Integer.parseInt(empId[i]));
           salHistory.setEmpName(empName[i]);
           salHistory.setEmpDep(empDep[i]);
           salHistory.setEmpDeg(empDeg[i]);
           
           salHistory.setbSalary(Double.parseDouble(bSalary[i]));
           salHistory.setIncrement(Double.parseDouble(increment[i]));
           salHistory.setDeduction(Double.parseDouble(deduction[i]));
           salHistory.setNetSalary(Double.parseDouble(netSalary[i]));
           salHistory.setIncrePercent(Double.parseDouble(increPercent[i]));
           salHistory.setDeducPercent(Double.parseDouble(deducPercent[i]));
           
           salHistory.setMonth(month[i]);
           salHistory.setYear(year[i]);
           salHistory.setStatus("Paid");
           
           
           salaryHistoryDAO.save(salHistory);
            
        }
       return null;
    }
    
}
