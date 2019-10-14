package budget_app.model;

public class AccountType {

    private int account_type_id;
    private String account_type_name;

    public AccountType(String account_type_name) {
        this.account_type_name = account_type_name;
    }

    public int getAccount_type_id() {
        return account_type_id;
    }

    public void setAccount_type_id(int account_type_id) {
        this.account_type_id = account_type_id;
    }

    public String getAccount_type_name() {
        return account_type_name;
    }

    public void setAccount_type_name(String account_type_name) {
        this.account_type_name = account_type_name;
    }

    @Override
    public String toString() {
        return account_type_name;
    }
}
