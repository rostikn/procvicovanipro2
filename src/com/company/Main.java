package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher teacher = new Teacher("Jan");
        Student student = new Student("David");
        student.addGrade(new Grade("test", "cj", 5, teacher));
        student.showAllGrades();
    }
}
