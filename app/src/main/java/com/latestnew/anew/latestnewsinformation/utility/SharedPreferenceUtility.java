package com.latestnew.anew.latestnewsinformation.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;

import com.latestnew.anew.latestnewsinformation.di.annotations.qualifiers.ApplicationContext;
import com.latestnew.anew.latestnewsinformation.di.annotations.scope.ApplicationScope;

public class SharedPreferenceUtility {

    public static final String USER_LOGGED_IN = "userloggedin";

    private SharedPreferences sharedPreferences;

    public SharedPreferenceUtility(@NonNull @ApplicationScope @ApplicationContext Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void writePreferanceBoolean(String key, Boolean value){
        sharedPreferences.edit().putBoolean(key,value).commit();
    }
}
