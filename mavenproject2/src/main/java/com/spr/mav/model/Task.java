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


@Entity(name = "task")
@Table(name = "task")
public class Task {
    
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
    
     
     @Column(name = "task_id")
    private String taskId;
    
     
     @Column(name = "task_name")
    private String taskName;
    
     
     @Column(name = "task_description")
    private String description;
    
     
     @Column(name = "task_startDate")
    private  String startDate;
    
     
     @Column(name = "task_estmDate")
    private String estmDate;
    
     
     @Column(name = "task_assignDate")
    private String assignDate;
    
     
     @Column(name = "task_empMessageDate")
    private String empMessageDate;
    
     @Column(name = "task_status")
    private String status;
    
     @Column(name = "task_taskStatus")
    private String taskStatus;
    
     @Column(name = "task_note")
    private String note;
    
     @Column(name = "task_attchment")
    private String attchment;
    
    
    

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

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEstmDate() {
        return estmDate;
    }

    public void setEstmDate(String estmDate) {
        this.estmDate = estmDate;
    }

    public String getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(String assignDate) {
        this.assignDate = assignDate;
    }

    public String getEmpMessageDate() {
        return empMessageDate;
    }

    public void setEmpMessageDate(String empMessageDate) {
        this.empMessageDate = empMessageDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAttchment() {
        return attchment;
    }

    public void setAttchment(String attchment) {
        this.attchment = attchment;
    }
    
    
    
     
     
    
}
