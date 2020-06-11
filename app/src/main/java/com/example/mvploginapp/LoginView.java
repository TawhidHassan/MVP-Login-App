package com.example.mvploginapp;

public interface LoginView {
    void onSuccess();
    void onFailure();
    void onError(String errorMessage);

}
