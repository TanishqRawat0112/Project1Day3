package com.employee;

public class MissingGradeException extends Exception{
    private int studentId;

    MissingGradeException(int studentId){
        super("GPAs must be computed only after all students have received grades.");
        this.studentId = studentId;
    }

    public int getStudentId(){
        return studentId;
    }
}
