package com.example.fullfilment_v3.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.fullfilment_v3.database.FullfilmentDBM;
import com.example.fullfilment_v3.users.User;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class VerifyUserAsyncTask extends AsyncTask<Void, Void, User> {

    private Context mContext;
    private String mUsername;
    private String mPassword;

    public VerifyUserAsyncTask(Context context, String username, String password) {
        mContext = context;
        mUsername = username;
        mPassword = password;
    }

    @Override
    protected User doInBackground(Void... voids) {
        return FullfilmentDBM.getInstanta(mContext).getUsersDao().getUserByUsername(mUsername);
    }

    @Override
    protected void onPostExecute(User user) {
        super.onPostExecute(user);
        if (user == null) {
            Toast.makeText(mContext, "Username not found", Toast.LENGTH_LONG).show();
        } else {
            if (BCrypt.verifyer().verify(mPassword.toCharArray(), user.getPassword()).verified) {
                Toast.makeText(mContext, "Login Successful", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(mContext, "The entered password is incorrect", Toast.LENGTH_LONG).show();
            }
        }
    }
}
