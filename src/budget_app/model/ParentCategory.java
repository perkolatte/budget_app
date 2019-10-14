package budget_app.model;

public class ParentCategory {

    int parent_category_id;
    String parent_category_name;

    public ParentCategory(String parent_category_name) {
        this.parent_category_name = parent_category_name;
    }

    public int getParent_category_id() {
        return parent_category_id;
    }

    public void setParent_category_id(int parent_category_id) {
        this.parent_category_id = parent_category_id;
    }

    public String getParent_category_name() {
        return parent_category_name;
    }

    public void setParent_category_name(String parent_category_name) {
        this.parent_category_name = parent_category_name;
    }
}
