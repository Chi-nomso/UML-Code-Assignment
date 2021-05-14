package africa.semicolon.Ecommerce;

public class Orders {
    private int orderId;
    private int dateOrdered;
    private String customerName;
    private int customerId;


    public void setorderId(int orderId) {
        this.orderId = orderId;
    }
    public int getorderId() {
        return orderId;
    }


    public void setdateOrdered(int dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public int getdateOrdered() {
        return dateOrdered;
    }


    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getcustomerName() {
        return customerName;
    }


    public void setcustomerId(int customerId) {
        this.customerId = customerId;
    }
    public int getcustomerId() {
        return customerId;
    }
}
