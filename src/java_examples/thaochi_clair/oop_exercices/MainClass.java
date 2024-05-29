package java_examples.thaochi_clair.oop_exercices;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        myMethodSV();

    }
    static void myMethodSV() {
        studentList myStudentObj = new studentList();

        Scanner myScannerObj = new Scanner(System.in);
        System.out.println("Please input student ID.");
        String studentID = myScannerObj.nextLine();
        myStudentObj.setStudentID(studentID);
        System.out.println("Please input student name.");
        String studentName = myScannerObj.nextLine();
        myStudentObj.setStudentName(studentName);
        System.out.println("Please input student age.");
        int studentAge = myScannerObj.nextInt();
        myStudentObj.setStudentAge(studentAge);
        System.out.println(myStudentObj.toString());
        System.out.println(myStudentObj.getUpperName());
        System.out.println(myStudentObj.getYearOfBirth());
    }
}

