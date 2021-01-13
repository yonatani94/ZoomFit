package com.example.zoomfit.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zoomfit.R;

public class SettingsActivity  extends AppCompatActivity {
    private ImageView Pay_IMG_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_settings);
        Pay_IMG_back = findViewById(R.id.Pay_IMG_back);
        Pay_IMG_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getTag().toString().equals("back"))
                    finish();

            }
        }) ;
    }
}
