package testaccessmodifiers;

import accessmodifiers.ClassTwo;

public class ClassFour extends ClassTwo {
    public static void main(String[] args) {

        // access variables in the sub class in different package
        // ClassTwo.privateVariable = 10;
        ClassTwo.publicVariable = 10;
        ClassTwo.protectedVariable = 10;
        // ClassTwo.defaultAccessModifierVariable = 10;
        // access methods in the sub class in different package
        // ClassTwo.testDefault();
        // ClassTwo.testPrivate();
        ClassTwo.testpublic();
        ClassTwo.testprotected();
    }
}
