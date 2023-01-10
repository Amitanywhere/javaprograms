import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        // star pattern printing
//        for(int i=0; i<5; i++){
//            for(int j=5-i; j>0; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // sum of first n even numbers
//        int sum = 0;
//        int i = 0 , n = 10;
//        while(i < n){
//            sum += 2 * i;
//            i++;
//        }
//        System.out.println("Sum of first 10 even numbers: " + sum);

        // multiplication table of a number
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number for printing table: ");
        int number = scn.nextInt();
//        int i = 1;
//        while(i <= 10){
//            System.out.printf("%d x %d = %d\n" , number , i , number * i);  // You are not following the naming convention .?
//            i++;
//        }

        // factorial
        int factorial = 1;
        while(number > 1){
            factorial *= number;
            number--;
        }
        System.out.println("Factorial is: " + factorial);
    }
}
