package com.pooja.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    private String name;
    private String email;
    private String password;
    private String bloodGroup;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}