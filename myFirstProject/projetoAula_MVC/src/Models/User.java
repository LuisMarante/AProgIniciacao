
        package Models;

public class User {
    private String userType;
    private String username;
    private String password;


    public User(String type, String username, String password) {
        this.userType = type;
        this.username = username;
        this.password = password;
    }


    public String getUserType() {
        return userType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}


