package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingInfoTest {
    @Test
    public void testThatSystemAcceptsShippingId(){
        ShippingInfo myShippingInfo = new ShippingInfo();
        myShippingInfo.setshippingId("23456");
        assertEquals("23456", myShippingInfo.getshippingId());
    }

    @Test
    public void testThatSystemHasShippingType(){
        ShippingInfo myShippingInfo = new ShippingInfo();
        myShippingInfo.setshippingType("All Things Plastic");
        assertEquals("All Things Plastic", myShippingInfo.getshippingType());
    }

    @Test
    public void testThatSystemIncludesShippingCost(){
        ShippingInfo myShippingInfo = new ShippingInfo();
        myShippingInfo.setshippingCost(15000);
        assertEquals(15000, myShippingInfo.getshippingCost());
    }

    @Test
    public void testThatSystemIncludesShippingRegionId(){
        ShippingInfo myShippingInfo = new ShippingInfo();
        myShippingInfo.setshippingRegionId(123555);
        assertEquals(123555, myShippingInfo.getshippingRegionId());
    }
}
