package abstraction.interfaces;

public class Citibank implements Bank, Govt {

    @Override
    public double fdInterest(double amt, int period) {
        double roi = 3.5;
        double interest = (amt * period * roi) / 100;
        return interest;
    }

    @Override
    public double rdInterest(double amt, int period) {
        double roi = 2.9;
        double interest = (amt * period * roi) / 100;
        return interest;
    }

    @Override
    public void instruction() {

    }

}
