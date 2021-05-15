package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Categorytest {

    @Test
    public void testThatSystemAcceptsCategoryId(){
        Category myCategory = new Category();
        myCategory.setCategoryId(1234);
        assertEquals(1234, myCategory.getCategoryId());
    }

    @Test
    public void testThatSystemAcceptsCategoryName(){
        Category myCategory = new Category();
        myCategory.setCategoryName("All Blue Laces");
        assertEquals("All Blue Laces", myCategory.getCategoryName());
    }
}
