package com.employee;

import com.employee.StudentUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ Start of Program ------");
        int[] studentIdList = {1001,1002};
        char[][] studentsGrades = {
                {'A','A','A','B'},
                {'A','B','B'}
        };
        try{
            double[] studentsGPA = StudentUtil.calculateGPA(studentIdList, studentsGrades);
            for(int i=0;i<studentsGPA.length;i++){
                System.out.println("StudentID : "+studentIdList[i]+"'s GPA : "+studentsGPA[i]);
            }


        double higher = 3.5, lower = 3.2;
        int[] studentsInRange = StudentUtil.getStudentsByGPA(lower,higher,studentIdList,studentsGrades);
        System.out.println("Students with GPA between : "+lower+" to "+higher+" are : ");
        for(int i=0;i<studentsInRange.length;i++){
            System.out.println(studentsInRange[i]);
        }
        }
        catch(CustomIllegalArgumentException e){
            System.out.println("Illegal Argument Error : "+e.getMessage());
        }
        catch(MissingGradeException e){
            System.out.println("Invalid Data Error : "+e.getMessage()+"\n For StudentId : "+e.getStudentId());
        }

        System.out.println("------ End Of Program ------");
    }
}