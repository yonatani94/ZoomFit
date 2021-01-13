package com.example.zoomfit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zoomfit.PayActivity;
import com.example.zoomfit.R;

public class CoachActivity extends AppCompatActivity {
    private TextView training_LBL_name;

    private TextView training_LBL_name1;

    private TextView training_LBL_name3;

    private TextView training_LBL_name4;

    private TextView training_LBL_name5;
    private ImageView Training_IMG_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listcoach);
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
            Log.d("johny", "onClick: tag = "  + view.getTag().toString());
            if(view.getTag().toString().equals("name_5")){
                payActivity();

            }else if(view.getTag().toString().equals("name_1")){
                payActivity();

            }else if(view.getTag().toString().equals("name_2")){
                payActivity();

            }else if(view.getTag().toString().equals("name_3")){
                payActivity();

            }else if(view.getTag().toString().equals("name_4")){
                payActivity();

            }else if(view.getTag().toString().equals("back")) {
                finish();
            }
        }
    };

    private void payActivity() {
        Intent intent = new Intent(getApplicationContext(), PayActivity.class);
        this.startActivity(intent);
    }

    public void findViews() {

        training_LBL_name = findViewById(R.id. training_LBL_name);
        training_LBL_name1 = findViewById(R.id. training_LBL_name1);
        training_LBL_name3 = findViewById(R.id. training_LBL_name3);
        training_LBL_name4 = findViewById(R.id. training_LBL_name4);
        training_LBL_name5 = findViewById(R.id. training_LBL_name5);
        Training_IMG_back = findViewById(R.id. Training_IMG_back);
    }
}
