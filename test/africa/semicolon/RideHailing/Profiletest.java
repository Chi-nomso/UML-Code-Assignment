package africa.semicolon.RideHailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Profiletest {
    @Test
    public void testThatSystemDisplaysBio(){
        Profile nomsoProfile = new Profile();
            nomsoProfile.setbio("Professional Pilot Nomso");
            assertEquals("Professional Pilot Nomso", nomsoProfile.getbio());
        }

        @Test
    public void SystemCanDisplaySextest(){
            Profile nomsoProfile = new Profile();
            nomsoProfile.setsex("Female");
            assertEquals("Female", nomsoProfile.getsex());
        }

        @Test
    public void SystemCanDisplayNametest(){
            Profile nomsoProfile = new Profile();
            nomsoProfile.setname("Chinomso Special");
            assertEquals("Chinomso Special", nomsoProfile.getname());
        }

        @Test
    public void testThatSystemCanAcceptUsername(){
            Profile nomsoProfile = new Profile();
            nomsoProfile.setusername("SageNomso");
            assertEquals("SageNomso", nomsoProfile.getusername());
        }
}
