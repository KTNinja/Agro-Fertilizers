package com.example.login_register;

public class UserProfile {
    public String userAge;
    public String userEmail;
    public String userName;

    public UserProfile(){

    }

    public UserProfile(String ageUser, String emailUser, String nameUser) {
        this.userAge = ageUser;
        this.userEmail = emailUser;
        this.userName = nameUser;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
