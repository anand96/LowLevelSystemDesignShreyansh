package main.java.com.conceptcoding.creationalpatterns.builder.solution;

import java.util.List;

// Step 1: Product class - Complex Student object

public class Student {
    //mandatory fields
    int rollNumber;
    int age;
    String name;
    String branch;
    //Optional fields
    String fatherName;
    String motherName;
    List<String> subjects;
    String  mobileNo;
    String emailId;

    // Constructor - package private, only builder can create
    Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.branch = builder.branch;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.subjects = builder.subjects;
        this.mobileNo = builder.mobileNo;
        this.emailId = builder.emailId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                ", mobileNo='" + mobileNo + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
