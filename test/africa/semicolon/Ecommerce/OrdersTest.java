package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdersTest {
    @Test
    public void testThatSystemDisplaysorderId(){
        Orders myOrders = new Orders();
        myOrders.setorderId(200);
        assertEquals(200, myOrders.getorderId());
    }
    @Test
    public void testThatSystemDisplaysDateOrdered(){
        Orders myOrders = new Orders();
        myOrders.setdateOrdered(01_01_2020);
        assertEquals(01_01_2020, myOrders.getdateOrdered());
    }

    @Test
    public void testThatSystemDisplaysCustomerName(){
        Orders myOrders = new Orders();
        myOrders.setcustomerName("Chinomso");
        assertEquals("Chinomso", myOrders.getcustomerName());
    }

    @Test
    public void testThatSystemDisplaysCustomerId(){
        Orders myOrders = new Orders();
        myOrders.setcustomerId(555444);
        assertEquals(555444, myOrders.getcustomerId());
    }
}
