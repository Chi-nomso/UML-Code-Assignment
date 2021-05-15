package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Buyertest {
    @Test
    public void testThatSystemCanTakeBuyerName(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerName("Chinomso");
        assertEquals("Chinomso", myBuyer.getBuyerName());
    }

    @Test
    public void testThatSystemAcceptsAddress(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerAddress("15 Adeokun Street Lagos");
        assertEquals("15 Adeokun Street Lagos", myBuyer.getBuyerName());
    }

    @Test
    public void testThatSystemAcceptsEmailAddress(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerEmailAddress("sharp@yahoo.com");
        assertEquals("sharp@yahoo.com", myBuyer.getBuyerEmailAddress());
    }

    @Test
    public void testThatSystemAcceptsPhoneNumber(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerPhoneNumber("08022233344");
        assertEquals("08022233344", myBuyer.getPhoneNumber());
    }

    @Test
    public void testThatSystemAcceptsCreditCardInfo(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerCreditCardInfo("NomsoUBABank");
        assertEquals("NomsoUBABank", myBuyer.getCreditCardInfo());
    }

    @Test
    public void testThatSystemAcceptsshippingInfo(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyershippingInfo("NomsoContainer");
        assertEquals("NomsoContainer", myBuyer.getshippingInfo());
    }
}
