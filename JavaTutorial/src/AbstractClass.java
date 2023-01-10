public class AbstractClass {
    public static void main(String[] args){
       // Animal dog = new Animal();  give error can not create object of abstract class
        // to use the method of abstract we have to inherit subclass from it and create object of the subclass
        // a subclass must override all the abstract method of the abstract class
        // if there is any static attribute or Method in the abstractclass we can use it reference to the abstract class
        Dog dog = new Dog();
        dog.makeSound();
        dog.animalEat();
        Animal.run();
    }
}

// abstract class
abstract class Animal{
    // static method
    public static void run(){
        System.out.println("Animal can run");
    }
    // abstract method
    abstract void makeSound();

    public void animalEat(){
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal {

    // implementation of abstract method
    public void makeSound(){
        System.out.println("bark");
    }
}

