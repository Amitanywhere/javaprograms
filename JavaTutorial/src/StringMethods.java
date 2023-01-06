import java.util.Scanner;

public class StringMethods{
    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter any string: ");
        String iStr = "  Amit    ";
        int lngth = iStr.length();
        System.out.println(lngth);
        String lwrStr = iStr.toLowerCase();
        System.out.println(lwrStr);
        String uprStr = iStr.toUpperCase();
        System.out.println(uprStr);
        String trmStr = iStr.trim();
        System.out.println(trmStr);
        System.out.println(iStr.substring(3 , 6));
        System.out.println(iStr.replace(' ' , '.'));
        System.out.println(iStr.startsWith("  A"));
        System.out.println(iStr.endsWith("  "));
        System.out.println(iStr.charAt(4));
        System.out.println(iStr.indexOf('t'));
        System.out.println(iStr.equals("Amit"));
        System.out.println(iStr.equalsIgnoreCase("  amit    "));
        String astr = "Amit Mazumder";
        System.out.println(astr.replace(' ' , '_'));
    }
}