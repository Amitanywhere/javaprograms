package com.students.project;

import java.util.ArrayList;
import java.util.Iterator;

public class Institute {
    public String instituteName;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Institute(String name ){
        instituteName = name;
    }
    public void getStudentList(){
        if(studentList.size() > 0){
            System.out.println("---------------" + this.instituteName +  " Student List --------------------------");
            for(Student student : studentList){

                System.out.println(student.getDetails());
            }
            System.out.println("-------------------------------------------------------");
        }
        else{
            System.out.println("No Student present...");
        }
    }

    public void updateStudent(String id , int roll , String name , float mark){
        boolean found = false;
        if(studentList.size() > 0){
            for(Student student : studentList){
                if(student.getId().equals(id)){
                    student.updateAllDetails(roll , name , mark);
                    found = true;
                }
            }
        }
        else{
            System.out.println("No students present");
        }
        if(!found){
            System.out.println("No student present with this id");
        }
    }

    public void addStudent(Student student){
        studentList.add(student);
        System.out.println("Student added successfully");
    }

    public void removeStudent(String id){
        boolean found = false;
        Iterator<Student> listItr = studentList.iterator();
        while(listItr.hasNext()){
            Student std = listItr.next();
            if(std.getId().equals(id)){
                listItr.remove();
                found = true;
            }
        }
        if(found){
            System.out.println("Student deleted successfully...");
        }
        else{
            System.out.println("No student found with this id");
        }
    }

    public static void main(String[] args) {
        Institute inst1 = new Institute("Abc Institute");
        Student std1 = new Student(12 , "Subash" , 65 , "S012");
        inst1.addStudent(std1);
        inst1.getStudentList();
        inst1.removeStudent("S012");
        inst1.getStudentList();
    }
}
