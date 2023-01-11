public class ConstructorOverloading {
    public static void main(String[] args) {
        // constructor overloading in java is more than one constructor with different parameter
        Student san = new Student();
        san.getDetails();
        Student anik = new Student(100 , "Anik");
        anik.getDetails();
        Student kamal = new Student(102 , "Kamal" , 54);
        kamal.getDetails();
    }
}

class Student {
    private int studentId , studentRoll;
    private String studentName;

    // if we not write any constructor java compiler provide default constructor
    Student(){
        System.out.println("default constructor");
    }

    // if in our code parametarized constructor present only during creation of an instance we not provide those parameters we will
//    get error
    Student(int id  , String name){
        studentId = id;
        studentName = name;
    }

    Student(int id , String name , int roll){
        studentId = id;
        studentName = name;
        studentRoll = roll;
    }


    public void getDetails(){
        System.out.printf("Name of the student - %s , id - %d , roll - %d\n" , studentName , studentId , studentRoll);
    }
}
