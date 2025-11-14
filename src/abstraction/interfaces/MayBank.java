package abstraction.interfaces;

public class MayBank implements Bank {

    @Override
    public double fdInterest(double amt, int period) {
        double roi = 3.0;
        double interest = (amt * period * roi) / 100;
        return interest;
    }

    @Override
    public double rdInterest(double amt, int period) {
        double roi = 2.0;
        double interest = (amt * period * roi) / 100;
        return interest;
    }

}
