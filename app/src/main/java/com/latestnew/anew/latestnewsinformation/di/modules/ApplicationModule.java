package com.latestnew.anew.latestnewsinformation.di.modules;

import android.content.Context;
import android.support.annotation.NonNull;

import com.latestnew.anew.latestnewsinformation.di.annotations.qualifiers.ApplicationContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private Context appContext;

    public ApplicationModule(@NonNull @ApplicationContext Context context) {
        appContext = context;
    }

    @Provides
    @ApplicationContext
    @NonNull
    Context providesApplicationContext() {
        return appContext;
    }
}
