/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.service.impl;

import com.spr.mav.common.ICommonService;
import com.spr.mav.model.SalaryHistory;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author zaman
 */
public interface ISalaryHistoryService extends ICommonService<SalaryHistory> {
    
     public SalaryHistory saveToHistory(HttpServletRequest request); 
    
}
