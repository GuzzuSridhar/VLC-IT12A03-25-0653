package inheritence.override;

public class Vehicle {
    void wheels() {
        System.out.println("Vehicle runs on wheels");
    }

    void start() {
        System.out.println("The vehicle is starting");
    }

    void noOverride() {
        System.out.println("Vehicles own method");
    }

}
