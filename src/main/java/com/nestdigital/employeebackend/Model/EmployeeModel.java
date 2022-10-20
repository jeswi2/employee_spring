package com.nestdigital.employeebackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employeees")
public class EmployeeModel {
    @Id
    @GeneratedValue
    private int id;
    private int empcode;
    private String name;
    private String designation;
    private int salary;
    private String dob;
    private String phone;
    private String email;
    private String company;
    private String doj;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, int empcode, String name, String designation, int salary, String dob, String phone, String email, String company, String doj) {
        this.id = id;
        this.empcode = empcode;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.company = company;
        this.doj = doj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }
}
