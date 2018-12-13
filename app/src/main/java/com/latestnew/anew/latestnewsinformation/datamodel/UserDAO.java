package com.latestnew.anew.latestnewsinformation.datamodel;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.support.annotation.NonNull;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM user WHERE email_id = :email AND password = :password")
    User findUser(@NonNull String email, @NonNull String password);

    @Insert
    void createUser(User user);

    @Query("DELETE FROM user")
    void removeUser(String email);

}
