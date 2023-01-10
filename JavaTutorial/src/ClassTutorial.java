
public class ClassTutorial {
    public static void main(String[] args){
        Calculator calc = new Calculator(54 , 45);
        // we can not access calc.num1 or calc.num2 because of private modifier they are accessible with in the particular class
        // protected modifier we can use it inside the package and if through child class outside the package
        // public modifier access level inside the package as well outside the package
        // if we do not use any modifier that become default and we can use it inside that package
        int sum = calc.addition();
        // we cant access private method thats why we can not access subtraction()
//        int subRes = calc.subtraction()
        int product = calc.multiplication();

        System.out.println(product);
    }
}
// this is the class declarition syntax in java
 class Calculator {
    // instance variable
    private int num1 , num2;
    // constructor to instantiate
    public Calculator(int x , int y){
        num1 =x;
        num2 = y;
    }

    // method for addition
    public int addition(){
        return num1 + num2;
    }

    private int subtraction(){
        return num1 - num2;
    }

    protected int multiplication(){
        int res = this.subtraction();
        return res * num2;
    }
}
