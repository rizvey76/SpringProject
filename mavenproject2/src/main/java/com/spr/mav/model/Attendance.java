/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package com.spr.mav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author zaman
 */


@Entity(name = "attendanceData")
@Table(name = "attendanceData")
public class Attendance {
    @Id
    private int id;
    
    @Column(name = "emp_id")
     private int empId;
     
    @Column(name = "emp_name")
    private String empName;
     
    @Column(name = "emp_dep")
    private String empDep;
     
     @Column(name = "emp_deg")
    private String empDeg;
    
     
     
      @Column(name = "submission_date")
    private String submissionDate;
    
       @Column(name = "submission_time")
    private String submissionTime;
    
       
        @Column(name = "status_send")
    private String statusSend;
    
     @Column(name = "ip")
    private String ip;
    
      @Column(name = "admin_message")
    private String message;
      
      
       @Column(name = "day_name")
    private String day;
       
       
       

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
       
       
       
       
       
       

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
       
       
       
       
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDep() {
        return empDep;
    }

    public void setEmpDep(String empDep) {
        this.empDep = empDep;
    }

    public String getEmpDeg() {
        return empDeg;
    }

    public void setEmpDeg(String empDeg) {
        this.empDeg = empDeg;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String getStatusSend() {
        return statusSend;
    }

    public void setStatusSend(String statusSend) {
        this.statusSend = statusSend;
    }

   

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
    
    
    
}
