public class InnerClass {
    public static void main(String[] args) {
        // create object of outer class
        Cpu cpu = new Cpu();

        // creating an object of inner class using outer class
        Cpu.Processor processor = cpu.new Processor();

        Cpu.Ram ram = cpu.new Ram();

        System.out.println("Processor cache - " + processor.getCache());
        System.out.println("Ram clock speed - " + ram.getClockSpeed());
    }
}

class Cpu {
    double price;
    // nested class
    class Processor{
        float cores;
        String manufacturer;
        float getCache(){
            return  4.2f;
        }
    }
    // nested protected class
    protected class Ram{
        float memory;
        String manufacturer;

        float getClockSpeed(){
            return 5.5f;
        }
    }
}
