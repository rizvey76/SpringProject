/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.dao;

import com.spr.mav.dao.impl.ISalaryHistoryDAO;
import com.spr.mav.model.SalaryHistory;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaman
 */

@Repository(value ="salaryHistoryDAO")
@Transactional
public class SalaryHistoryDAO implements ISalaryHistoryDAO {
    
    @Autowired
     SessionFactory sessionFactory;
    

    @Override
    public SalaryHistory save(SalaryHistory t) {
       sessionFactory.getCurrentSession().save(t);
       sessionFactory.getCurrentSession().flush();
       
       return t;
    }

    @Override
    public SalaryHistory update(SalaryHistory t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SalaryHistory delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public List<SalaryHistory> getAll() {
        List<SalaryHistory> slist=sessionFactory.getCurrentSession().createCriteria(SalaryHistory.class).list();
        sessionFactory.getCurrentSession().flush();
        return slist;
    }
    
    
    

    @Override
    public SalaryHistory getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
