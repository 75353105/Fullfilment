package com.example.fullfilment_v3.signin;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.WelcomePageActivity;
import com.example.fullfilment_v3.asynctask.InsertUserAsyncTask;
import com.example.fullfilment_v3.asynctask.VerifyUserAsyncTask;
import com.example.fullfilment_v3.signup.SignUpActivity;
import com.example.fullfilment_v3.users.User;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

public class SignInActivity extends AppCompatActivity {

    public static final int SIGN_UP_REQUEST = 10;
    EditText editTextUsername;
    EditText editTextPassword;
    Button signInButton;
    Button signUpButton;
    Intent intent;
    TextView txtForgottenPassword;
    CheckBox showPassword;

    ImageView imgGoogle;

    private SignInClient oneTapClient;
    private BeginSignInRequest signInRequest;
    public static final int GOOGLE_LOG_IN = 20;
    private boolean showOneTapUI = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        signInButton = findViewById(R.id.btnSignIn);
        signUpButton = findViewById(R.id.btnSignUp);
        txtForgottenPassword = findViewById(R.id.txtForgotPassword);
        showPassword = findViewById(R.id.cbShowPassword);
        imgGoogle = findViewById(R.id.imageGoogle);

        oneTapClient = Identity.getSignInClient(this);
        signInRequest = BeginSignInRequest.builder().
                setGoogleIdTokenRequestOptions(BeginSignInRequest.GoogleIdTokenRequestOptions.builder().
                        setSupported(true).setServerClientId(getString(R.string.web_client_id)).
                        setFilterByAuthorizedAccounts(false).build()).build();

        showPassword.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if(isChecked) {
                editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        txtForgottenPassword.setOnClickListener(view -> {
            intent = new Intent(getApplicationContext(), ForgottenPasswordActivity.class);
            startActivity(intent);
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

        ActivityResultLauncher<IntentSenderRequest> activityResultLauncher =
                registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(),
                        new ActivityResultCallback<ActivityResult>() {
                            @Override
                            public void onActivityResult(ActivityResult result) {
                                try {
                                    SignInCredential credential = oneTapClient.getSignInCredentialFromIntent(result.getData());
                                    String idToken = credential.getGoogleIdToken();
                                    if(idToken != null) {
                                        String email = credential.getId();
                                        String username = credential.getDisplayName();
                                        Toast.makeText(getApplicationContext(),"Email : "+email+" Name : "+username, Toast.LENGTH_SHORT).show();

                                        Intent intent1 = new Intent(getApplicationContext(), WelcomePageActivity.class);
                                        intent1.putExtra("user_name", username);
                                        startActivity(intent1);
                                    }
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        });

        imgGoogle.setOnClickListener(view -> {
            oneTapClient.beginSignIn(signInRequest).
            addOnSuccessListener(SignInActivity.this, new OnSuccessListener<BeginSignInResult>() {
                @Override
                public void onSuccess(BeginSignInResult beginSignInResult) {

                    IntentSenderRequest intentSenderRequest =
                            new IntentSenderRequest.Builder(beginSignInResult.getPendingIntent().getIntentSender()).build();
                    activityResultLauncher.launch(intentSenderRequest);
                }
            }).addOnFailureListener(SignInActivity.this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.d("TAG", e.getLocalizedMessage() );
                        }
                    });
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

    }
}