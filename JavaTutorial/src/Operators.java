import java.util.Arrays;
import java.util.Scanner;

public class Operators{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st  number");
        float num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        float num2 = input.nextInt();
        // Arithmetic operator
        float sum = num1 + num2;
        System.out.printf("num1 + num2 = %d\n" , sum);

        float difference = num1 - num2;

        System.out.printf("num1 - num2 = %d\n" , difference);

        float product = num1 * num2;
        System.out.printf("num1 * num2 = %d\n" , product);

        float quotient = num1 / num2;
        System.out.printf("num1 / num2 = %d\n" , quotient);

        float reminder = num1 % num2;
        System.out.printf("num1 modulo num2 = %d\n" , reminder);

        // comparison operator
        System.out.printf("num1 == num2 = %b\n" , num1==num2);
        System.out.printf("num1 > num2 = %b\n" , num1>num2);
        System.out.printf("num1 < num2 = %b\n" , num1<num2);
        System.out.printf("num1 != num2 = %b\n" , num1!=num2);

        // logical operator && and ||
        // resulting sum after arithmetic operation
        // int + int = int
//        short + int = int , long + double = double , float + double = double
//        long + float = float  , int + float = float , char + int = int , char + short = int
    }



}