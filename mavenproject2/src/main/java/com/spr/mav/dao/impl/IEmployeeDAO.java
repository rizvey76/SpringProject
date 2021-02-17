
package com.spr.mav.dao.impl;

import com.spr.mav.common.ICommonDAO;
import com.spr.mav.model.Employee;
import java.util.List;




public interface IEmployeeDAO extends ICommonDAO<Employee>{
    
    
//     public List<Employee> getGroupEmpData(String empDep);
    
    public List<Employee> getEmployeeDetails(int empId);
    
}
