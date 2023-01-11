public class JavaInterface {
    public static void main(String[] args) {
        // like abstract class we can not create object of interface . To use an interface other class must implement it
        // generally in java multiple inheritance is not supported but we can achieve it through interfaces where we can create
        //class by implementing multiple interfaces
        Rectangle rect = new Rectangle();
        rect.getArea(34 , 22);

        HybridCar hCar = new HybridCar();

        hCar.drive();
        hCar.cngKit();
        hCar.petrolKit();
        // we can access
        System.out.println(CngCar.speedLimit);
        CngCar.test();
    }
}

// creating an interface
interface Polygon {
    // abstract methods
    public void getArea(int length , int breath);
}

// implementing interface through class
class Rectangle implements Polygon {
    public void getArea(int length , int breadth){
        System.out.println("The Area of a Rectangle is - " + (length * breadth));
    }
}

// multiple inheritance using interface in java

interface CngCar {
    public static int speedLimit = 200;
    static void test(){
        System.out.println("use for test drive");
    }
    void drive();
    void cngKit();
}

interface PetrolCar {
    void drive();
    void petrolKit();
}

class HybridCar implements CngCar , PetrolCar {
    public void drive(){
        System.out.println("Driving a hybrid car");
    }
    public void cngKit(){
        System.out.println("The car run on cng");
    }

    public void petrolKit(){
        System.out.println("The car run on petrol");
    }
}
