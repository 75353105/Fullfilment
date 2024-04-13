package com.example.fullfilment_v3.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
    TextView txtViewWarning;
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
        txtViewWarning = findViewById(R.id.txtViewWarning);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = editTextUsername.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String firstName = editTextFirstName.getText().toString().trim();
                String lastName = editTextLastName.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                String confirmPassword = editTextConfirmPassword.getText().toString().trim();

                if(username.isEmpty() || email.isEmpty() || firstName.isEmpty() || lastName.isEmpty() ||
                        password.isEmpty() || confirmPassword.isEmpty()) {
                    txtViewWarning.setText("All fields must be completed!");
                    txtViewWarning.setVisibility(View.VISIBLE);
                    return;
                }
                if(!password.equals(confirmPassword)) {
                    txtViewWarning.setText("The given passwords do not match");
                    txtViewWarning.setVisibility(View.VISIBLE);
                    return;
                }
                txtViewWarning.setVisibility(View.GONE);

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