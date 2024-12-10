package com.sauharda.oop_projects.studentproject;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name, major, gender;
    private float cgpa;
    private LocalDate dob;
    private String skills;

    public Student() {
    }

    public Student(int id, String name, String major, String gender, float cgpa, String skills, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gender = gender;
        this.cgpa = cgpa;
        this.skills = skills;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getGender() {
        return gender;
    }

    public float getCgpa() {
        return cgpa;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getSkills() {
        return skills;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", gender='" + gender + '\'' +
                ", cgpa=" + cgpa +
                ", dob=" + dob +
                ", skills='" + skills + '\'' +
                '}';
    }
}
