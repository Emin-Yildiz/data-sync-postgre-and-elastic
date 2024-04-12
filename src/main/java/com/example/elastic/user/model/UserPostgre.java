package com.example.elastic.user.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class UserPostgre {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private String userId;

    @Column(name = "username")
    private String username;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_first_name")
    private String userFirstName;

    @Column(name = "user_last_name")
    private String userLastName;

    @Column(name = "user_birthdate")
    private Date userBirthdate;

    @Column(name = "status")
    private Boolean status;

    public UserPostgre(){}

    public UserPostgre(String userId, String username, String userEmail, String userFirstName, String userLastName, Date userBirthdate, Boolean status) {
        this.userId = userId;
        this.username = username;
        this.userEmail = userEmail;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userBirthdate = userBirthdate;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public Date getUserBirthdate() {
        return userBirthdate;
    }

    public void setUserBirthdate(Date userBirthdate) {
        this.userBirthdate = userBirthdate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
