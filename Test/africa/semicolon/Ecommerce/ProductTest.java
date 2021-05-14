package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void testThatSystemDisplaysProductName(){
        Product myProduct = new Product();
        myProduct.setproductName("Chinomso Adire");
        assertEquals("Chinomso Adire", myProduct.getproductName());
    }

    @Test
    public void tesThatSystemDisplaysProductId(){
        Product myProduct = new Product();
        myProduct.setproductId(543345);
        assertEquals(543345, myProduct.getproductId());
    }

    @Test
    public void testThatSystemDisplaysDescription(){
        Product myProduct = new Product();
        myProduct.setdescription("All Things That Glitters");
        assertEquals("All Things That Glitters", myProduct.getdescription());
    }

    @Test
    public void testThatSystemDisplaysPrice(){
        Product myProduct = new Product();
        myProduct.setprice(50_000);
        assertEquals(50_000, myProduct.getprice());
    }

    @Test
    public void testThatSystemDisplaysImageFileName(){
        Product myProduct = new Product();
        myProduct.setimageFileName("Fabric pix");
        assertEquals("Fabric pix", myProduct.getimageFileName());
    }
}
