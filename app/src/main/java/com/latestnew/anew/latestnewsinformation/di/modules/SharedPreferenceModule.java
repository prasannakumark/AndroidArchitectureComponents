package com.latestnew.anew.latestnewsinformation.di.modules;

import android.content.Context;
import android.support.annotation.NonNull;

import com.latestnew.anew.latestnewsinformation.di.annotations.qualifiers.ApplicationContext;
import com.latestnew.anew.latestnewsinformation.utility.SharedPreferenceUtility;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPreferenceModule {
    private @ApplicationContext @NonNull Context context;

    public SharedPreferenceModule(@NonNull @ApplicationContext Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    @NonNull
    SharedPreferenceUtility proviedsSharedPreferenceUtility(){
        return new SharedPreferenceUtility(context);
    }
}
