package encapsulation;

public class BankAccount {
    // encapsulation means that all instance members are private
    private int accId;
    private String accName;
    private float balance;
    private AcctType acctype;

    public BankAccount(int accId, String accName, float balance, AcctType acctype) {
        this.accId = accId;
        this.accName = accName;
        this.balance = balance;
        this.acctype = acctype;
    }

    public BankAccount() {
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public AcctType getAcctype() {
        return acctype;
    }

    public void setAcctype(AcctType acctype) {
        this.acctype = acctype;
    }

    @Override
    public String toString() {
        return "BankAccount [accId=" + accId + ", accName=" + accName + ", balance=" + balance + ", acctype=" + acctype
                + "]";
    }

}
