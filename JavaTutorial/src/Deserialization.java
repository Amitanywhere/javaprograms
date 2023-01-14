import java.io.*;

public class Deserialization {
    public static void main(String[] args) {
        Employee emp = null;
        try{
            FileInputStream fileInp = new FileInputStream("employee.ser");
            ObjectInputStream inp = new ObjectInputStream(fileInp);
            emp = (Employee) inp.readObject();
            inp.close();
            fileInp.close();
        }
        catch(IOException i){
            System.out.println(i.getStackTrace());
        }
        catch (ClassNotFoundException c){
            System.out.println(c.getStackTrace());
        }
        System.out.println(emp.empName);
        emp.getDetails();
    }
}
