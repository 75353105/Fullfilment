package com.example.fullfilment_v3.users;

public class UserBuilder {

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private int age;
    private float kilograms;

    public UserBuilder addUsername(String username) {
        this.username = username;
        return this;
    }
    public UserBuilder addEmail(String email) {
        this.email = email;
        return this;
    }
    public UserBuilder addFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public UserBuilder addLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public UserBuilder addPassword(String password) {
        this.password = password;
        return this;
    }
    public UserBuilder addAge(int age) {
        this.age = age;
        return this;
    }
    public UserBuilder addKilograms(float kilograms) {
        this.kilograms = kilograms;
        return this;
    }

    public User build() {
        return new User(username, email, firstName, lastName, password, age, kilograms);
    }
}
