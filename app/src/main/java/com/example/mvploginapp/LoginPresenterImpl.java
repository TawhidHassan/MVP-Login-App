package com.example.mvploginapp;

public class LoginPresenterImpl implements LoginPresenter {

    private LoginView view;
    private LoginModel model;
    public LoginPresenterImpl(LoginView view)
    {
        this.view=view;
        this.model=new LoginModelImpl(this);
    }

    @Override
    public void onHandleLogin(String username, String password) {
        model.validateUser(username,password);
    }

    @Override
    public void onSuccess() {
        view.onSuccess();
    }

    @Override
    public void onError(String message) {
        view.onError(message);
    }

    @Override
    public void onFailure() {

    }
}
