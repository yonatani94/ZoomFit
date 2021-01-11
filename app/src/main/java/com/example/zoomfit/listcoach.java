package com.example.zoomfit;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listcoach extends AppCompatActivity {
    private ListView listView ;
    ArrayList list ;
    CustomAdapter adapter ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listcoach);
        listView  = findViewById(R.id.list);
        list = new ArrayList<>();
        list.add(new coach("john","yoga",26));
        list.add(new coach("max","judo",41));
        list.add(new coach("yosi","karte",22));
        list.add(new coach("salo","kapoera",25));
        list.add(new coach("shlomi","muscle",28));
        list.add(new coach("nir","shape",36));


        adapter = new CustomAdapter(list,getApplicationContext());
        listView.setAdapter(adapter);

    }
}
