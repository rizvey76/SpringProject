/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.dao;

import com.spr.mav.dao.impl.IAttendanceDAO;
import com.spr.mav.model.Attendance;
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

@Repository(value ="attendanceDAO")
@Transactional
public class AttendanceDAO implements IAttendanceDAO{
    
    @Autowired
     SessionFactory sessionFactory;

    
    @Override
    public Attendance save(Attendance t) {
        sessionFactory.getCurrentSession().save(t);
       sessionFactory.getCurrentSession().flush();
       
       return t;
    }

    
    @Override
    public Attendance update(Attendance t) {
       sessionFactory.getCurrentSession().saveOrUpdate(t);
       sessionFactory.getCurrentSession().flush();
       
       return t;
       
    }

    @Override
    public Attendance delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public List<Attendance> getAll() {
        List<Attendance> attendanceList=sessionFactory.getCurrentSession().createCriteria(Attendance.class).list();
        sessionFactory.getCurrentSession().flush();
        return attendanceList;
    }

    
    
    @Override
    public Attendance getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //////////////update Querry/////////////////////
    @Override
    public void attendanceUpdate(int id,int empId,String submissionDate,String statusSend,String ip,String day,String submissionTime) {
//         String hqlQuery="UPDATE attendanceData SET submissionDate =:submissionDate,statusSend =:statusSend,ip =:ip,day =:day,submissionTime =:submissionTime  WHERE empId =:empId and id =:id";
         
         
         String hqlQuery="UPDATE attendanceData SET submissionDate =:submissionDate,statusSend =:statusSend,ip =:ip,day =:day,submissionTime =:submissionTime,id =:id  WHERE empId =:empId";
         Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
         
         query.setParameter("submissionDate",submissionDate);
         query.setParameter("statusSend",statusSend);
         
          query.setParameter("ip",ip);
         query.setParameter("day",day);
         
         
          query.setParameter("submissionTime",submissionTime);
         query.setParameter("empId",empId);
         
          query.setParameter("id",id);
          
          int status= query.executeUpdate();
          
          sessionFactory.getCurrentSession().flush();
          
          System.out.println(status);
    }

    
    /////////delete all data//////
    @Override
    public void deleteAll() {
        String stringQuery = "DELETE FROM attendanceData";
          Query query = sessionFactory.getCurrentSession().createQuery(stringQuery);
          query.executeUpdate();
        
        sessionFactory.getCurrentSession().flush();
    }
    
    
    
    
    
    
    
}
