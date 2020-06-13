package com.example.mvploginapp;

import android.text.TextUtils;

public class LoginModelImpl implements LoginModel{

    private LoginPresenter presenter;
    public LoginModelImpl(LoginPresenter presenter)
    {
        this.presenter=presenter;
    }

    @Override
    public void validateUser(String username, String password) {
        if(TextUtils.isEmpty(username))
        {
            presenter.onError("please fill username!!");
        }else if(TextUtils.isEmpty(password))
        {
            presenter.onError("please fill Password!!");
        }else
        {
            presenter.onSuccess();
        }

    }
}
