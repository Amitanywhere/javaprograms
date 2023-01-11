public class Inheritance {
    public static void main(String[] args) {
        Bike bike = new Bike("black");
        bike.run();
        System.out.println(bike.milage);
        bike.horn();
        bike.start();

    }
}

// parent class
class Vehicle {
    String brand = "honda";

    public void run(){
        System.out.println("it can run");
    }
}

// single inheritance
class TwoWheeler extends Vehicle {

    public void horn(){
        System.out.println("pip");
    }
}

// multilevel inheritance
class Bike extends TwoWheeler {
    int milage = 100;
    String color;
    Bike(String colorName){
        color = colorName;
    }

    public void start(){
        System.out.println("bike is starting");
    }
}