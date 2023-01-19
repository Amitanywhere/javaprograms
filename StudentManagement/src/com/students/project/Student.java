package com.students.project;

import java.util.Random;

interface StudentMethods{
    public String getDetails();
    public <T> void updateAllDetails(T ...data);
}

public class Student implements StudentMethods {
    private String studentId , studentName;
    private int studentRoll;
    private float studentMark;

    public Student(int roll , String name , float mark , String id){
            studentRoll = roll;
            studentName = name;
            studentMark = mark;
            studentId = id;

    }
    public String getDetails(){
        String studentDetails = "";
        studentDetails += "Student Id - " + studentId + " Student roll - " + studentRoll + " Student Name - " + studentName + " Student Mark - " + studentMark;
        return  studentDetails;
    }
    public <T> void  updateAllDetails(T ...data){
        studentRoll = (int)data[0];
        studentName = (String) data[1];
        studentMark = (int)data[2];
        System.out.println("Details updated successfully......");
    }

    public void updateRoll(int roll){
        studentRoll = roll;
        System.out.println("Student roll updated successfully...");
    }

    public void updateName(String name){
        studentName = name;
        System.out.println("Student roll updated successfully...");
    }

    public void updateMark(float mark){
        studentMark = mark;
        System.out.println("Student mark updated successfully...");
    }

    public String getId(){
        return studentId;
    }

    public String getName(){
        return studentName;
    }

    public int getRoll(){
        return studentRoll;
    }

    public float getMark(){
        return studentMark;
    }


//    public static void main(String[] args) {
//        try {
//            Student std1 = new Student(12, "Asish" , 56);
//            System.out.println(std1.getMark());
//            System.out.println(std1.getId());
//            System.out.println(std1.getDetails());
//            std1.updateMark(54);
//            System.out.println(std1.getDetails());
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }

}
