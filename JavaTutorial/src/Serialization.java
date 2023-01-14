import java.io.*;
public class Serialization {

    public static void main(String[] args) {
        Employee empAkash = new Employee();
        empAkash.empId = 101;
        empAkash.empName = "Akash Ghosh";
        empAkash.getDetails();

        // serialize object
        try{
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(empAkash);
            out.close();
            fileOut.close();
            System.out.println("Serialized file is stored in /serializeFile/employee.ser");
        }
        catch(IOException i){
            i.printStackTrace();
        }

    }
}

// for a class to serialized successfully the class must be implements Serializable interface
// All of the fields in the class must be serializable , it must be marked serializable , if the field is not serializable it must
//be marked transient

class Employee implements Serializable{
    public String empName;
    public int empId;

    public void getDetails(){
        System.out.printf("Employee Id - %d , Employee Name - %s" , empId , empName);
    }
}


