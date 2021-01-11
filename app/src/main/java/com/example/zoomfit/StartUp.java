package com.example.zoomfit;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zoomfit.activities.SettingsActivity;
import com.example.zoomfit.activities.chatActivity;
import com.example.zoomfit.activities.coachActivity;
import com.example.zoomfit.activities.dietActivity;
import com.example.zoomfit.activities.liveActivity;
import com.example.zoomfit.activities.recordActivity;
import com.example.zoomfit.activities.supplyActivity;
import com.google.android.material.button.MaterialButton;

public class StartUp extends AppCompatActivity {
    private MaterialButton Start_BTN_RecordTrain;
    private MaterialButton Start_BTN_listCoach;
    private MaterialButton Start_BTN_live;
    private MaterialButton Start_BTN_diet;
    private MaterialButton Start_BTN_chat;
    private MaterialButton Start_BTN_supply;
    private MaterialButton Start_BTN_settings ;
    private MaterialButton Start_BTN_logout ; 
    
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        findviews();
        Start_BTN_listCoach.setOnClickListener(buttonClickListener);
        Start_BTN_settings.setOnClickListener(buttonClickListener);
        Start_BTN_logout.setOnClickListener(buttonClickListener);
    }

    private void findviews() {
        Start_BTN_RecordTrain = findViewById(R.id.Start_BTN_RecordTrain)                ;
        Start_BTN_listCoach   = findViewById(R.id.Start_BTN_listCoach)               ;
        Start_BTN_live        = findViewById(R.id.Start_BTN_live)            ;
        Start_BTN_diet        = findViewById(R.id.Start_BTN_diet)                   ;
        Start_BTN_chat        = findViewById(R.id.Start_BTN_chat)                  ;
        Start_BTN_supply      = findViewById(R.id.Start_BTN_supply)                     ;
        Start_BTN_settings    = findViewById(R.id.Start_BTN_settings )                      ;
        Start_BTN_logout      = findViewById(R.id.Start_BTN_logout )                       ;
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            buttonClicked(view);
        }
    };

    private void buttonClicked(View view) {
        if(view.getTag().toString().equals("RecordTrain")){
            recordActivity();
        }
        if(view.getTag().toString().equals("coach")){
            coachActivity();
        }
        if(view.getTag().toString().equals("live")){
            liveActivity();
        }
        if(view.getTag().toString().equals("diet")){
            dietActivity();
        }
        if(view.getTag().toString().equals("chat")){
            chatActivity();
        }
        if(view.getTag().toString().equals("supply")){
            supplyActivity();
        }
        if(view.getTag().toString().equals("settings")){
            settingsActivity();
        }
        if(view.getTag().toString().equals("logout"))
        {
        finish();
        }
    }

    private void recordActivity() {
        Intent intent = new Intent(getApplicationContext(), recordActivity.class);
        this.startActivity(intent);
    }

    private void coachActivity() {
        Intent intent = new Intent(getApplicationContext(), coachActivity.class);
        this.startActivity(intent);
    }

    private void liveActivity() {
        Intent intent = new Intent(getApplicationContext(), liveActivity.class);
        this.startActivity(intent);
    }

    private void dietActivity() {
        Intent intent = new Intent(getApplicationContext(), dietActivity.class);
        this.startActivity(intent);
    }

    private void chatActivity() {
        Intent intent = new Intent(getApplicationContext(), chatActivity.class);
        this.startActivity(intent);
    }

    private void supplyActivity() {
        Intent intent = new Intent(getApplicationContext(), supplyActivity.class);
        this.startActivity(intent);
    }

    private void settingsActivity() {
        Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
        this.startActivity(intent);
    }


}
