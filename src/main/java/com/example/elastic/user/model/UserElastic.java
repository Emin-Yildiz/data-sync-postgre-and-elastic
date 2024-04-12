package com.example.elastic.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "users")
public class UserElastic {

    @Id
    @Field(type = FieldType.Text, name = "name")
    private String userId;

    @Field(type = FieldType.Text, name = "username")
    private String username;

    @Field(type = FieldType.Text, name = "user_email")
    private String userEmail;

    @Field(type = FieldType.Text, name = "user_first_name")
    private String userFirstName;

    @Field(type = FieldType.Text, name = "user_last_name")
    private String userLastName;

    @Field(type = FieldType.Date, name = "user_birthdate")
    private Date userBirthdate;

    public UserElastic(){}

    public UserElastic(String userId, String username, String userEmail, String userFirstName, String userLastName, Date userBirthdate) {
        this.userId = userId;
        this.username = username;
        this.userEmail = userEmail;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userBirthdate = userBirthdate;
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
}
