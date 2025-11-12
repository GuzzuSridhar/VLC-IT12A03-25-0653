package methods;

public class StaticDemo {
    // Class method or a static method
    /*
     * A static method can be accessed via the class name
     * Can also be accessed using the instance (not recomended)
     * Instance methods can be accessed within a static method (with an instance)
     */

    public static String isEven(int x) {
        // if (x % 2 == 0)
        // return "Even";
        // else
        // return "Odd";
        return (x % 2 == 0 ? "Even" : "Odd");
    }

    public static void main(String[] args) {
        String res = StaticDemo.isEven(5);
        System.out.println(res);

        // Not recomended
        StaticDemo s = new StaticDemo();
        s.isEven(10);

    }

}
