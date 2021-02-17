/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service.impl;

import com.spr.mav.common.ICommonService;
import com.spr.mav.model.Leave;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author zaman
 */
public interface ILeaveService extends ICommonService<Leave> {
    
    public Leave adminLevDataSave(HttpServletRequest request);
    
     public List<Leave> getLeaveHistory(int empId);
    
}
