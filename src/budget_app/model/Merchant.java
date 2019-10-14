package budget_app.model;

public class Merchant {

    int merchant_id;
    String merchant_name;
    int parent_category_id;
    int category_id;

    public Merchant(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public Merchant(String merchant_name, int parent_category_id) {
        this.merchant_name = merchant_name;
        this.parent_category_id = parent_category_id;
    }

    public Merchant(String merchant_name, int parent_category_id, int category_id) {
        this.merchant_name = merchant_name;
        this.parent_category_id = parent_category_id;
        this.category_id = category_id;
    }

    public int getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public int getParent_category_id() {
        return parent_category_id;
    }

    public void setParent_category_id(int parent_category_id) {
        this.parent_category_id = parent_category_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
