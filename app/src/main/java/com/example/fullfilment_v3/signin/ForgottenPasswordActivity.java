package com.example.fullfilment_v3.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.asynctask.ResetPasswordAsyncTask;
import com.google.android.material.button.MaterialButton;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class ForgottenPasswordActivity extends AppCompatActivity {

    EditText editTextUsername;
    EditText editTextNewPassword;
    EditText editTextConfirmNewPassword;
    MaterialButton btnResetPassword;

    CheckBox cbShowPassword;
    CheckBox cbShowConfirmation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotten_password);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextNewPassword = findViewById(R.id.editTextNewPassword);
        editTextConfirmNewPassword = findViewById(R.id.editTextConfirmNewPassword);
        btnResetPassword = findViewById(R.id.btnReset);
        cbShowConfirmation = findViewById(R.id.cbShowConfirmPassword);
        cbShowPassword = findViewById(R.id.cbShowNewPassword);

        editTextNewPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextConfirmNewPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());

        cbShowPassword.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if(isChecked) {
                editTextNewPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                editTextNewPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        cbShowConfirmation.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if(isChecked) {
                editTextConfirmNewPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                editTextConfirmNewPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        btnResetPassword.setOnClickListener(view -> {
            String username = editTextUsername.getText().toString().trim();
            String newPassword = editTextNewPassword.getText().toString().trim();
            String confirmedPassword = editTextConfirmNewPassword.getText().toString().trim();
            boolean hasError = false;

            if(username.isEmpty()) {
                editTextUsername.setHint("The username must be added!");
                editTextUsername.setHintTextColor(Color.RED);
                editTextUsername.setError("");
                hasError = true;
            }
            else {
                editTextUsername.setHint("Enter your username");
                editTextUsername.setHintTextColor(Color.WHITE);
                editTextUsername.setError(null);
            }

            if(newPassword.isEmpty()) {
                editTextNewPassword.setHint("A new password must be added!");
                editTextNewPassword.setHintTextColor(Color.RED);
                editTextNewPassword.setError("");
                hasError = true;
            } else {
                editTextNewPassword.setHint("Enter a new password");
                editTextNewPassword.setHintTextColor(Color.WHITE);
                editTextNewPassword.setError(null);
            }

            if(confirmedPassword.isEmpty()) {
                editTextConfirmNewPassword.setHint("The password must be confirmed!");
                editTextConfirmNewPassword.setHintTextColor(Color.RED);
                editTextConfirmNewPassword.setError("");
                hasError = true;
            } else {
                editTextConfirmNewPassword.setHint("Confirm the new password");
                editTextConfirmNewPassword.setHintTextColor(Color.WHITE);
                editTextConfirmNewPassword.setError(null);
            }

            if(!hasError) {
                if (!newPassword.equals(confirmedPassword)) {
                    editTextNewPassword.setHint("The passwords must match!");
                    editTextNewPassword.setHintTextColor(Color.RED);
                    editTextNewPassword.setError("");
                    editTextConfirmNewPassword.setHint("The passwords must match!");
                    editTextConfirmNewPassword.setHintTextColor(Color.RED);
                    editTextConfirmNewPassword.setError("");
                    hasError = true;
                } else {
                    editTextNewPassword.setHint("Enter a new password");
                    editTextNewPassword.setHintTextColor(Color.WHITE);
                    editTextConfirmNewPassword.setHint("Confirm the new password");
                    editTextConfirmNewPassword.setHintTextColor(Color.WHITE);
                    editTextConfirmNewPassword.setError(null);
                    editTextNewPassword.setError(null);
                }
            }

            if(hasError) {
                return;
            } else {
                String newHashedPassword = BCrypt.withDefaults().hashToString(12, newPassword.toCharArray());

                new ResetPasswordAsyncTask(ForgottenPasswordActivity.this, username, newHashedPassword).execute();

                finish();
                startActivity(new Intent(ForgottenPasswordActivity.this, SignInActivity.class));
            }

        });
    }
}