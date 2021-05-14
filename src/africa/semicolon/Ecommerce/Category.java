package africa.semicolon.Ecommerce;

public class Category {
    private int CategoryId;
    private String CategoryName;


    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }
    public int getCategoryId() {
        return CategoryId;
    }


    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getCategoryName() {
        return CategoryName;
    }
}
