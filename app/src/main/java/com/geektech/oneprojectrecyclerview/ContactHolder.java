package com.geektech.oneprojectrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactHolder extends RecyclerView.ViewHolder{
    private TextView tv_name;
    public ContactHolder(@NonNull View itemView) {
        super(itemView);
        tv_name = itemView.findViewById(R.id.name);

    }
    public void bind(String name){
        tv_name.setText(name);
    }
}
