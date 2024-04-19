package com.example.fullfilment_v3.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.fullfilment_v3.users.User;

@Database(entities = {User.class}, version = 2, exportSchema = false)
public abstract class FullfilmentDBM extends RoomDatabase {

    public static final String DB_NAME = "date.db";

    private static FullfilmentDBM instanta;

    public static FullfilmentDBM getInstanta(Context context)
    {
        if(instanta==null)
            instanta = Room.databaseBuilder(context,
                            FullfilmentDBM.class, DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        return instanta;
    }

    public abstract Dao getUsersDao();

}
