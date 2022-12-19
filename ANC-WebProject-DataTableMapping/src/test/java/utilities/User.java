package utilities;

public class User {
    String userFirstName;
    String userSecondName;
    String userEmail;


    public User(String userFirstName, String userSecondName, String userEmail) {
        this.userFirstName = userFirstName;
        this.userSecondName = userSecondName;
        this.userEmail = userEmail;
    }

    public String getUserFirstName() {
        return userFirstName;
    }
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }
    public String getUserSecondName() {
        return userSecondName;
    }
    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
