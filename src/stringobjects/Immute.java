package stringobjects;

public class Immute {
    public static void main(String[] args) {
        String name = "Bill";
        System.out.println("Address before edit " + name.hashCode());
        name += " Gates";
        System.out.println("Address after edit " + name.hashCode());

    }
}
