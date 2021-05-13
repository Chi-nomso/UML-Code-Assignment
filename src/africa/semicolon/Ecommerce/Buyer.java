package africa.semicolon.Ecommerce;

public class Buyer {
    private String name;
    private String address;
    private String emailAddress;
    private String phoneNumber;
    private String creditCardInfo;
    private String shippingInfo;

    public void setBuyerName(String name){
        this.name = name;
    }
    public String getBuyerName() {
        return name;
    }

    public void setBuyerAddress(String address){
        this.address = address;
    }
    public String getBuyerAddress(){
        return address;
    }


    public void setBuyerEmailAddress(String EmailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getBuyerEmailAddress(){
        return emailAddress;
    }


    public void setBuyerPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }


    public void setBuyerCreditCardInfo(String CreditCardInfo){
        this.creditCardInfo = CreditCardInfo;
    }
    public String creditCardInfo(){
        return creditCardInfo;
    }


    public void setBuyershippingInfo(String nomsoContainer) {
        this.shippingInfo = shippingInfo;
    }
    public String shippingInfo(){
        return shippingInfo;
    }
}


