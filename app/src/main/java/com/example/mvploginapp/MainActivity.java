package com.example.mvploginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView{

    EditText name,pasword;
    Button loginbtn;

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        presenter=new LoginPresenterImpl(this);

        name=findViewById(R.id.emailId);
        pasword=findViewById(R.id.passwordId);
        loginbtn=findViewById(R.id.buttonId);
        loginbtn=findViewById(R.id.buttonId);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onHandleLogin(name.getText().toString(),pasword.getText().toString());
            }
        });
    }

   

    @Override
    public void onSuccess() {
        Intent intent=new Intent(MainActivity.this,HomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void onFailure() {

    }

    @Override
    public void onError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }


}