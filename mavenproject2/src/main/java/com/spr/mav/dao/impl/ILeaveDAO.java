/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.dao.impl;

import com.spr.mav.common.ICommonDAO;
import com.spr.mav.model.Leave;
import java.util.List;

/**
 *
 * @author zaman
 */
public interface ILeaveDAO extends ICommonDAO<Leave>{
    
     public List<Leave> getLeaveHistory(int empId);
    
}
