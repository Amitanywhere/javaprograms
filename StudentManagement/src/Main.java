import com.students.project.Institute;
import com.students.project.Student;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Institute> instituteList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        byte inputValue;
        do{
            System.out.println("--------------------------------Welcome To Student Management------------------------------");
            System.out.println("Enter The Number you want to select");
            System.out.println("1. Add Student");
            System.out.println("2. Get Student List");
            System.out.println("3. Update Student Details");
            System.out.println("4. Delete Student");
            System.out.println("0. Exit");
            System.out.println("Enter Choise");
            inputValue = Byte.parseByte(input.nextLine());

            switch(inputValue){

                case 1:
//                    Scanner inputInst = new Scanner(System.in);
                    Institute inst = null;
                    System.out.println("Enter Institute Name - ");
                    boolean isFound = false;
                    String instName = input.nextLine();
                    Iterator<Institute> instItr = instituteList.iterator();
                    while(instItr.hasNext()){
                        Institute institute = instItr.next();
                        if(institute.instituteName.equals(instName)){
                            inst = institute;
                            isFound = true;
                        }
                    }
                    if(!isFound){
                        inst = new Institute(instName);
                    }
//                    Scanner inputStdnt = new Scanner(System.in);
                    instituteList.add(inst);
                    System.out.println("Enter Student Name - ");
                    String name = input.nextLine();
                    System.out.println("Enter Student Roll - ");
                    int roll = Integer.parseInt(input.nextLine());
                    System.out.println("Enter Student Mark - ");
                    float mark = Float.parseFloat(input.nextLine());
                    System.out.println("Enter Student Id - ");
                    String id = input.nextLine();
//                    inputStdnt.close();
                    Student student = new Student(roll , name , mark , id);
                    inst.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter Institute Name - ");
                    Institute instDetails = null;
                    boolean isPresent = false;
                    String iName = input.nextLine();
                    for(Institute institute : instituteList){
                        if(institute.instituteName.equals(iName)){
                            instDetails = institute;
                            isPresent = true;
                        }
                    }
                    if(!isPresent){
                        System.out.println("No Student Found With this name");
                    }
                    else{
                        instDetails.getStudentList();
                    }
                    break;
                case 3:
                    Institute inst1 = null;

                    System.out.println("Enter Institute Name");
                    String nameInstitute = input.nextLine();
                    for(Institute institute : instituteList){
                        if(institute.instituteName.equals(nameInstitute)){
                            inst1 = institute;
                        }
                    }
                    if(inst1 == null){
                        System.out.println("No institute found with this name");
                        break;
                    }

                    System.out.println("Enter Student Id need to be updated");
                    String stdntId = input.nextLine();
                    System.out.println("Enter update Student name");

            }
        }
        while (inputValue != 0);
    }
}