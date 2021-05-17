package africa.semicolon.AirConditioner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest {

    private AirCondition nomsoaircondition;

    @BeforeEach
    public void airCondition() {
        nomsoaircondition = new AirCondition("NanaAc");
    }

    @Test
    public void airConditionIsOntest() {
        //AirCondition nomsoairCondition = new AirCondition();
        nomsoaircondition.setisOn(true);
        assertTrue(nomsoaircondition.getisOn());
    }

    @Test
    public void airConditionHasProductNametest() {
        nomsoaircondition.setProductName("NanaAc");
        assertEquals("NanaAc", nomsoaircondition.getProductName());
    }

    @Test
    public void airConditionCanSetTemp() {
        //given
        nomsoaircondition.setisOn(true);
        assertTrue(nomsoaircondition.getisOn());
        //where
        nomsoaircondition.setTemperature(16);
        assertEquals(16, nomsoaircondition.getTemperature());
    }

    @Test
    public void airConditionCanIncreaseTemperature() {
        //given
        nomsoaircondition.setisOn(true);
        assertTrue(nomsoaircondition.getisOn());
        nomsoaircondition.setTemperature(30);
        assertEquals(30, nomsoaircondition.getTemperature());
        //where
        nomsoaircondition.increaseTemperature();
        assertEquals(30, nomsoaircondition.getTemperature());
    }

    @Test
    public void airConditionCanDecreaseTemperature(){
       //given
       nomsoaircondition.setisOn(true);
       assertTrue(nomsoaircondition.getisOn());
       nomsoaircondition.setTemperature(20);
       assertEquals(20, nomsoaircondition.getTemperature());
       //where
        nomsoaircondition.decreaseTemperature();
        assertEquals(19, nomsoaircondition.getTemperature());
    }
}
