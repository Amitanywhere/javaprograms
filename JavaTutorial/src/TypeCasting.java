public class TypeCasting {
    public static void main(String[] args) {
        // type casting 1. widening type casting - a small size data type is converted to large size data type , this is implicit
        // type casting
        int int1 = 45;
        double dbl = int1;
        System.out.println(dbl);

        // byte -> short
        byte byte1 = 36;

        short srt = byte1;
        System.out.println(srt);

        // short to int

        short srt1 = 1453;
        int int2 = srt1;
        System.out.println(int2);

        // float to double
        float flt1 = 4.5f;
        double dbl1 = flt1;
        System.out.println(dbl1);

        // narrowing type casting - converting from higher size to lower size it is done explicitly
        char char1 = (char)byte1;
        System.out.println(char1);

        srt1 = (short) int2;
        System.out.println(srt1);

        byte1 = (byte)srt1;
        System.out.println(byte1);

    }
}
