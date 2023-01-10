import java.util.Scanner;

public class Conditionls{
    public static void main(String[] args){
//        byte age = 10;
//        if(age >= 18){
//            System.out.println("You can enter");
//        }
//        else {
//            System.out.println("You can not enter");
//        }

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Age");
//        int userAge = input.nextInt();
//        switch (userAge){
//            case 18:
//                System.out.println("You are become just adult");
//                break;
//            case 30:
//                System.out.println("You are already a adult");
//                break;
//            case 15:
//                System.out.println("You are not an adult");
//                break;
//            default:
//                System.out.println("Your age " + iage);
//                break;
//        }

        // tax calculate <250000 tax = 0 , >=250000 to <= 500000 tax = 5% , >500000 to <=1000000 tax = 10% , >1000000 tax = 20%
//        System.out.println("Enter Your Income :");
//        int income = input.nextInt();
//        float tax = 0.00f;
//        if(income >= 250000 && income <= 500000){
//            tax += income * 0.05f;
//        }
//        else if(income > 500000 && income <= 1000000){
//            tax += 500000 * 0.05f + (income - 500000) * 0.1f;
//        }
//        else if(income > 1000000){
//            tax += 500000 * 0.05f + 500000 * 0.1f + (income-1000000) * 0.2f;
//        }
//
//        System.out.println("You have to pay tax amount Rs. :" + tax);
        
        // Type of website
        System.out.println("Enter website");
        String website = input.nextLine();
        if(website.endsWith(".com")){
            System.out.println("Commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("Organization website");
        } else if (website.endsWith(".in")) {
            System.out.println("Indian website");
        }
        else {
            System.out.println("Other website");
        }
    }



}