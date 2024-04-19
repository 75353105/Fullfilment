package com.example.fullfilment_v3.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;

import com.example.fullfilment_v3.R;
import com.google.android.material.button.MaterialButton;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class ForgottenPasswordActivity extends AppCompatActivity {

    public static final String CHANGE_PASSWORD = "changePassword";

    EditText editTextUsername;
    EditText editTextNewPassword;
    EditText editTextConfirmNewPassword;
    MaterialButton btnResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotten_password);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextNewPassword = findViewById(R.id.editTextNewPassword);
        editTextConfirmNewPassword = findViewById(R.id.editTextConfirmNewPassword);
        btnResetPassword = findViewById(R.id.btnReset);

        btnResetPassword.setOnClickListener(view -> {
            String username = editTextUsername.getText().toString().trim();
            String newPassword = editTextNewPassword.getText().toString().trim();
            String confirmedPassword = editTextConfirmNewPassword.getText().toString().trim();

            if(username.isEmpty()) {
                editTextUsername.setHint("The username must be added!");
                editTextUsername.setHintTextColor(Color.RED);
            }
            else {
                editTextUsername.setHint("Enter your username");
                editTextUsername.setHintTextColor(Color.WHITE);
            }

            if(newPassword.isEmpty()) {
                editTextNewPassword.setHint("A new password must be added!");
                editTextNewPassword.setHintTextColor(Color.RED);
            } else {
                editTextNewPassword.setHint("Enter a new password");
                editTextNewPassword.setHintTextColor(Color.WHITE);
            }

            if(confirmedPassword.isEmpty()) {
                editTextConfirmNewPassword.setHint("The password must be confirmed!");
                editTextConfirmNewPassword.setHintTextColor(Color.RED);
            } else {
                editTextConfirmNewPassword.setHint("Confirm the new password");
                editTextConfirmNewPassword.setHintTextColor(Color.WHITE);
            }

            if(!newPassword.equals(confirmedPassword)) {
                editTextNewPassword.setHint("The passwords must match!");
                editTextNewPassword.setHintTextColor(Color.RED);
                editTextConfirmNewPassword.setHint("The passwords must match!");
                editTextConfirmNewPassword.setHintTextColor(Color.RED);
            } else {
                editTextNewPassword.setHint("Enter a new password");
                editTextNewPassword.setHintTextColor(Color.WHITE);
                editTextConfirmNewPassword.setHint("Confirm the new password");
                editTextConfirmNewPassword.setHintTextColor(Color.WHITE);
            }

            String newHashedPassword = BCrypt.withDefaults().hashToString(12, newPassword.toCharArray());

            Intent intent = new Intent();
            intent.putExtra(CHANGE_PASSWORD, newHashedPassword);
            setResult(RESULT_OK);
            finish();
        });
    }
}