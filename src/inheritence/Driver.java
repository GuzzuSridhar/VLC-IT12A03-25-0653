package inheritence;

public class Driver {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.greet();

        Child c = new Child();
        c.greet();

        GrandChild g = new GrandChild();
        g.greet();
    }
}
