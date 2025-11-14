package inheritence;

public class CastingObjects {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet();

        // not allowed
        // Child c = new Parent(); // downward cast and needs casting

        Child child = (Child) p;
        child.greet();

    }

}
