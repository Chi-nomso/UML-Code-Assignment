package africa.semicolon.Television;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelevisionTest {
    private Television myTv;

    @BeforeEach
    public void Television(){
        myTv = new Television("Apple Tv");
    }

    @Test
    public void TelevisionIsOntest(){
        myTv.setisOn(true);
        assertTrue(myTv.getisOn());
    }

    @Test
    public void setTelevisionChanneltest(){
        myTv.settvChannel(100);
        assertEquals(100, myTv.gettvChannel());
    }

    @Test
    public void setTelevisionName(){
        myTv.settvName("Apple Tv");
        assertEquals("Apple Tv", myTv.gettvName());
    }

    @Test
    public void testThatTelevisionChannelCanBeChanged(){
        //given
     myTv.setisOn(true);
     assertTrue(myTv.getisOn());
     //and
        myTv.settvChannel(100);
        assertEquals(100, myTv.gettvChannel());
        //then
        myTv.changetvChannel(101);
        assertEquals(101,myTv.getchangetvChannel());
    }

    @Test
    public void testThatTelevisionHasADefaultVolume(){
        myTv.settvVolume(20);
        assertEquals(20, myTv.gettvVolume());
    }

    @Test
    public void testThatTelevisionHasADefaultBrightness(){
        myTv.settvBrightness(20);
        assertEquals(20,myTv.gettvBrightness());
    }

    @Test
    public void testThatTvBrightnessCanBeIncreased(){
        //given
        myTv.setisOn(true);
        assertTrue(myTv.getisOn());
        //and
        myTv.settvChannel(100);
        assertEquals(100, myTv.gettvChannel());
        //also
        myTv.settvBrightness(20);
        assertEquals(20, myTv.gettvBrightness());
        //then
        myTv.increaseBrightness();
        assertEquals(30, myTv.gettvBrightness());
        //also
    }

    @Test
    public void testThatTelevisionBrightnessCanBeDecreased(){
        //given
        myTv.setisOn(true);
        assertTrue(myTv.getisOn());
        //and
        myTv.settvChannel(100);
        assertEquals(100, myTv.gettvChannel());
        //also
        myTv.settvBrightness(20);
        assertEquals(20, myTv.gettvBrightness());
        //then
        myTv.decreaseBrightness();
        assertEquals(10, myTv.gettvBrightness());
    }

    @Test
    public void testThatTelevisionVolumeCanBeIncreased(){
        //given
        myTv.setisOn(true);
        assertTrue(myTv.getisOn());
        //and
        myTv.settvChannel(100);
        assertEquals(100, myTv.gettvChannel());
        //also
        myTv.settvVolume(20);
        assertEquals(20, myTv.gettvVolume());
        //then
        myTv.increasetvVolume();
        assertEquals(30, myTv.gettvVolume());
    }

    @Test
    public void testTelevisionVolumeCanBeDecreased(){
        //given
        myTv.setisOn(true);
        assertTrue(myTv.getisOn());
        //and
        myTv.settvChannel(100);
        assertEquals(100, myTv.gettvChannel());
        //also
        myTv.settvVolume(20);
        assertEquals(20, myTv.gettvVolume());
        //then
        myTv.decreasetvVolume();
        assertEquals(10, myTv.gettvVolume());
    }
}
