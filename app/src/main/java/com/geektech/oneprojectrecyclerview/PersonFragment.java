package com.geektech.oneprojectrecyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PersonFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<String > names;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_person, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);
        names= new ArrayList<>();
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Ololo\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        names.add("Shamal\n+7 777 77 77");
        adapter = new Adapter(names);
        recyclerView.setAdapter(adapter);
    }
}