package accessmodifiers;

public class ClassOne {
    public static void main(String[] args) {
        // access variables in the different class in same package
        // ClassTwo.privateVariable = 10;
        ClassTwo.publicVariable = 10;
        ClassTwo.protectedVariable = 10;
        ClassTwo.defaultAccessModifierVariable = 10;
        // access methods in the different class in same package
        ClassTwo.testDefault();
        // ClassTwo.testPrivate();
        ClassTwo.testpublic();
        ClassTwo.testprotected();
    }
}
