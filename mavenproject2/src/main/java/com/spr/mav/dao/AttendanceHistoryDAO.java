/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.dao;

import com.spr.mav.dao.impl.IAttendanceHistoryDAO;
import com.spr.mav.model.AttendanceHistory;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaman
 */
@Repository(value ="attendanceHistoryDAO")
@Transactional
public class AttendanceHistoryDAO implements IAttendanceHistoryDAO{
    @Autowired
    SessionFactory sessionFactory;
    
    
    
    
    @Override
    public AttendanceHistory save(AttendanceHistory t) {
         sessionFactory.getCurrentSession().save(t);
       sessionFactory.getCurrentSession().flush();
       
       return t;
    }
    
    
    
    

    @Override
    public AttendanceHistory update(AttendanceHistory t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AttendanceHistory delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public List<AttendanceHistory> getAll() {
        List<AttendanceHistory> attendanceHistoryList=sessionFactory.getCurrentSession().createCriteria(AttendanceHistory.class).list();
        sessionFactory.getCurrentSession().flush();
        return attendanceHistoryList;
    }

    
    
    
    @Override
    public AttendanceHistory getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
