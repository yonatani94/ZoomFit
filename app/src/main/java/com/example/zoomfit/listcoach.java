package com.example.zoomfit;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class listcoach extends AppCompatActivity {
    private RecyclerView list_LST_exercises;
 //   private ListView listView ;
    ArrayList list ;
    CustomAdapter adapter ;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listcoach);
        //listView  = findViewById(R.id.list);
        list = new ArrayList<>();
        list.add(new Coach("john","yoga",26));
        list.add(new Coach("max","judo",41));
        list.add(new Coach("yosi","karte",22));
        list.add(new Coach("salo","kapoera",25));
        list.add(new Coach("shlomi","muscle",28));
        list.add(new Coach("nir","shape",36));

        CustomAdapter adapter_exercise = new CustomAdapter(this, list);
        adapter_exercise.setClickListeners(exerciseItemClickListener);
        list_LST_exercises.setLayoutManager(new LinearLayoutManager(this));
        list_LST_exercises.setAdapter(adapter_exercise);
      //  adapter = new CustomAdapter(list,getApplicationContext());
      //  listView.setAdapter(adapter);

    }
    CustomAdapter.ExerciseItemClickListener exerciseItemClickListener = new CustomAdapter.ExerciseItemClickListener() {
        @Override
        public void itemClicked(Coach exercise, int position) {
            Toast.makeText(listcoach.this, exercise.getName() + " Clicked", Toast.LENGTH_SHORT).show();
        }
    };
}
