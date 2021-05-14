package africa.semicolon.Ecommerce;

public class OrderDetail {
    private int orderId;
    private int productId;
    private String productName;
    private int quantity;
    private int unitCost;
    private int subTotal;


    public void setorderId(int orderId) {
        this.orderId = orderId;
    }
    public int getorderId() {
        return orderId;
    }


    public void setproductId(int productId) {
        this.productId = productId;
    }
    public int getproductId() {
      return productId;
    }


    public void setproductName(String productName) {
        this.productName = productName;
    }
    public String getproductName() {
        return productName;
    }


    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
    public int getquantity() {
        return quantity;
    }


    public void setunitCost(int unitCost) {
        this.unitCost = unitCost;
    }
    public int getunitCost() {
        return unitCost;
    }

    public void setsubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
    public int getsubTotal() {
        return subTotal;
    }
}

