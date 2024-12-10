package com.sauharda.oop_projects.student;

import java.time.LocalDate;

public class Employee {
    private int ID;
    private int salary;
    private String name, designation;
    private LocalDate Dob, Doj;

    public Employee() {
    }

    public Employee(int ID, int salary, String name, String designation, LocalDate dob, LocalDate doj) {
        this.ID = ID;
        this.salary = salary;
        this.name = name;
        this.designation = designation;
        this.Dob = dob;
        this.Doj = doj;
    }

    public int getID() {
        return ID;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public LocalDate getDob() {
        return Dob;
    }

    public LocalDate getDoj() {
        return Doj;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDob(LocalDate dob) {
        Dob = dob;
    }

    public void setDoj(LocalDate doj) {
        Doj = doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", Dob=" + Dob +
                ", Doj=" + Doj +
                '}';
    }
}