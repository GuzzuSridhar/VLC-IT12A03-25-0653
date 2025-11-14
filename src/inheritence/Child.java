package inheritence;

public class Child extends Parent {
    // Java allows single inheritence

    Child() {
        System.out.println("Child class constructor called");
    }

    void greet() {
        System.out.println("Hello from Child class");
    }
}
