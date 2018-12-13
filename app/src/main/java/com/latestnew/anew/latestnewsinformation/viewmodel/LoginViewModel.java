package com.latestnew.anew.latestnewsinformation.viewmodel;

import android.content.Context;
import android.support.annotation.NonNull;

import com.latestnew.anew.latestnewsinformation.datamodel.DataRepository;
import com.latestnew.anew.latestnewsinformation.di.annotations.qualifiers.ActivityContext;
import com.latestnew.anew.latestnewsinformation.utility.SharedPreferenceUtility;

import javax.inject.Inject;

public class LoginViewModel extends BaseViewModel {

    @Inject
    @ActivityContext
    private Context context;
    @Inject
    private DataRepository dataRepository;
    @Inject
    private SharedPreferenceUtility sharedPreferenceUtility;



    public LoginViewModel(@ActivityContext @NonNull Context context, @NonNull DataRepository dataRepository,
                          @NonNull SharedPreferenceUtility sharedPreferenceUtility) {
        super(context, dataRepository, sharedPreferenceUtility);
        this.context = context;
        this.dataRepository = dataRepository;
        this.sharedPreferenceUtility = sharedPreferenceUtility;
    }
}
