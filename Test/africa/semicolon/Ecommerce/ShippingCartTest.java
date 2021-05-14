package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingCartTest {
    @Test
    public void testThatSystemIncludesCartId(){
        ShippingCart myShippingCart = new ShippingCart();
        myShippingCart.setShippingCartId(654321);
        assertEquals(654321, myShippingCart.getShippingId());
    }

    @Test
    public void testThatSystemIncludesProductId(){
        ShippingCart myShippingCart = new ShippingCart();
        myShippingCart.setShippingProductid(789987);
        assertEquals(789987, myShippingCart.getShippingProductId());
    }

    @Test
    public void testThatSystemIncludesQuantity(){
        ShippingCart myShippingCart = new ShippingCart();
        myShippingCart.setShippingQuantity(500);
        assertEquals(500, myShippingCart.getShippingquantity());
    }

    @Test
    public void testThatSystemIncludesDateAdded(){
        ShippingCart myShippingCart = new ShippingCart();
        myShippingCart.setShippingDateAdded(01_01_2020);
        assertEquals(01_01_2020, myShippingCart.getShippingDateAdded());
    }
}
