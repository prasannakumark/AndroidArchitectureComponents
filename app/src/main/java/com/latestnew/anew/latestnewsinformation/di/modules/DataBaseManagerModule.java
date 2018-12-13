package com.latestnew.anew.latestnewsinformation.di.modules;

import android.content.Context;
import android.support.annotation.NonNull;

import com.latestnew.anew.latestnewsinformation.datamodel.DataRepository;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class DataBaseManagerModule {

    @NonNull
    Context context;

    public DataBaseManagerModule(@NonNull Context context) {
        this.context = context;
    }

    @Provides
    @NonNull
    DataRepository providesDataRepository() {
        return new DataRepository(context);
    }
}
