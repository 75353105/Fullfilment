package com.example.fullfilment_v3.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
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
    CheckBox cbPassword;
    CheckBox cbConfirmPassword;

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
        cbPassword = findViewById(R.id.cbShowPassword);
        cbConfirmPassword = findViewById(R.id.cbShowConfirmedPassword);

        editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextConfirmPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());

        cbPassword.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if(isChecked) {
                editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        cbConfirmPassword.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if(isChecked) {
                editTextConfirmPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                editTextConfirmPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        btnSignUp.setOnClickListener(view -> {

            String username = editTextUsername.getText().toString().trim();
            String email = editTextEmail.getText().toString().trim();
            String firstName = editTextFirstName.getText().toString().trim();
            String lastName = editTextLastName.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();
            String confirmPassword = editTextConfirmPassword.getText().toString().trim();

            boolean hasError = false;

            if(username.isEmpty()) {
                editTextUsername.setHint("A username must be added!");
                editTextUsername.setHintTextColor(Color.RED);
                editTextUsername.setError("");
                hasError = true;
            } else {
                editTextUsername.setHint("Enter your username");
                editTextUsername.setHintTextColor(Color.WHITE);
                editTextUsername.setError(null);
            }

            if(email.isEmpty()) {
                editTextEmail.setHint("An email adress is required!");
                editTextEmail.setHintTextColor(Color.RED);
                editTextEmail.setError("");
                hasError = true;
            } else {
                editTextEmail.setHint("Enter your email");
                editTextEmail.setHintTextColor(Color.WHITE);
                editTextEmail.setError(null);
            }

            if(firstName.isEmpty()) {
                editTextFirstName.setHint("We need to know your surname!");
                editTextFirstName.setHintTextColor(Color.RED);
                editTextFirstName.setError("");
                hasError = true;
            } else {
                editTextFirstName.setHint("Enter your first name");
                editTextFirstName.setHintTextColor(Color.WHITE);
                editTextFirstName.setError(null);
            }

            if(lastName.isEmpty()) {
                editTextLastName.setHint("We need to know your last name!");
                editTextLastName.setHintTextColor(Color.RED);
                editTextLastName.setError("");
                hasError = true;
            } else {
                editTextLastName.setHint("Enter your last name");
                editTextLastName.setHintTextColor(Color.WHITE);
                editTextLastName.setError(null);
            }

            if(password.isEmpty()) {
                editTextPassword.setHint("A password must be added!");
                editTextPassword.setHintTextColor(Color.RED);
                editTextPassword.setError("");
                hasError = true;
            } else {
                editTextPassword.setHint("Enter your password");
                editTextPassword.setHintTextColor(Color.WHITE);
                editTextPassword.setError(null);
            }

            if(confirmPassword.isEmpty()) {
                editTextConfirmPassword.setHint("The password must be confirmed!");
                editTextConfirmPassword.setHintTextColor(Color.RED);
                editTextConfirmPassword.setError("");
                hasError = true;
            } else {
                editTextConfirmPassword.setHint("Confirm your password");
                editTextConfirmPassword.setHintTextColor(Color.WHITE);
                editTextConfirmPassword.setError(null);
            }

            if(!hasError) {
                if (!password.equals(confirmPassword)) {
                    editTextConfirmPassword.setHint("The passwords do not match!");
                    editTextPassword.setHint("The passwords do not match!");
                    editTextConfirmPassword.setHintTextColor(Color.RED);
                    editTextPassword.setHintTextColor(Color.RED);
                    editTextPassword.setError("");
                    editTextConfirmPassword.setError("");
                    hasError = true;
                } else {
                    editTextConfirmPassword.setHint("Confirm your password");
                    editTextPassword.setHint("Enter your password");
                    editTextConfirmPassword.setHintTextColor(Color.WHITE);
                    editTextPassword.setHintTextColor(Color.WHITE);
                    editTextPassword.setError(null);
                    editTextConfirmPassword.setError(null);
                }
            }

            if(hasError) {
                return;
            } else {
                String hashedPassword = BCrypt.withDefaults().hashToString(12, password.toCharArray());
                UserBuilderDirector userBuilder = new UserBuilderDirector();
                User newUser = userBuilder.create(username, email, firstName, lastName, hashedPassword);

                intent.putExtra(ADD_USER, newUser);
                setResult(RESULT_OK, intent);
                finish();
            }

        });
    }
}