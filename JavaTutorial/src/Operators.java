import java.util.Arrays;
import java.util.Scanner;

public class Operators{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st  number");
        int a = scn.nextInt();
        System.out.println("Enter 2nd number");
        int b = scn.nextInt();
        // Arithmetic operator
        System.out.printf("a + b = %d\n" , a+b);
        System.out.printf("a - b = %d\n" , a-b);
        System.out.printf("a * b = %d\n" , a*b);
        System.out.printf("a / b = %d\n" , a/b);
        System.out.printf("a modulo b = %d\n" , a%b);

        // comparison operator
        System.out.printf("a == b = %b\n" , a==b);
        System.out.printf("a > b = %b\n" , a>b);
        System.out.printf("a < b = %b\n" , a<b);
        System.out.printf("a != b = %b\n" , a!=b);

        // logical operator && and ||
        // resulting sum after arithmetic operation
        // int + int = int
//        short + int = int , long + double = double , float + double = double
//        long + float = float  , int + float = float , char + int = int , char + short = int
    }



}