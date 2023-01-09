import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        // Array is a collection of similar type of data
        // there 3 main ways to create an array in java

        // 1. declaration and memory allocation

//        int[] ages = new int[5];

        // 2. declaration than memory allocation
//        int[] ages;
//        ages = new int[5];

        // 3. declaration than memory allocation and initialization together
//        int [] ages = {34 , 54 , 23 , 17 , 87 , 45};
        Scanner scn = new Scanner(System.in);
//        int arrsize = scn.nextInt();
//        int[] ages = new int[arrsize];
//        for(int i = 0; i<ages.length; i++){
//            System.out.printf("Enter %d element of array\n" , i);
//            ages[i] = scn.nextInt();
//        }

//        for (int i=0; i<ages.length; i++){
//            System.out.printf("%d element - %d\n" , i , ages[i]);
//        }

        // printing element using for each lop
//        for(int e:ages){
//            System.out.println(e);
//        }
        // 2-d array or matrix
        System.out.println("Enter number of rows-");
        int rowNumber = scn.nextInt();
        System.out.println("Enter number of columns-");
        int colNumber = scn.nextInt();
        int[][] matrix = new int[rowNumber][colNumber];
        for (int row=0; row<rowNumber; row++){
            for (int col=0; col<colNumber; col++){
                System.out.printf("Enter %d row %d column element- \n" , row+1 , col+1);
                matrix[row][col] = scn.nextInt();
            }
        }
        // print matrix
        for (int row=0; row<rowNumber; row++){
            for (int col =0; col<colNumber; col++){
                System.out.print(matrix[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
