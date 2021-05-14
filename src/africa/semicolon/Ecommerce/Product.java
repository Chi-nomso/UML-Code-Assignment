package africa.semicolon.Ecommerce;

public class Product {
    private String productName;
    private int productId;
    private String description;
    private int price;
    private String imageFileName;


    public void setproductName(String productName) {
        this.productName = productName;
    }
    public String getproductName() {
        return productName;
    }

    public void setproductId(int productId) {
        this.productId = productId;
    }
    public int getproductId() {
        return productId;
    }


    public void setdescription(String description) {
        this.description = description;
    }
    public String getdescription() {
        return description;
    }


    public void setprice(int price) {
        this.price = price;
    }
    public int getprice() {
        return price;
    }


    public void setimageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
    public String getimageFileName() {
        return imageFileName;
    }
}
