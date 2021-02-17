
package com.spr.mav.dao;

import com.spr.mav.dao.impl.IEmployeeDAO;
import com.spr.mav.model.Employee;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "employeeDAO")
@Transactional
public class EmployeeDAO implements IEmployeeDAO{
    
      @Autowired
     SessionFactory sessionFactory;

    @Override
    public Employee save(Employee t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    
    
    
    
    
    @Override
    public Employee update(Employee t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }
    
    
    

    @Override
    public Employee delete(int id) {
        Employee employee=(Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
        sessionFactory.getCurrentSession().delete(employee);
        sessionFactory.getCurrentSession().flush();
        return employee;
    }

    
    
    @Override
    public List<Employee> getAll() {
        List<Employee> list=sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
        sessionFactory.getCurrentSession().flush();
        return list;
    }
    
    
    

    @Override
    public Employee getById(int id) {
       Employee employee = (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
        sessionFactory.getCurrentSession().flush();
        return employee;
    }

    
    ////////GroupBy//////////
//    @Override
//    public List<Employee> getGroupEmpData(String empDep) {
//        String hqlQuery="from leaveData where empDep=:empDep";
//      Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
//      query.setParameter("empDep",empDep);
//      
//      List<Employee> empGlist=query.list();
//      sessionFactory.getCurrentSession().flush();
//      
//      return empGlist;
//    }

    
    ///////get Employee data////
    @Override
    public List<Employee> getEmployeeDetails(int empId) {
        String hqlQuery="from empl where empId=:empId";
        Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
        query.setParameter("empId",empId);
         List<Employee> empList=query.list();
         return empList;
        
    }
    
    
    
    
    
}
