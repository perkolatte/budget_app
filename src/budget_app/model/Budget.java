package budget_app.model;

public class Budget {

    private int budget_id;
    private double amount;
    private int category_id;
    private int parent_category_id;
    private int user_id;

    public Budget(int budget_id, double amount, int category_id, int parent_category_id, int user_id) {
        this.budget_id = budget_id;
        this.amount = amount;
        this.category_id = category_id;
        this.parent_category_id = parent_category_id;
        this.user_id = user_id;
    }

    public int getBudget_id() {
        return budget_id;
    }

    public void setBudget_id(int budget_id) {
        this.budget_id = budget_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getParent_category_id() {
        return parent_category_id;
    }

    public void setParent_category_id(int parent_category_id) {
        this.parent_category_id = parent_category_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "budget " + category_id + ": " + amount;
    }
}
