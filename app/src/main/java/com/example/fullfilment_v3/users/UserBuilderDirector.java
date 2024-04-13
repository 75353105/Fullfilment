package com.example.fullfilment_v3.users;

public class UserBuilderDirector {

    private UserBuilder userBuilder;
    public User create(String username, String email, String firstName, String lastName, String password,
                           int age, float kilograms) {
        userBuilder = new UserBuilder();
        userBuilder.addUsername(username);
        userBuilder.addEmail(email);
        userBuilder.addFirstName(firstName);
        userBuilder.addLastName(lastName);
        userBuilder.addPassword(password);
        userBuilder.addAge(age);
        userBuilder.addKilograms(kilograms);
        return userBuilder.build();
    }
    public User create(String username, String email, String firstName, String lastName, String password) {
        userBuilder = new UserBuilder();
        userBuilder.addUsername(username);
        userBuilder.addEmail(email);
        userBuilder.addFirstName(firstName);
        userBuilder.addLastName(lastName);
        userBuilder.addPassword(password);
        return userBuilder.build();
    }
}
