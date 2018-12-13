package com.latestnew.anew.latestnewsinformation.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.support.annotation.NonNull;

import com.latestnew.anew.latestnewsinformation.datamodel.DataRepository;
import com.latestnew.anew.latestnewsinformation.utility.SharedPreferenceUtility;

public abstract class BaseViewModel extends ViewModel {

    public BaseViewModel(@NonNull Context context, @NonNull DataRepository dataRepository,
                         @NonNull SharedPreferenceUtility sharedPreferenceUtility) {

    }
}
