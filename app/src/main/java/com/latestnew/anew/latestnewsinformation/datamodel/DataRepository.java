package com.latestnew.anew.latestnewsinformation.datamodel;

import android.content.Context;
import android.support.annotation.NonNull;

public class DataRepository implements UserOperations<User>{
    private UserDAO userDAO;

    public DataRepository(@NonNull Context context) {
        AppDataBase appDataBase = AppDataBase.getDataBase(context.getApplicationContext());
        userDAO = appDataBase.getUserDAO();
    }

    @Override
    public void insert(@NonNull User object) {
        userDAO.createUser(object);
    }

    @Override
    public void remove(@NonNull User field) {

    }

    @Override
    public void update(@NonNull User field) {

    }

    @Override
    public void fetchUser(@NonNull User field) {
        userDAO.findUser(field.getEmailId(),field.getPassword());
    }
}
