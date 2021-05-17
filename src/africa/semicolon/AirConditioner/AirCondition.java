package africa.semicolon.AirConditioner;

public class AirCondition {
    private boolean isOn;
    private String productName;
    private int temperature;

    public AirCondition(String name){
        productName = name;
    }


    public void setisOn(boolean AcisOn) {
        this.isOn = AcisOn;
    }
    public boolean getisOn() {
        return isOn;
    }


    public void setProductName(String nanaAc) {
        productName = nanaAc;
    }
    public String getProductName() {
        return productName;
    }

    public void setTemperature(int TempSet) {
        temperature = TempSet;
    }
    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature > 16 && temperature < 30) {
            temperature = temperature + 1;
        }else{
            temperature = temperature;
        }

    }

    public void decreaseTemperature() {
        if (temperature > 16 && temperature < 30) {
            temperature = temperature - 1;
        } else {
            temperature = temperature;
        }
    }
}