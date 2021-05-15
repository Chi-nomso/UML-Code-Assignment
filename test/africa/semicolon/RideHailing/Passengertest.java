package africa.semicolon.RideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Passengertest {
    @Test
    public void testThatSystemDisplaysUsername(){
        Passenger nomsoPassenger = new Passenger();
        nomsoPassenger.setusername("Sage Nomso");
        assertEquals("Sage Nomso", nomsoPassenger.getusername());
    }

    @Test
    public void testThatSystemDisplaysEmailAddress(){
        Passenger nomsoPassenger = new Passenger();
        nomsoPassenger.setemailAddress("Nomso@yahoo.com");
        assertEquals("Nomso@yahoo.com", nomsoPassenger.getemailAddress());
    }
    @Test
    public void testThatSystemRequiresUserId(){
        Passenger nomsoPassenger = new Passenger();
        nomsoPassenger.setuserId(444555);
        assertEquals(444555, nomsoPassenger.getuserId());
    }

    @Test
    public void testThatSystemRequiresPhoneNumber(){
        Passenger nomsoPassenger = new Passenger();
        nomsoPassenger.setphoneNumber("08099988877");
        assertEquals("08099988877", nomsoPassenger.getphoneNumber());
    }
}
