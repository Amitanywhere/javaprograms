import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
//        System.out.println("Taking Input From user");
        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = scn.nextInt();
//        System.out.println("Enter another number");
//        int b = scn.nextInt();
        // checking if the input is integer or not
//        System.out.println("Enter whatever you want");
//        boolean chkint = scn.hasNextInt();
//        System.out.println(chkint);
        // For reading string input
//        System.out.println("Enter any sentence");
        System.out.println("Enter Your name");
        String str = scn.nextLine();
        System.out.println("Good Morning " + str);
//        System.out.printf("Sum is = %d\n" , a+b);
    }
}