package com.example.fullfilment_v3.signin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.asynctask.InsertUserAsyncTask;
import com.example.fullfilment_v3.asynctask.VerifyUserAsyncTask;
import com.example.fullfilment_v3.signup.SignUpActivity;
import com.example.fullfilment_v3.users.User;

public class SignInActivity extends AppCompatActivity {

    public static final int SIGN_UP_REQUEST = 10;
    public static final int FORGOTTEN_PASSWORD_REQUEST = 20;
    EditText editTextUsername;
    EditText editTextPassword;
    Button signInButton;
    Button signUpButton;
    Intent intent;
    TextView txtForgottenPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        signInButton = findViewById(R.id.btnSignIn);
        signUpButton = findViewById(R.id.btnSignUp);
        txtForgottenPassword = findViewById(R.id.txtForgotPassword);

        txtForgottenPassword.setOnClickListener(view -> {
            intent = new Intent(getApplicationContext(), ForgottenPasswordActivity.class);
            startActivityForResult(intent, FORGOTTEN_PASSWORD_REQUEST);
        });

        signInButton.setOnClickListener(view -> {
            String username = editTextUsername.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            new VerifyUserAsyncTask(SignInActivity.this, username, password).execute();
        });

        signUpButton.setOnClickListener(view -> {
            intent = new Intent(getApplicationContext(), SignUpActivity.class);
            startActivityForResult(intent, SIGN_UP_REQUEST);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == SIGN_UP_REQUEST && resultCode == RESULT_OK && data != null) {
            User newUser = (User) data.getSerializableExtra(SignUpActivity.ADD_USER);
            if(newUser != null) {
                new InsertUserAsyncTask(getApplicationContext()).execute(newUser);
            }
        }

        if(requestCode == FORGOTTEN_PASSWORD_REQUEST && resultCode == RESULT_OK && data != null) {

        }
    }
}