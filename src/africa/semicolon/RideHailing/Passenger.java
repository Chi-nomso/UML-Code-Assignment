package africa.semicolon.RideHailing;

public class Passenger {
    private String username;
    private String emailAddress;
    private int userId;
    private String phoneNumber;


    public void setusername(String Driverusername){
        username = Driverusername;
    }

    public String getusername() {
        return username;
    }

    public void setemailAddress(String NomsoemailAddress) {
        emailAddress = NomsoemailAddress;
    }
    public String getemailAddress() {
        return emailAddress;
    }

    public void setuserId(int NomsouserId) {
        userId = NomsouserId;
    }
    public int getuserId() {
        return userId;
    }


    public void setphoneNumber(String passengerPhoneNumber) {
        phoneNumber = passengerPhoneNumber;
    }
    public String getphoneNumber() {
        return phoneNumber;
    }
}

