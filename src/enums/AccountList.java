package enums;

public class AccountList {
    String accHolder;
    AccountTypes acType;

    public static void main(String[] args) {
        AccountList al = new AccountList();
        al.accHolder = "Alex";
        al.acType = AccountTypes.SAVINGS;

        System.out.println(al.accHolder + " " + al.acType.getCode() + " - " + al.acType);

    }
}
