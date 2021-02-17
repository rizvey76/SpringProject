/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.dao.impl;

import com.spr.mav.common.ICommonDAO;
import com.spr.mav.model.Task;
import java.util.List;

/**
 *
 * @author zaman
 */
public interface ITaskDAO extends ICommonDAO<Task> {
    
     public void colUpdate(int id,String empMessageDate);
     
     public List<Task> getTaskDetails(int empId);
     
     public void colUpdate2(int id, String taskStatus,String status);
    
}
