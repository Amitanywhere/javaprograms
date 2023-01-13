public class ExceptionPropagatting {

    public static void main(String[] args) {
        ExceptionPropagatting obj = new ExceptionPropagatting();
        obj.method2(34 , 0);
    }

    public void division(int num1 , int num2){
        // exception not caught since propagate to method 1
        System.out.println(num1 / num2);
    }

    public void method1(int num1 , int num2){
        // not caught here since propagate to method 2
        division(num1 , num2);
    }

    public void method2(int num1 , int num2){
        // exception caught here
        try {
            method1(num1 , num2);
        }
        catch (Exception e){
            System.out.println(e.getCause());
        }
    }
}
