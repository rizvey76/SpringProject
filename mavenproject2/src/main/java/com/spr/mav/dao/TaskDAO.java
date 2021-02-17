/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.dao;

import com.spr.mav.dao.impl.ITaskDAO;
import com.spr.mav.model.Task;
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
@Repository(value ="taskDAO")
@Transactional
public class TaskDAO implements ITaskDAO{
    
     @Autowired
    SessionFactory sessionFactory;
     
     

    @Override
    public Task save(Task t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Task update(Task t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t; 
    }

    
    
    @Override
    public Task delete(int id) {
       Task task=(Task) sessionFactory.getCurrentSession().load(Task.class, id);
        sessionFactory.getCurrentSession().delete(task);
        sessionFactory.getCurrentSession().flush();
        return task;
    }

    
    
    
    @Override
    public List<Task> getAll() {
        List<Task> slist=sessionFactory.getCurrentSession().createCriteria(Task.class).list();
        sessionFactory.getCurrentSession().flush();
        return slist;
    }

    
    
    @Override
    public Task getById(int id) {
         Task task = (Task) sessionFactory.getCurrentSession().get(Task.class, id);
        sessionFactory.getCurrentSession().flush();
        return task;
    }

    ////////message////////
    @Override
    public void colUpdate(int id, String empMessageDate) {
        
        String hqlQuery="UPDATE task SET empMessageDate =:empMessageDate WHERE id =:id";
         Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
         
         query.setParameter("id",id);
         query.setParameter("empMessageDate",empMessageDate);
         

          int status= query.executeUpdate();
          
          sessionFactory.getCurrentSession().flush();
          
          System.out.println(status);
        
    }

    
    ///////////////taskDataforemployee//////
    @Override
    public List<Task> getTaskDetails(int empId) {
      String hqlQuery="from task where empId=:empId";
      Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
      query.setParameter("empId",empId);
      
      List<Task> taskList=query.list();
      sessionFactory.getCurrentSession().flush();
      
      return taskList;
    }
    
    
    
    
     ////////status////////
    @Override
    public void colUpdate2(int id, String taskStatus,String status) {
        
        String hqlQuery="UPDATE task SET taskStatus =:taskStatus,status =:status WHERE id =:id";
         Query query=sessionFactory.getCurrentSession().createQuery(hqlQuery);
         
         query.setParameter("id",id);
         query.setParameter("taskStatus",taskStatus);
         
         query.setParameter("status",status);
         

          int atus= query.executeUpdate();
          
          sessionFactory.getCurrentSession().flush();
          
          System.out.println(atus);
        
    }
    
}
