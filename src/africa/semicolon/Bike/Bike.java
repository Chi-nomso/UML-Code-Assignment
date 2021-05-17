package africa.semicolon.Bike;

public class Bike {
    private int speedInKmPerHour;
    private int currentGearNumber;
    private boolean isOn;


    public void setisOn(boolean bikeisOn) {isOn = bikeisOn;};
    public boolean getisOn() { return isOn; };

    public void setspeedInKmPerHour(int bikespeedInKmPerHour) { speedInKmPerHour = bikespeedInKmPerHour; }
    public int getspeedInKmPerHour() {return speedInKmPerHour;}


    public void setbikeGearNumber(int currentGearNumber) {this.currentGearNumber = currentGearNumber; }
    public int getbikeGearNumber() { return currentGearNumber; }


    }
