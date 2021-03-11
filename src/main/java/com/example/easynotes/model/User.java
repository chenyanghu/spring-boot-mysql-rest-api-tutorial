package com.example.easynotes.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class User implements Serializable {
    Long id;

    @ApiModelProperty(value = "Email")
    String email;
    @ApiModelProperty(value = "User Name")
    String userName;

    String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", email=").append(email);
        sb.append(", username=").append(userName);
        sb.append("]");
        return sb.toString();
    }
}
