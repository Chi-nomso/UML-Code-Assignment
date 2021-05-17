package africa.semicolon.Bike;

public class Bike {
    private int speedInKmPerHour;
    private int currentGearNumber;
    private boolean isOn;


    public void setisOn(boolean bikeisOn) {isOn = bikeisOn;};
    public boolean getisOn() { return true; };

    public void setspeedInKmPerHour(int bikespeedInKmPerHour) { speedInKmPerHour = bikespeedInKmPerHour; }
    public int getspeedInKmPerHour() {return 20;}


    public void setbikeGearNumber(int currentGearNumber) {this.currentGearNumber = currentGearNumber; }
    public int getbikeGearNumber() { return 1; }


    public void setSpeedInKmPerHour(int bikespeedInKmPerHour){speedInKmPerHour = bikespeedInKmPerHour;}
    public int getSpeedInKmPerHour(){return 21;}
    public int getbikeGearNumber() {return  2;}


}