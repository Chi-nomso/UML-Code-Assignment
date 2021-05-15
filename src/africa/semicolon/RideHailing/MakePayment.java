package africa.semicolon.RideHailing;

public class MakePayment {
    private String cashPayment;
    private String cardPayment;


    public void setcashPayment(String selectcashPayment){cashPayment = selectcashPayment;}
    public String getcashPayment() { return cashPayment;}


    public void setcardPayment(String entercardDetails) {cardPayment = entercardDetails;}

    public String getcardPayment() {return cardPayment;}
}
