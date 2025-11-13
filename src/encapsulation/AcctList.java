package encapsulation;

public class AcctList {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount(100, "John", 100, AcctType.SAVINGS);
        BankAccount ac2 = new BankAccount();

        // ac2.accName = "Alex"; // Not allowed as members are private

        ac2.setAccId(101);
        ac2.setAccName("Alex");
        ac2.setBalance(750f);
        ac2.setAcctype(AcctType.CURRENT);

        System.out.println(ac1.getAccId());
        System.out.println(ac1.getAccName());
        System.out.println(ac1.getBalance());
        System.out.println(ac1.getAcctype());

        System.out.println(ac1);
        System.out.println(ac2);
    }

}
