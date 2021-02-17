/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service;

import com.spr.mav.dao.impl.IEmployeeDAO;
import com.spr.mav.model.Employee;
import com.spr.mav.service.impl.IEmployeeService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zaman
 */
@Service(value = "employeeService")
public class EmployeeService implements IEmployeeService {
   @Autowired
    IEmployeeDAO employeeDAO;
    
    
    
    @Override
    public Employee save(HttpServletRequest request) {
        int empid=Integer.parseInt(request.getParameter("empid"));
        String empname=request.getParameter("empname");
        String empdep=request.getParameter("empdep");
        String empdeg=request.getParameter("empdeg");
        String empphn=request.getParameter("empphn");
        
        String empemail=request.getParameter("empemail");
        String empaddress=request.getParameter("empaddress");
        String empbirth=request.getParameter("empbirth");
        String empgen=request.getParameter("gender");
        
        String empnid=request.getParameter("empnid");
        String empbgroup=request.getParameter("empbgroup");
        String empjdate=request.getParameter("empjdate");
        double bSalary=Double.parseDouble(request.getParameter("bSalary"));
        
        
        
        
        
        
        
        Employee emp=new Employee();
        int chempId=empid;
        emp.setEmpId(chempId);
        emp.setEmpName(empname);
        emp.setEmpDep(empdep);
        emp.setEmpDeg(empdeg);
        emp.setEmpPhn(empphn);
        emp.setEmpEmail(empemail);
        emp.setEmpAddress(empaddress);
        emp.setEmpBirth(empbirth);
        emp.setEmpGen(empgen);
        emp.setEmpNid(empnid);
        emp.setEmpBgroup(empbgroup);
        emp.setEmpJdate(empjdate);
        emp.setbSalary(bSalary);
        
        return employeeDAO.save(emp);
    }
    
    
    
    
    
    

    @Override
    public Employee update(HttpServletRequest request) {
         int id =Integer.parseInt(request.getParameter("id"));
         
         int empId =Integer.parseInt(request.getParameter("empId"));
        String empName = request.getParameter("empName");
        String empDep = request.getParameter("empDep");
         String empDeg = request.getParameter("empDeg");
        String empPhn = request.getParameter("empPhn");
         String empGen = request.getParameter("empGen");
        
        String empEmail = request.getParameter("empEmail");
        String empAddress = request.getParameter("empAddress");
         String empBirth = request.getParameter("empBirth");
        String empNid = request.getParameter("empNid");
        
         String empBgroup = request.getParameter("empBgroup");
        String empJdate = request.getParameter("empJdate");
        
        double bSalary=Double.parseDouble(request.getParameter("bSalary"));
        
        
        Employee eObj = new Employee();
       eObj.setId(id);
       eObj.setEmpId(empId);
       eObj.setEmpName(empName);
       eObj.setEmpDeg(empDeg);
       eObj.setEmpDep(empDep);
       eObj.setEmpPhn(empPhn);
       eObj.setEmpEmail(empEmail);
       eObj.setEmpNid(empNid);
       eObj.setEmpAddress(empAddress);
       eObj.setEmpJdate(empJdate);
       eObj.setEmpBirth(empBirth);
       eObj.setEmpBgroup(empBgroup);
       eObj.setbSalary(bSalary);
       eObj.setEmpGen(empGen);
       
       return employeeDAO.update(eObj);
    }

    
    @Override
    public Employee delete(int id) {
        return employeeDAO.delete(id);
    }
    
    
    

    
    
    @Override
    public List<Employee> getAll() {
       List<Employee> emplist=employeeDAO.getAll();
       return emplist;
    }
    
    
    
    

    @Override
    public Employee getById(int id) {
       return employeeDAO.getById(id);
    }

    //////////////////GetGroupData/////////////////
//    @Override
//    public List<Employee> getGroupEmpData(String empDep) {
//       return employeeDAO.getGroupEmpData(empDep);
//    }

    ////////getEmployee Data/////
    @Override
    public List<Employee> getEmployeeDetails(int empId) {
        return employeeDAO.getEmployeeDetails(empId);
    }
    
}
