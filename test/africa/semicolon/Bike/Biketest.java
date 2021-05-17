package africa.semicolon.Bike;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Biketest {
        @Test
        public void testThatBikeIsOn(){
        Bike nomsoBike = new Bike();
        nomsoBike.setisOn(true);
        assertTrue(nomsoBike.getisOn());
    }

    @Test
    public void testBikeSpeedInKmPerHour(){
        Bike nomsoBike = new Bike();
        //given
        nomsoBike.setisOn(true);
        assertTrue(nomsoBike.getisOn());
        //then
        nomsoBike.setspeedInKmPerHour(20);
        assertEquals(20, nomsoBike.getspeedInKmPerHour());
    }

    @Test
    public void testThatBikeHasGearNumber(){
        Bike nomsoBike = new Bike();
        //given
        nomsoBike.setisOn(true);
        assertTrue(nomsoBike.getisOn());
        //then
        nomsoBike.setbikeGearNumber(1);
        assertEquals(1, nomsoBike.getbikeGearNumber());
    }

    @Test
    public void testThatBikeSpeedInKmPerHour(){
        Bike nomsoBike = new Bike();
        //given
        nomsoBike.setspeedInKmPerHour(21);
        //where
        }
}
