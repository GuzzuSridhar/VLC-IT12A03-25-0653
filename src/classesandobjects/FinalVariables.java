package classesandobjects;

public class FinalVariables {
    // Static Final variables are constants
    // Once value is assigned it cannot be changed

    // final instance variable
    final int id;
    String name;

    // static final (Constants)
    static final String ORG_NAME = "Google";
    static final double RATE_OF_INTEREST = 5;
    static final float PI = 3.06f;

    public FinalVariables(int id, String name) {
        this.id = id; // instantiating the value of final variable for the instance
        this.name = name;
    }

    public static void main(String[] args) {
        FinalVariables f = new FinalVariables(100, "John");
        System.out.println(f.id + " " + f.name);
        // f.id = 101; //the value can be assigned only once
        f.name = "Alex";
    }
}
