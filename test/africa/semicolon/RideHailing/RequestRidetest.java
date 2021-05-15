package africa.semicolon.RideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RequestRidetest {
    @Test
    public void testThatSystemCanChooseDestination(){
        RequestRide nomsoRequestRide = new RequestRide();
        nomsoRequestRide.setDestination("Magodo");
        assertEquals("Magodo", nomsoRequestRide.getDestination());
    }

    @Test
    public void testThatSystemCanDisplayMap(){
        RequestRide nomsoRequestRide = new RequestRide();
        nomsoRequestRide.setmap("Map");
        assertEquals("Map", nomsoRequestRide.getmap());
    }
}
