package com.students.project;


public class Student  {
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
        try {
            studentRoll = (int) data[0];
            studentName = (String) data[1];
            studentMark = (float) data[2];
            System.out.println("Details updated successfully......");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public String getId(){
        return studentId;
    }


}
