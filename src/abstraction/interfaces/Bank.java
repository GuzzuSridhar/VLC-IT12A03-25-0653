package abstraction.interfaces;

public interface Bank {
    // two types of methods
    // concrete methods -- With implementation
    // abstract methods -- without implementation

    double fdInterest(double amt, int period);

    double rdInterest(double amt, int period);

    default void important() {
    }

    static void testStatic() {
    }

}
