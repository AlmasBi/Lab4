package com.example.pochta;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;

import java.util.ArrayList;


public class fragment_one extends Fragment implements ExampleAdapter.onBtnClick{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private  ArrayList<ExampleItem> exampleList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_local, "Line 1", "Line 2"));

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new ExampleAdapter(exampleList, this);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        // Inflate the layout for this fragment
        return view;


    }

    @Override
    public void onClick(int position) {
        FragmentTwo fragmentTwo = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fr_2);
        fragmentTwo.Text(exampleList.get(position));
    }
}