package abstraction.abstractclasses;

public abstract class Bank {
    // can have combination of abstract and concrete methods

    public abstract int setRoi(); // abstract method

    public boolean canCloseAcct(int acno) {
        // logic
        return true;
    }

}
