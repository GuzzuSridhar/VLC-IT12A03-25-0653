package accessmodifiers;

public class ClassTwo {
    // Access Modier
    /*
     * can be used with
     * class
     * instance variable
     * methods
     * interfaces
     * abstract class
     */

    /*
     * The four Access Modifiers
     * 1. Private // private access modifier (Can be accessed only within the same
     * class)
     * 2. Protected // protected access modifier (can be accessed anywhere in same
     * class / subclass
     * // subclass)
     * 3. Public // public access modifier ( anywhere, no limitation)
     * 4. Default (No access modifier mentioned) // default access modifier (within
     * the same class / package)
     * 
     */

    // variables
    private static int privateVariable;
    public static int publicVariable;
    protected static int protectedVariable;
    static int defaultAccessModifierVariable;

    // methods
    private static void testPrivate() {
        System.out.println("Private Method accessed");
    }

    public static void testpublic() {
        System.out.println("Public Method accessed");
    }

    protected static void testprotected() {
        System.out.println("Public Method accessed");
    }

    static void testDefault() {
        System.out.println(" Method accessed with default modifier");
    }

    public static void main(String[] args) {

        // access variables in the same class
        privateVariable = 10;
        publicVariable = 10;
        protectedVariable = 10;
        defaultAccessModifierVariable = 10;
        // access methods in the same class
        testDefault();
        testPrivate();
        testpublic();
        testprotected();

    }

}
