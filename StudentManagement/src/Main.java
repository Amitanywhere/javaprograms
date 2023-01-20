import com.students.project.Institute;
import com.students.project.Student;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static ArrayList<Institute> instituteList = new ArrayList<>();
    public static void main(String[] args) {
//        ArrayList<Institute> instituteList = new ArrayList<>();
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
                    addStudent();
                    break;
                case 2:
                    getStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 0:
                    System.out.println("Thank you for using Student Management.....");
                    break;
                default:
                    System.out.println("Enter valid choise");
            }
        }
        while (inputValue != 0);
    }
    public static void addStudent(){
        try {
            Scanner input = new Scanner(System.in);
            Institute inst = null;
            System.out.println("Enter Institute Name - ");
            boolean isFound = false;
            String instName = input.nextLine();
            Iterator<Institute> instItr = instituteList.iterator();
            while (instItr.hasNext()) {
                Institute institute = instItr.next();
                if (institute.instituteName.equals(instName)) {
                    inst = institute;
                    isFound = true;
                }
            }
            if (!isFound) {
                inst = new Institute(instName);
            }
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
            Student student = new Student(roll, name, mark, id);
            inst.addStudent(student);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void getStudents(){
        Scanner input = new Scanner(System.in);
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
            System.out.println("No Institute Found With this name");
        }
        else{
            instDetails.getStudentList();
        }
    }
    public static void updateStudent(){
        try {
            Scanner input = new Scanner(System.in);
            Institute inst1 = null;

            System.out.println("Enter Institute Name");
            String nameInstitute = input.nextLine();
            for (Institute institute : instituteList) {
                if (institute.instituteName.equals(nameInstitute)) {
                    inst1 = institute;
                }
            }
            if (inst1 == null) {
                System.out.println("No institute found with this name");
                return;
            }

            System.out.println("Enter Student Id need to be updated-");
            String stdntId = input.nextLine();
            System.out.println("Enter update Student name-");
            String newName = input.nextLine();
            System.out.println("Enter updated roll of the student - ");
            int newRoll = Integer.parseInt(input.nextLine());
            System.out.println("Enter updated mark of the student");
            float newMark = Float.parseFloat(input.nextLine());
            inst1.updateStudent(stdntId, newRoll, newName, newMark);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void deleteStudent(){
        try {
            Scanner input = new Scanner(System.in);
            Institute inst2 = null;

            System.out.println("Enter Institute Name");
            String nameInstitute2 = input.nextLine();
            for (Institute institute : instituteList) {
                if (institute.instituteName.equals(nameInstitute2)) {
                    inst2 = institute;
                }
            }
            if (inst2 == null) {
                System.out.println("No institute found with this name");
                return;
            }
            System.out.println("Enter Student Id to be deleted - ");
            String dStudentId = input.nextLine();
            inst2.removeStudent(dStudentId);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}