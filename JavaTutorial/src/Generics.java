public class Generics {

    public static void main(String[] args) {
        Integer[] numbers = {3 , 56 , 4 , 42 , 67};
        String[] names = {"Ashoke" , "Gora" , "jit" , "Sachin"};

        System.out.println("printing numbers-");
        printArray(numbers);
        System.out.println("Printing names-");
        printArray(names);

        // generic class
        TestGeneric<Integer> numbersObj = new TestGeneric<Integer>(10);
        System.out.println(numbersObj.getObject());
        TestGeneric<String> strObj = new TestGeneric<String>("Hello");
        System.out.println(strObj.getObject());
    }

    // printing array elements generic method
    public static <E> void printArray(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }
    }

    // generic class
    static class TestGeneric<T>{
        T obj;
        TestGeneric(T obj){
            this.obj = obj;
        }

        public T getObject(){
            return this.obj;
        }
    }

}
