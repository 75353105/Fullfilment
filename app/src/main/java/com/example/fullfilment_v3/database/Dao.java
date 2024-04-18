package com.example.fullfilment_v3.database;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.fullfilment_v3.users.User;

@androidx.room.Dao
public interface Dao {

    @Insert
    void insert(User user);

    @Query("SELECT * FROM user WHERE username = :username ")
    User getUserByUsername(String username);

    @Update
    void updatePassword(User user);
}
