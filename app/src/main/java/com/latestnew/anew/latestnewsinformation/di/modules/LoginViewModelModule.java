package com.latestnew.anew.latestnewsinformation.di.modules;

import android.content.Context;
import android.support.annotation.NonNull;

import com.latestnew.anew.latestnewsinformation.datamodel.DataRepository;
import com.latestnew.anew.latestnewsinformation.di.annotations.qualifiers.ActivityContext;
import com.latestnew.anew.latestnewsinformation.utility.SharedPreferenceUtility;
import com.latestnew.anew.latestnewsinformation.viewmodel.LoginViewModel;

import dagger.Module;
import dagger.Provides;

@Module(includes = {SharedPreferenceModule.class, DataBaseManagerModule.class})
public class LoginViewModelModule {

     @NonNull
     @ActivityContext
     private Context context;

     public LoginViewModelModule(@NonNull Context context) {
          this.context = context;
     }

     @Provides
     @NonNull
     LoginViewModel providesLoginViewModel(@NonNull DataRepository dataRepository,
                                           @NonNull SharedPreferenceUtility sharedPreferenceUtility) {
          return new LoginViewModel(context,dataRepository,sharedPreferenceUtility);
     }


}
