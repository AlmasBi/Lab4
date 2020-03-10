package com.example.pochta;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    EditText emailText;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        emailText = findViewById(R.id.email);
        btn2 = findViewById(R.id.siginButtom);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailText.getText().toString().trim();
                if (email==""){
                    Toast.makeText(SignIn.this, "Please, fill name AND email AND password", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(SignIn.this, MainActivity.class);
                intent.putExtra("loginString", email);
                startActivity(intent);
            }
        });
    }

}
