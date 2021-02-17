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
@Entity(name ="salaryHistory")
@Table(name = "salaryHistory")
public class SalaryHistory {
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

    
    ////new /////
    @Column(name = "b_salary")
    private double bSalary;
    
    
    
    
    @Column(name = "sp_salary")
    private double specialPay;
    
    
    
      @Column(name = "bonus_salary")
    private double bonus;
    
    
    
    
    
    
    @Column(name = "incre_salary")
    private double increment;
    
    
    
    
     @Column(name = "incre_Percent")
    private double increPercent;
    
     
     
     
    
    
    @Column(name = "mdeduc_salary")
    private double mDeduction;
    
    
    @Column(name = "deduc_salary")
    private double deduction;
    
    
    
    
    
    
     @Column(name = "deduc_Percent")
    private double deducPercent;
     
     
     
     
    
    
    @Column(name = "insu_salary")
    private double insurance;
    
    
    @Column(name = "loan_salary")
    private double loans;
    
    
    @Column(name = "net_salary")
    private double netSalary;
    
    ////////////////////////////////////////
    @Column(name = "month_salary")
    private String month;
    
    @Column(name = "year_salary")
    private String year;
    
    @Column(name = "status_salary")
    private String status;
    
    
    
    
    

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

    public double getbSalary() {
        return bSalary;
    }

    public void setbSalary(double bSalary) {
        this.bSalary = bSalary;
    }

    public double getSpecialPay() {
        return specialPay;
    }

    public void setSpecialPay(double specialPay) {
        this.specialPay = specialPay;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    public double getIncrePercent() {
        return increPercent;
    }

    public void setIncrePercent(double increPercent) {
        this.increPercent = increPercent;
    }

    public double getmDeduction() {
        return mDeduction;
    }

    public void setmDeduction(double mDeduction) {
        this.mDeduction = mDeduction;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double getDeducPercent() {
        return deducPercent;
    }

    public void setDeducPercent(double deducPercent) {
        this.deducPercent = deducPercent;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public double getLoans() {
        return loans;
    }

    public void setLoans(double loans) {
        this.loans = loans;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
 
    
}
