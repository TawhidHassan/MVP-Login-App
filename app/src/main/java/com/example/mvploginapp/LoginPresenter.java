package com.example.mvploginapp;

public interface LoginPresenter {
    void onHandleLogin(String username,String password);
    void onSuccess();
    void onError(String message);
    void onFailure();
}
