package com.example.fullfilment_v3.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.users.User;
import com.example.fullfilment_v3.users.UserBuilderDirector;
import com.google.android.material.button.MaterialButton;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class SignUpActivity extends AppCompatActivity {

    public static final String ADD_USER = "addUser";
    EditText editTextUsername;
    EditText editTextEmail;
    EditText editTextFirstName;
    EditText editTextLastName;
    EditText editTextPassword;
    EditText editTextConfirmPassword;
    MaterialButton btnSignUp;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        intent = getIntent();
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(view -> {

            String username = editTextUsername.getText().toString().trim();
            String email = editTextEmail.getText().toString().trim();
            String firstName = editTextFirstName.getText().toString().trim();
            String lastName = editTextLastName.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();
            String confirmPassword = editTextConfirmPassword.getText().toString().trim();

            if(username.isEmpty()) {
                editTextUsername.setHint("A username must be added!");
                editTextUsername.setHintTextColor(Color.RED);
            } else {
                editTextUsername.setHint("Enter your username");
                editTextUsername.setHintTextColor(Color.WHITE);
            }

            if(email.isEmpty()) {
                editTextEmail.setHint("An email adress is required!");
                editTextEmail.setHintTextColor(Color.RED);
            } else {
                editTextEmail.setHint("Enter your email");
                editTextEmail.setHintTextColor(Color.WHITE);
            }

            if(firstName.isEmpty()) {
                editTextFirstName.setHint("We need to know your surname!");
                editTextFirstName.setHintTextColor(Color.RED);
            } else {
                editTextFirstName.setHint("Enter your first name");
                editTextFirstName.setHintTextColor(Color.WHITE);
            }

            if(lastName.isEmpty()) {
                editTextLastName.setHint("We need to know your last name!");
                editTextLastName.setHintTextColor(Color.RED);
            } else {
                editTextLastName.setHint("Enter your last name");
                editTextLastName.setHintTextColor(Color.WHITE);
            }

            if(password.isEmpty()) {
                editTextPassword.setHint("A password must be added!");
                editTextPassword.setHintTextColor(Color.RED);
            } else {
                editTextPassword.setHint("Enter your password");
                editTextPassword.setHintTextColor(Color.WHITE);
            }

            if(confirmPassword.isEmpty()) {
                editTextConfirmPassword.setHint("The password must be confirmed!");
                editTextConfirmPassword.setHintTextColor(Color.RED);
            } else {
                editTextConfirmPassword.setHint("Confirm your password");
                editTextConfirmPassword.setHintTextColor(Color.WHITE);
            }

            if(!password.equals(confirmPassword)) {
                editTextConfirmPassword.setHint("The passwords do not match!");
                editTextPassword.setHint("The passwords do not match!");
                editTextConfirmPassword.setHintTextColor(Color.RED);
                editTextPassword.setHintTextColor(Color.RED);
            } else {
                editTextConfirmPassword.setHint("Confirm your password");
                editTextPassword.setHint("Enter your password");
                editTextConfirmPassword.setHintTextColor(Color.WHITE);
                editTextPassword.setHintTextColor(Color.WHITE);
            }

            String hashedPassword = BCrypt.withDefaults().hashToString(12, password.toCharArray());
            UserBuilderDirector userBuilder = new UserBuilderDirector();
            User newUser = userBuilder.create(username, email, firstName, lastName, hashedPassword);

            intent.putExtra(ADD_USER, newUser);
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}