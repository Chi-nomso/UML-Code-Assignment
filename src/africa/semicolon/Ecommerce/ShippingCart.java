package africa.semicolon.Ecommerce;

public class ShippingCart {
    private int cartId;
    private int productId;
    private int quantity;
    private int dateAdded;


    public void setShippingCartId(int cartId) {
        this.cartId = cartId;
    }
    public int getShippingId() {
        return cartId;
    }


    public void setShippingProductid(int productId) {
       this.productId = productId;
    }
    public int getShippingProductId() {
        return productId;
    }


    public void setShippingQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getShippingquantity() {
        return quantity;
    }


    public void setShippingDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }
    public int getShippingDateAdded() {
        return dateAdded;
    }
}
