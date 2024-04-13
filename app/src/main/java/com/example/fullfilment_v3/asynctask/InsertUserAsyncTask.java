package com.example.fullfilment_v3.asynctask;

import android.content.Context;
import android.os.AsyncTask;

import com.example.fullfilment_v3.database.FullfilmentDBM;
import com.example.fullfilment_v3.users.User;

public class InsertUserAsyncTask extends AsyncTask<User, Void, Void> {

    private Context mContext;

    public InsertUserAsyncTask(Context context) {
        mContext = context.getApplicationContext();
    }

    @Override
    protected Void doInBackground(User... users) {
        FullfilmentDBM.getInstanta(mContext).getUsersDao().insert(users[0]);
        return null;
    }
}
