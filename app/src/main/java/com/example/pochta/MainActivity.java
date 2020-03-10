package com.example.pochta;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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
    }
    public void Change(View view){
        Fragment fragment=null;

        switch(view.getId()){
            case R.id.button:
                fragment=new fragment_one();
                break;
//            case R.id.button2:
//                fragment=new FragmentTwo();
//                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fr_1,fragment).commit();

    }
}
