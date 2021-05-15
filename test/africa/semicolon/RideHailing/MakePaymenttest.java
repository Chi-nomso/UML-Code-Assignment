package africa.semicolon.RideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakePaymenttest {
    @Test
    public void testThatSystemAcceptCashPayments() {
        MakePayment nomsoMakePayment = new MakePayment();
        nomsoMakePayment.setcashPayment("Amount");
        assertEquals("Amount", nomsoMakePayment.getcashPayment());
    }

    @Test
    public void testThatSystemAcceptsCardPayments(){
        MakePayment nomsoMakePayment = new MakePayment();
        nomsoMakePayment.setcardPayment("Card Details");
        assertEquals("CardDetails", nomsoMakePayment.getcardPayment());
    }
}