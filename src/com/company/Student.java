package com.company;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Grade> grades = new ArrayList<>();


    public void addGrade(Grade grade){
        grades.add(grade);
    }

    public Student(String name) {
        this.name = name;
    }

    public void showAllGrades(){
        for (Grade grade : grades) {
            System.out.println(grades);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }
}
