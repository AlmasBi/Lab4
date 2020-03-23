package com.example.pochta;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText loginText;
    EditText passwordText;
    TextView signIn;
    Button login;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String LOGIN_TEXT="login_text";
    public static final String PASS_TEXT="pass_text";
    private String loginString;
    private String passwordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        loginText = findViewById(R.id.logintext);
     ;
        isPre();
        if(!loginString.isEmpty() && !passwordString.isEmpty()){
            Intent intent = new Intent(LoginPage.this, MainActivity.class);
            startActivity(intent);
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        signIn = findViewById(R.id.signin);
        passwordText = findViewById(R.id.passwordtext);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = loginText.getText().toString().trim();

                if (l.isEmpty()) {
                    Toast.makeText(LoginPage.this, "Please, fill email ", Toast.LENGTH_SHORT).show();
                    return;
                }
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                SharedPreferences.Editor ed= sharedPreferences.edit();

                ed.putString(LOGIN_TEXT,loginText.getText().toString());
                ed.putString(PASS_TEXT,passwordText.getText().toString());
                ed.apply();


                Intent intent = new Intent(LoginPage.this, MainActivity.class);
                intent.putExtra("loginString", l);
                startActivity(intent);
                finish();
                if(!loginString.isEmpty() && !passwordString.isEmpty()){
                    Toast.makeText(LoginPage.this,"Text saved",Toast.LENGTH_SHORT).show();
                }
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginPage.this, SignIn.class);
                startActivity(intent);
            }
        });


    }

    public void isPre() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
         loginString=sharedPreferences.getString(LOGIN_TEXT,"");
         passwordString=sharedPreferences.getString(PASS_TEXT,"");

    }
    }



