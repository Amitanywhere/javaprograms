import java.io.*;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {

        // try catch block
        try {
            int [] numbers = {34 , 23 , 78};
            int num4 = numbers[3];

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        // try finally block
        try {
            int res = 5 / 0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final block will be executed");
        }

        try {
            findFile();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void findFile() throws IOException , NullPointerException {
        // code that may produce exception
//        throw new NullPointerException("Null pointer exception");
        File fileName = new File("test.txt");
        FileInputStream fileStream = new FileInputStream(fileName);
    }
}
