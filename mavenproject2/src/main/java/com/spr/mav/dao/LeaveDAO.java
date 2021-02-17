/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.dao;

import com.spr.mav.dao.impl.ILeaveDAO;
import com.spr.mav.model.Leave;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaman
 */

@Repository(value ="leaveDAO")
@Transactional
public class LeaveDAO implements ILeaveDAO{
    @Autowired
     SessionFactory sessionFactory;
    
    

    @Override
    public Leave save(Leave t) {
       sessionFactory.getCurrentSession().save(t);
       sessionFactory.getCurrentSession().flush();
       
       return t;
    }

    @Override
    public Leave update(Leave t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Leave delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ////////fetch Data/////////////////
    @Override
    public List<Leave> getAll() {
         List<Leave> levList=sessionFactory.getCurrentSession().createCriteria(Leave.class).list();
        sessionFactory.getCurrentSession().flush();
        return levList;
    }

    
    /////get Individual data/////////
    @Override
    public Leave getById(int id) {
        Leave emplev = (Leave) sessionFactory.getCurrentSession().get(Leave.class, id);
        sessionFactory.getCurrentSession().flush();
        return emplev;
    
}
    
    
    /////////Leave History//////////
//     public List<Salary> getSalaryDetails(int empId) {
//      String hqlQuery="from salarynew where empId=:empId";
//      Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
//      query.setParameter("empId",empId);
//      
//      List<Salary> salList=query.list();
//      sessionFactory.getCurrentSession().flush();
//      
////      for(Salary sl:salList){
////          
////          System.out.println(sl.getEmpName());
////           System.out.println(sl.getEmpDeg());
////            System.out.println(sl.getEmpDep());
////             System.out.println(sl.getIncrePercent());
////          
////      }
//      
//      return salList;
//    }
     
     
     

    @Override
    public List<Leave> getLeaveHistory(int empId) {
       String hqlQuery="from leaveData where empId=:empId";
      Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
      query.setParameter("empId",empId);
      
      List<Leave> levHis=query.list();
      sessionFactory.getCurrentSession().flush();
      
      return levHis;
    }
    
    
    
}