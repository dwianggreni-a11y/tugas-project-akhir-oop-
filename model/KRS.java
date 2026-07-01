/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Course;

/**
 *
 * @author User
 */
public class KRS {

    private Course course;
    private double score;
    private String grade;
    private lecture lecture1;
    private int semester;
    
    public KRS(Course course, double score) {

        this.course = course;
        this.score = score;;
        this.grade = setGrade();
    }
    public void setLecture(lecture lecture1){
        this.lecture1 = lecture1;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    public lecture getLecture(){
        return lecture1;
    }



    public Course getCourse() {
        return course;
    }

    public double getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    public String setGrade() {

        if (score >= 85)
            return "A";
        else if (score >= 75)
            return "B";
        else if (score >= 60)
            return "C";
        else
            return "D";
    }
}
