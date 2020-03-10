package com.example.pochta;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText loginText;
    TextView signIn;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        signIn = findViewById(R.id.signin);
        loginText = findViewById(R.id.logintext);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = loginText.getText().toString().trim();
                if (l == "") {
                    Toast.makeText(LoginPage.this, "Please, fill email ", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(LoginPage.this, MainActivity.class);
                intent.putExtra("loginString", l);
                startActivity(intent);
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


}
