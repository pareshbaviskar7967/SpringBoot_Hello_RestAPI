package com.example.hello_using_rest_api.model;

import lombok.Data;

@Data
public class User {
    private String FirstName;
    private String LastName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public User(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;

    }
}
