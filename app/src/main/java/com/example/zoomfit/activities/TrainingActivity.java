package com.example.zoomfit.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zoomfit.PayActivity;
import com.example.zoomfit.R;

public class TrainingActivity extends AppCompatActivity {


private TextView training_LBL_name;

private TextView training_LBL_name1;

private TextView training_LBL_name3;

private TextView training_LBL_name4;

private TextView training_LBL_name5;
private ImageView Training_IMG_back;

private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        findViews();

        training_LBL_name.setOnClickListener(click);
        training_LBL_name1.setOnClickListener(click);
        training_LBL_name3.setOnClickListener(click);
        training_LBL_name4.setOnClickListener(click);
        training_LBL_name5.setOnClickListener(click);
        Training_IMG_back.setOnClickListener(click);
    }


    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getTag().toString().equals("name")){
                intent = new Intent(TrainingActivity.this, PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name1")){
                intent = new Intent(TrainingActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name3")){
                intent = new Intent(TrainingActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name4")){
                intent = new Intent(TrainingActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("name5")){
                intent = new Intent(TrainingActivity.this,PayActivity.class);
                startActivity(intent);
            }else if(view.getTag().toString().equals("back")) {
                finish();
            }
        }
    };

    public void findViews() {

        training_LBL_name = findViewById(R.id. training_LBL_name);
                training_LBL_name1 = findViewById(R.id. training_LBL_name1);
        training_LBL_name3 = findViewById(R.id. training_LBL_name3);
                training_LBL_name4 = findViewById(R.id. training_LBL_name4);
        training_LBL_name5 = findViewById(R.id. training_LBL_name5);
                Training_IMG_back = findViewById(R.id. Training_IMG_back);
      //  training_BTN_addwork = findViewById(R.id.training_BTN_addwork);
    }
}