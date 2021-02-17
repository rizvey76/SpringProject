
package com.spr.mav.service.impl;

import com.spr.mav.common.ICommonService;
import com.spr.mav.model.Employee;
import java.util.List;




public interface IEmployeeService extends ICommonService<Employee>{
    
//     public List<Employee> getGroupEmpData(String empDep);
    
    public List<Employee> getEmployeeDetails(int empId);
    
}
