package com.spr.mav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "leaveData")
@Table(name = "leaveData")
public class Leave {

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
    
    ///////Leave/////////

    @Column(name = "emp_subDate")
    private String subDate;

    @Column(name = "emp_fromDate")
    private String fromDate;
    @Column(name = "emp_toDate")
    private String toDate;

    @Column(name = "emp_reqDays")
    private int reqDays;

    @Column(name = "emp_levType")
    private String levType;

    @Column(name = "emp_levReason")
    private String levReason;

    @Column(name = "emp_approveDays")
    private int approvDays;

    @Column(name = "emp_actionStatus")
    private String actionStatus; ///Ip

    @Column(name = "emp_changeStatus")
    private String changeStatus;

    @Column(name = "emp_notification")
    private int notification;

    
    
    
    
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

    public String getSubDate() {
        return subDate;
    }

    public void setSubDate(String subDate) {
        this.subDate = subDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getReqDays() {
        return reqDays;
    }

    public void setReqDays(int reqDays) {
        this.reqDays = reqDays;
    }

    public String getLevType() {
        return levType;
    }

    public void setLevType(String levType) {
        this.levType = levType;
    }

    public String getLevReason() {
        return levReason;
    }

    public void setLevReason(String levReason) {
        this.levReason = levReason;
    }

    public int getApprovDays() {
        return approvDays;
    }

    public void setApprovDays(int approvDays) {
        this.approvDays = approvDays;
    }

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public String getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
    }

    public int getNotification() {
        return notification;
    }

    public void setNotification(int notification) {
        this.notification = notification;
    }

}
