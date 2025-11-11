package basics;

public class Operators {
    public static void main(String[] args) {
        /*
         * Types of operators
         * 1. Arithmetic Operators
         * 2. Assignment Operators
         * 3. Comparision Operators
         * 4. Logical Operators
         * 
         */

        System.out.println("-------------Arithmetic Operators-----------");
        System.out.println("Addition operator");
        System.out.println("-- can be used with Numeric and text content");
        int x = 19, y = 20;
        String fname = "Bill";
        String lname = "Gates";
        System.out.println("-- " + x + " + " + y + " = " + (x + y));
        System.out.println("-- " + fname + " " + lname);

        System.out.println("Subtraction operator");
        System.out.println("-- can be used with Numeric values");
        System.out.println("-- " + x + " - " + y + " = " + (x - y));

        System.out.println("Multiplication operator");
        System.out.println("-- can be used with Numeric values");
        System.out.println("-- " + x + " * " + y + " = " + (x * y));
        System.out.println("Division operator");
        System.out.println("-- can be used with Numeric values");
        System.out.println("-- " + x + " / " + y + " = " + (x / y));
        System.out.println("Modulus operator (Reminder)");
        System.out.println("-- can be used with Numeric values");
        System.out.println("-- " + x + " % " + y + " = " + (x % y));

        System.out.println("Pre Increment operator");
        x = 10;
        System.out.println("-- can be used with Numeric values");
        System.out.println("-- output is applied to the current operation");
        System.out.println("-- " + ++x + " " + x);

        System.out.println("Post Increment operator");
        x = 10;
        System.out.println("-- can be used with Numeric values");
        System.out.println("-- output is not applied to the current operation");
        System.out.println("-- " + x++ + " " + x);

        System.out.println("Pre Decrement operator");
        x = 10;
        System.out.println("-- can be used with Numeric values");
        System.out.println("-- output is applied to the current operation");
        System.out.println("-- " + --x + " " + x);

        System.out.println("Post Decrement operator");
        x = 10;
        System.out.println("-- can be used with Numeric values");
        System.out.println("-- output is not applied to the current operation");
        System.out.println("-- " + x-- + " " + x);

        System.out.println("-------------Assignment Operators-----------");
        System.out.println("Equals Operator");
        System.out.println("--" + "x = 5" + " => " + " 5 ");

        System.out.println("Plus Equals Operator");
        System.out.println("--" + x + " += 5" + " => " + (x += 5));

        System.out.println("Minus Equals Operator");
        System.out.println("--" + x + " -= 5" + " => " + (x -= 5));

        System.out.println("Multiplication Equals Operator");
        System.out.println("--" + x + " *= 5" + " => " + (x *= 5));

        System.out.println("Division Equals Operator");
        System.out.println("--" + x + " /= 5" + " => " + (x /= 5));

        System.out.println("Modulus Equals Operator");
        System.out.println("--" + x + " %= 5" + " => " + (x %= 5));
    }
}
