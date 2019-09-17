package budget_app.model;

public class Account {

    private int account_id;
    private String account_name;
    private int account_type_id;
    private double account_balance;

    public Account(int account_id, String account_name, int account_type_id, double account_balance) {
        this.account_id = account_id;
        this.account_name = account_name;
        this.account_type_id = account_type_id;
        this.account_balance = account_balance;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public int getAccount_type_id() {
        return account_type_id;
    }

    public void setAccount_type_id(int account_type_id) {
        this.account_type_id = account_type_id;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) { this.account_balance = account_balance;
    }

    @Override
    public String toString() {
        return account_name + ": " + account_balance;
    }
}
