package classesandobjects;

public class DefaultValues {
    // Instance variable
    int i;
    double d;
    String s;

    // static Variable
    static int count;

    public static void main(String[] args) {
        DefaultValues d = new DefaultValues();
        System.out.println("The default value for int type is " + d.i);
        System.out.println("The default value for double type is " + d.d);
        System.out.println("The default value for String type is " + d.s);

        System.out.println(DefaultValues.count);
    }
}
