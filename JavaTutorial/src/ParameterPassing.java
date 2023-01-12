public class ParameterPassing {
    int num1 = 5;
    // static blocks can run without main method when clas  is load
    static {
        System.out.println("i am under static block");
    }
    public static void main(String[] args) {
        int number = 10;
        System.out.println("value before method call - " + number);
        // passing by value
        increment(number);
        System.out.println("value after method call - " + number);
        // passing by reference
        ParameterPassing obj = new ParameterPassing();
        System.out.println("value before method call -" + obj.num1);
        incrementByRef(obj);
        System.out.println("value after method call - " + obj.num1);
    }

    public static void increment(int number){
        number += 5;
        System.out.println("incremented value of number - " + number);
    }
    public static void incrementByRef(ParameterPassing obj){
        obj.num1 += 5;
        System.out.println("incremented value of number - " + obj.num1);
    }
}
