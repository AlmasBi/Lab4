package com.example.pochta;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    public static  final String SHARED_PREFS = "sharedPrefs";
    public static  final String LOGIN_TEXT = "login_text";
    public static  final String PASS_TEXT = "pass_text";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("E-mail");
        Fragment f1 = new fragment_one();
        Fragment f2 = new FragmentTwo();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_1,f1).commitAllowingStateLoss();
        FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction ft2 = fm2.beginTransaction();
        ft2.replace(R.id.fr_2, f2).commitAllowingStateLoss();
        btn = findViewById(R.id.logOut);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(LOGIN_TEXT, "");
                editor.putString(PASS_TEXT, "");
                editor.apply();
                Intent intent = new Intent(MainActivity.this, LoginPage.class);
                startActivity(intent);
                finish();
            } });
    }
    public void Change(View view){
        Fragment fragment=null;

        switch(view.getId()){
            case R.id.button:
                fragment=new fragment_one();
                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_1,fragment).commit();

    }
}
