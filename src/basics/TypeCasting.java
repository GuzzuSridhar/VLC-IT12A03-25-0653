package basics;

public class TypeCasting {
    public static void main(String[] args) {
        /*
         * Widening Pouring water from a small cup into a larger mug (safe)
         * -- byte → short → int → long → float → double
         * Narrowing Pouring from a large jug into a small glass (may spill)
         * -- double → float → long → int → short → byte
         */

        // Windening cast implicit
        int a = 10;
        double d = a; // int -> double

        // Narrowing cast
        long l = 100;
        int i = (int) l;

        float f = (float) d;

        int ch = 66;
        System.out.println((char) ch);

        char c = 'B';
        System.out.println((int) c);

    }
}
