import java.util.Scanner;

public class StringMethods{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String inputStr = input.nextLine();

        int lenStr = inputStr.length();

        System.out.println("Length of input string - " + lenStr);

        String lowerStr = inputStr.toLowerCase();

        System.out.println("Lower case of input string - " + lowerStr);

        String upperStr = inputStr.toUpperCase();

        System.out.println("UpperCase of input string - " + upperStr);

        String trmStr = inputStr.trim();

        System.out.println("String after trim - " + trmStr);

        System.out.println(inputStr.substring(3 , 6));

        System.out.println(inputStr.replace(' ' , '.'));

        System.out.println(inputStr.startsWith("A"));

        System.out.println(inputStr.endsWith("z"));

        System.out.println(inputStr.charAt(4));

        System.out.println(inputStr.indexOf('t'));

        System.out.println(inputStr.equals("Amit"));

        System.out.println(inputStr.equalsIgnoreCase("  amit    "));

        String myName = "Amit Mazumder";

        System.out.println(myName.replace(' ' , '_'));
    }
}