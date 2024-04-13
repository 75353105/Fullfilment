package com.example.fullfilment_v3.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.signup.SignUpActivity;

public class SignInActivity extends AppCompatActivity {

    public static final int SIGN_UP_REQUEST = 10;
    EditText editTextUsername;
    EditText editTextPassword;
    Button signInButton;
    Button signUpButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        signInButton = findViewById(R.id.btnSignIn);
        signUpButton = findViewById(R.id.btnSignUp);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivityForResult(intent, SIGN_UP_REQUEST);
            }
        });
    }
}