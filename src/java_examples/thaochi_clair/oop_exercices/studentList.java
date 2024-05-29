package java_examples.thaochi_clair.oop_exercices;

import java.util.Scanner;

public class studentList {
    String studentID ;
    String studentName;
    int studentAge;


    @Override
    public String toString() {
        return "studentList{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getYearOfBirth() {
        return 2024 - studentAge;
    }

    public String getUpperName() {
        return studentName.toUpperCase();
    }


}