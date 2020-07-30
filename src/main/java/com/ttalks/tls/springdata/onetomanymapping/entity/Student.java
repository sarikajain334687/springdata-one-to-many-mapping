package com.ttalks.tls.springdata.onetomanymapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="student_name")
    private String studentName;

    @Column(name="student_address")
    private String studentAddress;

    @Column(name="student_rollno")
    private long studentRollNo;

    public Student(){

    }
    public Student(String studentName, String studentAddress, long studentRollNo) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentRollNo = studentRollNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public long getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(long studentRollNo) {
        this.studentRollNo = studentRollNo;
    }


}
