/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.dao.impl;

import com.spr.mav.common.ICommonDAO;
import com.spr.mav.model.Attendance;

/**
 *
 * @author zaman
 */
public interface IAttendanceDAO extends ICommonDAO<Attendance> {
     public void attendanceUpdate(int id,int empId,String submissionDate,String statusSend,String ip,String day,String submissionTime);
     
     public void deleteAll();
    
}
