package com.sauharda.oop_projects.courseproject;

public class Course {
    private String courseId, title, type;
    private int noOfCredits;

    public Course() {
    }

    public Course(String courseId, String title, String type, int noOfCredits) {
        this.courseId = courseId;
        this.title = title;
        this.type = type;
        this.noOfCredits = noOfCredits;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoOfCredits() {
        return noOfCredits;
    }

    public void setNoOfCredits(int noOfCredits) {
        this.noOfCredits = noOfCredits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", noOfCredits=" + noOfCredits +
                '}';
    }

    public String toString(String reason){
        return courseId + "," + title + "," + type + "," + noOfCredits + '\n';
    }
}
