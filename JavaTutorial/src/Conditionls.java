import java.util.Scanner;

public class Conditionls{
    public static void main(String[] args){
        byte age = 10;
        if(age >= 18){
            System.out.println("You can enter");
        }
        else {
            System.out.println("You can not enter");
        }

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Age");
        int iage = scn.nextInt();
        switch (iage){
            case 18:
                System.out.println("You are become just adult");
                break;
            case 30:
                System.out.println("You are already a adult");
                break;
            case 15:
                System.out.println("You are not an adult");
                break;
            default:
                System.out.println("Your age " + iage);
                break;
        }
        // Switch case
    }



}