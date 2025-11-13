package basics;

public class Boxing {
    public static void main(String[] args) {
        // Boxing - Primitive to Wrapper
        int i = 10;
        Integer in = i; // Auto-Boxing
        Integer a = Integer.valueOf(i); // Manual boxing

        // unboxing -- Wrapper to primitive
        int temp = in; // Auto unbox
    }

}
