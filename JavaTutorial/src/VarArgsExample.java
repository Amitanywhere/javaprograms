public class VarArgsExample {
    public static void main(String[] args){
        // sumOfNumbers method can take different number of parameters
        System.out.println(sumOfNumbers(45 , 32));
        System.out.println(sumOfNumbers(65));
        System.out.println(sumOfNumbers(32 , 23 , 76 , 87 , 90));
        empDetails(3 , "Sachin" , "Riju" , "Abhijit");
    }

    public static int sumOfNumbers(int ... numbers){
        // varArgs in java is a method that takes variable number of arguments
        // there can be only one varArgs in a method and must be the last one
        System.out.println("length of numbers - " + numbers.length);
        int resSum = 0;
        for (int number: numbers){
            resSum += number;
        }
        return resSum;
    }

    public static void empDetails(int totalEmp , String ...names){
        System.out.println("Total employee -" + totalEmp);
        System.out.println("Employee Names -");
        for(String name : names){
            System.out.println(name);
        }
    }
}
