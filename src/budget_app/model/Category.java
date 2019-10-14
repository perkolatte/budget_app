package budget_app.model;

public class Category {

    int category_id;
    String category_name;
    int parent_category_id;

    public Category(String category_name, int parent_category_id) {
        this.category_name = category_name;
        this.parent_category_id = parent_category_id;
    }

    public Category(int category_id, String category_name, int parent_category_id) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.parent_category_id = parent_category_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getParent_category_id() {
        return parent_category_id;
    }

    public void setParent_category_id(int parent_category_id) {
        this.parent_category_id = parent_category_id;
    }
}
