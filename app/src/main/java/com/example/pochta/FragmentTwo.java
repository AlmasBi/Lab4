package com.example.pochta;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class FragmentTwo extends Fragment {

    public TextView textView;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);
        return view;
    }




    public void Text(ExampleItem exampleItem) {
        textView = getView().findViewById(R.id.text3);
        textView.setTextColor(getResources().getColor(R.color.colorPrimary));
        textView.setText(exampleItem.randomize());
    }


}
