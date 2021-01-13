package com.example.zoomfit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zoomfit.PayActivity;
import com.example.zoomfit.R;

public class supplyActivity  extends AppCompatActivity {
    private ImageView Training_IMG_back;
    private TextView  training_LBL_name;
    private TextView  training_LBL_name1;
    private TextView  training_LBL_name3;
    private TextView  training_LBL_name4;
    private TextView  training_LBL_name5;
    private Intent intent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listsupply);
        findviews();
        training_LBL_name.setOnClickListener(click);
        training_LBL_name1.setOnClickListener(click);
        training_LBL_name3.setOnClickListener(click);
        training_LBL_name4.setOnClickListener(click);
        training_LBL_name5.setOnClickListener(click);
        Training_IMG_back.setOnClickListener(click);

    }

    private void findviews() {
        Training_IMG_back = findViewById(R.id. Training_IMG_back);
        training_LBL_name = findViewById(R.id. training_LBL_name);
        training_LBL_name1 = findViewById(R.id. training_LBL_name1);
        training_LBL_name3 = findViewById(R.id. training_LBL_name3);
        training_LBL_name4 = findViewById(R.id. training_LBL_name4);
        training_LBL_name5 = findViewById(R.id. training_LBL_name5);
    }


    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("name")){
                intent = new Intent(supplyActivity.this, PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name1")){
                intent = new Intent(supplyActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name3")){
                intent = new Intent(supplyActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name4")){
                intent = new Intent(supplyActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name5")){
                intent = new Intent(supplyActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("back")) {
                finish();
            }
        }
    };
}
