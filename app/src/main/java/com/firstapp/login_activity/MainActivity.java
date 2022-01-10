package com.firstapp.login_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText personName,email_id,phone_no,pwd,confirm_pwd;
    Button signup_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personName=findViewById(R.id.personName);
        email_id=findViewById(R.id.email_id);
        phone_no=findViewById(R.id.phone_no);
        pwd=findViewById(R.id.pwd);
        confirm_pwd=findViewById(R.id.confirm_pwd);
        signup_btn=findViewById(R.id.signup_btn);



        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAll();

            }


        });

    }

    private void validateAll() {
        if (personName.getText().toString().isEmpty() || email_id.getText()
        .toString().isEmpty() || phone_no.getText().toString().isEmpty() ||
        pwd.getText().toString().isEmpty() || confirm_pwd.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please enter all fields.", Toast.LENGTH_SHORT).show();
        }
        else
            checkPasswordLength();
    }

    private void checkPasswordLength() {
        if (pwd.getText().toString().length() < 8 || pwd.getText().toString().length() > 12){
            pwd.setError("Password length must be greater than 7 and less than 12.");
        }
        else checkConfirmPassword();
    }

    private void checkConfirmPassword() {
        if (!confirm_pwd.getText().toString().equals(pwd.getText().toString())) {  // !=
            confirm_pwd.setError("Confirm Password didn't match");
        } else
            {Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();

            registerUser();

        }


    }

    private void registerUser() {


    }

}