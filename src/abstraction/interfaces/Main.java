package abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        // an instance of interface cannot be created
        // Bank b = new Bank(); // not allowed
        Bank b = new MayBank(); // interface type with a class that implements the interface
        Bank c = new Citibank();
    }
}
