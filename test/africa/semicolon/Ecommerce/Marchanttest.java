package africa.semicolon.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Marchanttest {

    @Test
    public void testThatSystemAcceptsName(){
        Marchant myMarchant = new Marchant();
        myMarchant.setMarchantname("Chinomso");
        assertEquals("Chinomso", myMarchant.getMarchantname());
    }

    @Test
    public void testThatSystemHasUserId(){
        Marchant myMarchant = new Marchant();
        myMarchant.setMarchantuserId(33444);
        assertEquals(33444, myMarchant.getMarchantuserId());
    }

    @Test
    public void testThatSystemAcceptsPassword(){
        Marchant myMarchant = new Marchant();
        myMarchant.setMarchantpassword(1234);
        assertEquals(1234, myMarchant.getMarchantpassword());
    }

    @Test
    public void testThatSystemCanDisplayLoginStatus(){
        Marchant myMarchant = new Marchant();
        myMarchant.setMarchantloginstatus("LoggedIn");
        assertEquals("LoggedIn", myMarchant.getMarchantloginstatus());
    }
}
