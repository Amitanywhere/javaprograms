public class Modifier {

    // final modifier for attribute
    // can not override
    final int x = 56;
    static String staticString = "i am a static var";
    public static void main(String[] args){
        /* modifier are 2 types 1. access modifier , 2. non-access modifier
         1. access modifier
         for classes there are 2 type modifier public and default
         public class accessible through any other class and if we don't specify any modifier it acts like
         default that particular class we can use in the same package.
         For attribute , methods and constructor we can use public , private , protected and default modifier
         public - accessible through all the classes.
         private - accessible through only to particular class where it is decleared
         protected - accessible in the same package and subclasses
         default - only accessible in the same package

         2. Non access modifier -
         for classes we can use final and abstract
         if final is used class can not be inherited by other class.
         class can not be used to create object
         */
        // if we want override x it will give error
        Modifier mdf = new Modifier();
//        mdf.x = 45;
        // we can access static attribute or methods without creating any object of that class
        System.out.println(Modifier.staticString);

    }
}
