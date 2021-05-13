package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyerTest {
    @Test
    public void testThatSystemCanTakeBuyerName(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerName("Chinomso");
        assertEquals("Chinomso", myBuyer.getBuyerName());
    }

    @Test
    public void testThatSystemAcceptsAddress(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerAddress("15 Adeokun Street, Lagos");
    }

    @Test
    public void testThatSystemAcceptsEmailAddress(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerEmailAddress("sharp@yahoo.com");
    }

    @Test
    public void testThatSystemAcceptsPhoneNumber(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerPhoneNumber("08022233344");
    }

    @Test
    public void testThatSystemAcceptsCreditCardInfo(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyerCreditCardInfo("NomsoUBABank");
    }

    @Test
    public void testThatSystemAcceptsshippingInfo(){
        Buyer myBuyer = new Buyer();
        myBuyer.setBuyershippingInfo("NomsoContainer");
    }
}
