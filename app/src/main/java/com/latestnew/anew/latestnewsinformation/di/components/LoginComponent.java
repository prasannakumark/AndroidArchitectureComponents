package com.latestnew.anew.latestnewsinformation.di.components;

import com.latestnew.anew.latestnewsinformation.di.modules.LoginViewModelModule;
import com.latestnew.anew.latestnewsinformation.viewmodel.LoginViewModel;

import dagger.Component;

@Component(modules = {LoginViewModelModule.class})
public interface LoginComponent {
    LoginViewModel getLoginViewModel();
}
