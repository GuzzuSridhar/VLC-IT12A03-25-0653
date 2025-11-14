package inheritence.override;

public class CreditCardPayment extends PaymentProcessor {
    @Override
    void processPayment(double amt) {
        System.out.println("processing the credicard payment of $" + amt);
    }
}

// PaymentProcessor ccpay = new CreditCardPayment()
// PaymentProcessor cashpay = new PaymentProcessor()

// ccpay.updateRegister()