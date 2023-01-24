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
            System.out.println("--------------- " + this.instituteName +  " Student List --------------------------");
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
        try {
            boolean found = false;
            if (studentList.size() > 0) {
                for (Student student : studentList) {
                    if (student.getId().equals(id)) {
                        student.updateAllDetails(roll, name, mark);
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("No student present with this id");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void addStudent(Student student){
        try {
            studentList.add(student);
            System.out.println("Student added successfully");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void removeStudent(String id){
        try {
            boolean found = false;
            Iterator<Student> listItr = studentList.iterator();
            while (listItr.hasNext()) {
                Student std = listItr.next();
                if (std.getId().equals(id)) {
                    listItr.remove();
                    found = true;
                }
            }
            if (found) {
                System.out.println("Student deleted successfully...");
            } else {
                System.out.println("No student found with this id");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
