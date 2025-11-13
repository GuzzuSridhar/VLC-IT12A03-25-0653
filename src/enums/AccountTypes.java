package enums;

public enum AccountTypes {
    SAVINGS("AC01"), CURRENT("AC02");

    private String acCode;

    AccountTypes(String acCode) {
        this.acCode = acCode;
    }

    public String getCode() {
        return acCode;
    }
}
