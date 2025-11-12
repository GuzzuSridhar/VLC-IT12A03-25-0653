package classesandobjects;

public class DefaultValues {
    // Instance variable
    int i;
    double d;
    String s;

    // static Variable
    static int count;

    // instance method
    public void test() {

        // Local variable should be intialized befor being used
        int local_var = 10; // block variables

        if (local_var < 100) {
            int lvar_one = 100; // cannot be accessed outside the block
        }
        // System.out.println(lvar_one); // not allowed
    }

    public static void main(String[] args) {
        DefaultValues d = new DefaultValues();
        System.out.println("The default value for int type is " + d.i);
        System.out.println("The default value for double type is " + d.d);
        System.out.println("The default value for String type is " + d.s);

        System.out.println(DefaultValues.count);
    }
}
