package com.latestnew.anew.latestnewsinformation.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.latestnew.anew.latestnewsinformation.R;
import com.latestnew.anew.latestnewsinformation.di.components.LoginComponent;

import dagger.internal.DaggerCollections;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
