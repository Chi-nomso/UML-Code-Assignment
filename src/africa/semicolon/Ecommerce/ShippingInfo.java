package africa.semicolon.Ecommerce;

public class ShippingInfo {
    private String shippingId;
    private String shippingType;
    private int shippingCost;
    private int shippingRegionId;

    public void setshippingId(String shippingId) {
        this.shippingId = shippingId;
    }
    public String getshippingId() {
        return shippingId;
    }


    public void setshippingType(String shippingType) {
        this.shippingType = shippingType;
    }
    public String getshippingType() {
        return shippingType;
    }


    public void setshippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }
    public int getshippingCost() {
        return shippingCost;
    }


    public void setshippingRegionId(int shippingRegionId) {
        this.shippingRegionId = shippingRegionId;
    }
    public int getshippingRegionId() {
        return shippingRegionId;
    }
}

