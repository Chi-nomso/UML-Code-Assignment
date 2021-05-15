package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdminTest {
    @Test
    public void teatThatSystemAcceptsName(){
        Admin myAdmin = new Admin();
        myAdmin.setadminName("Chinomso");
        assertEquals("Chinomso", myAdmin.getadminName());
    }

    @Test
    public void testThatSystemSystememRequiresEmailAddress(){
        Admin myAdmin = new Admin();
        myAdmin.setadminemailAddress("Nomso@yahoo.com");
        assertEquals("Nomso@yahoo.com", myAdmin.getadminemailAddress());
    }
}
