package com.example.mvploginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements LoginView{

    EditText name,pasword;
    Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.emailId);
        pasword=findViewById(R.id.passwordId);
        loginbtn=findViewById(R.id.buttonId);
        loginbtn=findViewById(R.id.buttonId);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateUser();
            }
        });
    }

    public void validateUser()
    {
        String username=name.getText().toString();
        String userpassword=pasword.getText().toString();
        View focusView=null;
        boolean cancel=false;
        if(TextUtils.isEmpty(username))
        {
            name.setError("enter name");
            cancel=true;
            focusView=name;
            return;
        }else if(TextUtils.isEmpty(userpassword))
        {
            pasword.setError("enter password");
            cancel=true;
            focusView=pasword;
            return;
        }
        if (cancel)
        {
            focusView.requestFocus();
        }else
        {
            Intent intent=new Intent(MainActivity.this,HomeActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure() {

    }

    @Override
    public void onError(String errorMessage) {

    }


}