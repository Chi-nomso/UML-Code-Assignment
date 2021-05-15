package africa.semicolon.RideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {
    @Test
    public void testThatSystemDisplaysUsername(){
        Passenger nomsoPassenger = new Passenger();
        nomsoPassenger.setusername("Sage Nomso");
        assertEquals("Sage Nomso", nomsoPassenger.getusername());
    }
}
