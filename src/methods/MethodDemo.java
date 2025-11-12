package methods;

public class MethodDemo {
    /*
     * Syntax of a method or a signature of method
     * [<access_Modifier>] [static] <return_type> <Method_name>([parameters])
     * 1. The access Modifier (optional), if omitted it is "default"
     * 1. public
     * 2. private
     * 3. protected
     * 4. package (default)
     * 2. Return type is mandatory
     * 3. if the method does not return anything then the type should be "void"
     * 4. Method naming convention - Camel casing
     * 5. zero or more arguments (parameters)
     * 6. Return statement (if present) is the last statement to get executed.
     */

    /*
     * There can be any number of methods in a class (zero or more)
     * Main method is the entry point to an class (not mandatory)
     * Methods are of 2 types
     * 1. Instance Method
     * 2. Static Method
     */

    // declare an instance method
    public int sum() { // has no parameters and return int
        return 10 + 10;
    }

    public String conv(String val) { // has one parameter of string type and returns String
        return val.toUpperCase();
    }

    public void greet() { // no parameter and no return value
        System.out.println("Hello Java");
    }

    public void greetPerson(String name) { // one parameter and no return value
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        MethodDemo md = new MethodDemo();

        // calling the sum()
        int res = md.sum();
        System.out.println(res);
        // or
        System.out.println(md.sum());

        // calling conv(String)
        String t = md.conv("hello");
        System.out.println(t);
        // or
        System.out.println(md.conv("hello"));

        // calling greet()
        md.greet();

        // calling greetPerson(String)
        md.greetPerson("Alex");
    }

}
