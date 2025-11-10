package basics;

public class DataTypes {
    public static void main(String[] args) {
        /*
         * Primitive types
         * byte
         * short
         * int
         * long
         * float
         * double
         * char
         * boolean
         */
        // object
        // String

        // byte
        // 8 bit signed integers (positive and negative)
        byte byt = 8;

        // short
        // 16 bit signed integers
        short shrt = 10;

        // int
        // 32 bit signed integers
        int i = 199;

        // long
        // 64 bit signed integers
        long l = 9988;

        // float
        // 32 bit signed floating values
        float f = 10.5f;

        // double
        // 64 bit signed floating values
        double d = 1667.88;

        // chr
        // 16 bit uncode characters
        char c = 'a';
        char b = '\u03B1';

        // boolean
        boolean isTrue = false;

        // print all the variable values
        System.out.println(byt);
        System.out.println(shrt);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(isTrue);

        // String
        // object type and hence has no size
        String msg = "This is coded in java 21";
        System.out.println(msg.length());

    }

}
