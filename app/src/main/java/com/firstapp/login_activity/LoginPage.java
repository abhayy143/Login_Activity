package com.firstapp.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText enterYourName,enterYourPwd;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        enterYourName=findViewById(R.id.enterYourName);
        enterYourPwd=findViewById(R.id.enterYourPwd);
        loginButton=findViewById(R.id.loginButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = enterYourName.getText().toString();
                String number = enterYourPwd.getText().toString();

                if ((name.isEmpty()) || (enterYourName.getText().toString().isEmpty())
                        || (enterYourPwd.getText().toString().isEmpty())) {
                    Toast.makeText(LoginPage.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}