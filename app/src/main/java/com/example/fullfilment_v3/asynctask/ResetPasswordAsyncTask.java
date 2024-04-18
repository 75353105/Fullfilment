package com.example.fullfilment_v3.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.fullfilment_v3.database.FullfilmentDBM;
import com.example.fullfilment_v3.users.User;

public class ResetPasswordAsyncTask extends AsyncTask<Void, Void, User> {

    private final Context mContext;
    private final String mUsername;
    private final String mPassword;

    public ResetPasswordAsyncTask(Context mContext, String mUsername, String mPassword) {
        this.mContext = mContext;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
    }

    @Override
    protected User doInBackground(Void... voids) {
        User user = FullfilmentDBM.getInstanta(mContext).getUsersDao().getUserByUsername(mUsername);
        if(user != null) {
            user.setPassword(mPassword);
            FullfilmentDBM.getInstanta(mContext).getUsersDao().updatePassword(user);
        }
        return user;
    }

    @Override
    protected void onPostExecute(User user) {
        super.onPostExecute(user);
        if(user != null) {
            Toast.makeText(mContext, "Password resest succesfullly", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(mContext, "Username not found", Toast.LENGTH_LONG).show();
        }
    }
}
