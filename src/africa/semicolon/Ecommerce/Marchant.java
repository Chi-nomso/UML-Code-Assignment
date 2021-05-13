package africa.semicolon.Ecommerce;

public class Marchant {
    private String name;
    private int userId;
    private int password;
    private String loginStatus;


    public void setMarchantname(String Chinomso) {
        this.name = name;
    }
    public String getMarchantname(){
        return name;
    }


    public void setMarchantuserId(int userId) {
     this.userId = userId;
    }
    public int getMarchantuserId(){
        return userId;
    }

    public void setMarchantpassword(int password) {
        this.password = password;
    }
    public int getMarchantpassword() {
        return password;
    }

    public void setMarchantloginstatus(String loggedIn) {
        this.loginStatus = loginStatus;
    }
    public String getMarchantloginstatus() {
        return loginStatus;
    }
}

