package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderDetailTest {

    @Test
    public void testThatSystemDisplaysOrderId(){
      OrderDetail myOrderDetail = new OrderDetail();
      myOrderDetail.setorderId(33444);
      assertEquals(33444, myOrderDetail.getorderId());
    }

    @Test
    public void testThatSystemDisplaysProductId(){
        OrderDetail myOrderDetail = new OrderDetail();
        myOrderDetail.setproductId(44333);
        assertEquals(44333, myOrderDetail.getproductId());
    }

    @Test
    public void testThatSystemDisplaysProductName(){
        OrderDetail myOrderDetail = new OrderDetail();
        myOrderDetail.setproductName("Chinomso Cotton");
        assertEquals("Chinomso Cotton", myOrderDetail.getproductName());
    }

    @Test
    public void testThatSystemDisplaysQuantity(){
        OrderDetail myOrderDetail = new OrderDetail();
        myOrderDetail.setquantity(5000);
        assertEquals(5000, myOrderDetail.getquantity());
    }

    @Test
    public void testThatSystemDisplaysUnitCost(){
        OrderDetail myOrderDetail = new OrderDetail();
        myOrderDetail.setunitCost(500);
        assertEquals(500, myOrderDetail.getunitCost());
    }

    @Test
    public void testThatSystemDisplaySubTotal(){
        OrderDetail myOrderDetail = new OrderDetail();
        myOrderDetail.setsubTotal(200_000);
        assertEquals(200_000, myOrderDetail.getsubTotal());
    }
}
