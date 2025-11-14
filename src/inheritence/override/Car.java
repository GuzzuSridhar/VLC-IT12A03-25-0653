package inheritence.override;

public class Car extends Vehicle {

    /*
     * Compile-time polymorphism --> Method overloading
     * Runtime polymorphism --> Method overriding
     */

    @Override
    void start() {
        System.out.println("The car engine is starting");
    }

    @Override
    void wheels() {
        System.out.println("Car has 4 wheels");
    }
}
