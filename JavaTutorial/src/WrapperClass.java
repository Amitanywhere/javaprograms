public class WrapperClass {

    public static void main(String[] args) {
        // auto boxing - when a primitive data type convert to wrapper object
        int int1 = 56;
//        Integer intObj = Integer.valueOf(int1);
        // check the created object Integer object or not
        Integer intObj = int1;   // java compiler can convert it to integer object
        System.out.println(intObj);
        if(intObj instanceof Integer){
            System.out.println("An object of integer created");
        }

        // similarly for all primitive data type we can convert them to object using corresponding wrapper class
        /*
        int -> Integer , byte -> Byte , boolean -> Boolean , char -> Character , double -> Double , float -> Float , long -> Long
        short -> Short
         */

        // unboxing - process of converting object to primitive datatype
        //int int2 = intObj.intValue();
        int int2 = intObj;
        System.out.println(int2);

    }
}
