package exceptions;

public class ZeroDivide {
    public static void main(String[] args) {
        int x = 10, y = 0, res = 0;
        try {
            res = x / y;
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

        System.out.println("other lines of code");
        System.out.println("other lines of code");
        System.out.println("other lines of code");
        System.out.println("other lines of code");

    }
}
