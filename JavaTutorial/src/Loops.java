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
        int sum = 0;
        int i = 0 , range = 10;
        while(i < range){
            sum += 2 * i;
            i++;
        }
        System.out.println("Sum of first 10 even numbers: " + sum);

        // multiplication table of a number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number for printing table: ");
        int number = input.nextInt();
        int multiplier = 1;
        while(multiplier <= 10){
            int product = number * multiplier;
            System.out.printf("%d x %d = %d\n" , number , multiplier , product);
            multiplier++;
        }

        // factorial
        int factorial = 1;
        while(number > 1){
            factorial *= number;
            number--;
        }
        System.out.println("Factorial is: " + factorial);
    }
}
