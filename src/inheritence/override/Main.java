package inheritence.override;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start(); // vehicle class start method

        Car c = new Car();
        c.start(); // vehicle class start method

        // polymorphism

        Vehicle ref = new Car();
        ref.start(); // calls the start of car
        ref.wheels();
        ref.noOverride();
    }
}
