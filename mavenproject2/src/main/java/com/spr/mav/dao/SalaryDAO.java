
package com.spr.mav.dao;

import com.spr.mav.common.ICommonDAO;
import com.spr.mav.dao.impl.ISalaryDAO;
import com.spr.mav.model.Salary;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository(value ="salaryDAO")
@Transactional
public class SalaryDAO implements ISalaryDAO{
    
    @Autowired
    SessionFactory sessionFactory;

    
    
    
    
    
    @Override
    public Salary save(Salary t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    
    
    
    
    
    
    
    
    @Override
    public Salary update(Salary t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    
    
    
    @Override
    public Salary delete(int id) {
        Salary sal=(Salary) sessionFactory.getCurrentSession().load(Salary.class, id);
        sessionFactory.getCurrentSession().delete(sal);
        sessionFactory.getCurrentSession().flush();
        return sal;
    }
    
    
    

    @Override
    public List<Salary> getAll() {
        List<Salary> slist=sessionFactory.getCurrentSession().createCriteria(Salary.class).list();
        sessionFactory.getCurrentSession().flush();
        return slist;
    }

    @Override
    public Salary getById(int id) {
         Salary empSal = (Salary) sessionFactory.getCurrentSession().get(Salary.class, id);
        sessionFactory.getCurrentSession().flush();
        return empSal;
    }

    
    
    
    ///////////////Query Search for Salary Details//////////
    @Override
    public List<Salary> getSalaryDetails(int empId) {
      String hqlQuery="from salarytable where empId=:empId";
      Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
      query.setParameter("empId",empId);
      
      List<Salary> salList=query.list();
      sessionFactory.getCurrentSession().flush();
      
//      for(Salary sl:salList){
//          
//          System.out.println(sl.getEmpName());
//           System.out.println(sl.getEmpDeg());
//            System.out.println(sl.getEmpDep());
//             System.out.println(sl.getIncrePercent());
//          
//      }
      
      return salList;
    }

    
    
    
    
    
    
    /////////////////////////GroupBy/////////////////////////////////////
    @Override
    public List<Salary> getGroupSalayData(String empDep) {
       String hqlQuery="from salarytable where empDep=:empDep";
      Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
      query.setParameter("empDep",empDep);
      
      List<Salary> salList=query.list();
      sessionFactory.getCurrentSession().flush();
      
      return salList;
    }
    
    
    //////////////////////////Update Column////////////////////////

//    @Override
//    public Salary updateColumn(Salary t) {
//        Salary salData=new Salary();
//       String empDep= salData.getEmpDep();
//       double salData.getIncrement();
//    }

    @Override
    public Salary updateColumn(HttpServletRequest request) {
        String empDep=request.getParameter("empDep");
        double increment=Double.parseDouble(request.getParameter("increment"));
        
        String hqlQuery="UPDATE salarytable SET increment =:increment  WHERE empDep =:empDep";
        
        return null;
    }

    @Override
    public Salary updateColumn(Salary t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    ////////////////group update////////////
    @Override
    public void groupDeptIncrement(String empDep, double increment) {
        
      String hqlQuery="UPDATE salarytable SET increment =:increment WHERE empDep =:empDep";
      Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
      query.setParameter("empDep",empDep);
      query.setParameter("increment",increment);
      
     
      
      
       int status= query.executeUpdate();
      sessionFactory.getCurrentSession().flush();
      
        System.out.println(status);
        
    }

    /////////////////BY ID//////////////
//    @Override
//    public List<Salary> getSalaryById(int id) {
//       String hqlQuery="from salarytable where id=:id";
//      Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
//      query.setParameter("id",id);
//      
//      List<Salary> salHis=query.list();
//      sessionFactory.getCurrentSession().flush();
//      
//      return salHis;
//    }

    @Override
    public Salary update1(Salary t) {
       sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

   
   

    
    
}
