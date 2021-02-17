
package com.spr.mav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "empl")
@Table(name = "empl")
public class Employee {
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
    
    @Column(name = "emp_phn")
    private String empPhn;

    @Column(name = "emp_email")
    private String empEmail;
    
     @Column(name = "emp_address")
    private String empAddress;

    @Column(name = "emp_birth")
    private String empBirth;

    @Column(name = "emp_gen")
    private String empGen;

    @Column(name = "emp_nid")
    private String empNid;

    @Column(name = "emp_bgroup")
    private String empBgroup;
    
    @Column(name = "emp_jdate")
    private String empJdate;

    @Column(name = "b_salary")
    private double bSalary;

    
    
    
    public double getbSalary() {
        return bSalary;
    }

    public void setbSalary(double bSalary) {
        this.bSalary = bSalary;
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

    public String getEmpPhn() {
        return empPhn;
    }

    public void setEmpPhn(String empPhn) {
        this.empPhn = empPhn;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpBirth() {
        return empBirth;
    }

    public void setEmpBirth(String empBirth) {
        this.empBirth = empBirth;
    }

    public String getEmpGen() {
        return empGen;
    }

    public void setEmpGen(String empGen) {
        this.empGen = empGen;
    }

    public String getEmpNid() {
        return empNid;
    }

    public void setEmpNid(String empNid) {
        this.empNid = empNid;
    }

    public String getEmpBgroup() {
        return empBgroup;
    }

    public void setEmpBgroup(String empBgroup) {
        this.empBgroup = empBgroup;
    }

    public String getEmpJdate() {
        return empJdate;
    }

    public void setEmpJdate(String empJdate) {
        this.empJdate = empJdate;
    }

   
    
    
    
    

  


    
}
