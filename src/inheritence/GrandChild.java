package inheritence;

public class GrandChild extends Child { // multi level inheritence

    GrandChild() {
        System.out.println("Grand Child class constructor called");
    }

    void greet() {
        System.out.println("Hello from Grand Child class");
    }
}
