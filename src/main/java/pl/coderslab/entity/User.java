package pl.coderslab.entity;

public class User {

    private int id;
    private String userName;
    private String email;
    private String password;

    public User() {
    }

    public User(String username, String email, String password) {
        this.userName = username;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validUser(User user) {
        if (user.getUserName() == null || user.getUserName().isBlank()) {
            return false;
        }
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            return false;
        }
        if (user.getPassword() == null || user.getPassword().isBlank()) {
            return false;
        }
        return true;
    }

    public boolean validUserNoPass(User user) {
        if (user.getUserName() == null || user.getUserName().isBlank()) {
            return false;
        }
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            return false;
        }
        return true;
    }

}
