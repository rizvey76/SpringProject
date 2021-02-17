/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service.impl;

import com.spr.mav.common.ICommonService;
import com.spr.mav.model.Attendance;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author zaman
 */
public interface IAttendanceService extends ICommonService<Attendance>{
    
     public Attendance saveToAttendane(HttpServletRequest request);
     
     public void attendanceUpdate(HttpServletRequest request);
     
     
     public void deleteAll();
    
}
