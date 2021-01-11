package com.example.zoomfit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zoomfit.R;
import com.example.zoomfit.register.RegTrain;
import com.example.zoomfit.register.regCoach;
import com.example.zoomfit.register.regDiet;
import com.example.zoomfit.register.regSupply;
import com.google.android.material.button.MaterialButton;

public class regMainActivity extends AppCompatActivity {
    private MaterialButton Start_BTN_RegTrain;
    private MaterialButton Start_BTN_RecordTrain;
    private MaterialButton Start_BTN_Regdiet;
    private MaterialButton Start_BTN_Regsupply;
    private TextView        register_TXT_login;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regmain);
        findviews();
        Start_BTN_RegTrain.setOnClickListener(buttonClickListener);
        Start_BTN_RecordTrain.setOnClickListener(buttonClickListener);
        Start_BTN_Regdiet.setOnClickListener(buttonClickListener);
        Start_BTN_Regsupply.setOnClickListener(buttonClickListener);
        register_TXT_login.setOnClickListener(buttonClickListener);
    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            buttonClicked(view);
        }
    };

    private void buttonClicked(View view) {
        if(view.getTag().toString().equals("RegTrain")){
            RegTrainActivity();
        }
        if(view.getTag().toString().equals("RegCoach")){
            RegCoachActivity();

        }
        if(view.getTag().toString().equals("RecgDiet")){
            RecgDiethActivity();

        }
        if(view.getTag().toString().equals("regsupply")){
            regSupplyhActivity();

        }
        if(view.getTag().toString().equals("logout")){
            logout();
        }

    }

    private void RecgDiethActivity() {
        Intent intent = new Intent(getApplicationContext(), regDiet.class);
        this.startActivity(intent);
    }

    private void regSupplyhActivity() {
        Intent intent = new Intent(getApplicationContext(), regSupply.class);
        this.startActivity(intent);
    }

    private void RegCoachActivity() {
        Intent intent = new Intent(getApplicationContext(), regCoach.class);
        this.startActivity(intent);
    }

    private void RegTrainActivity() {
        Intent intent = new Intent(getApplicationContext(), RegTrain.class);
        this.startActivity(intent);
    }

    private void logout() {
        //startActivity(new Intent(getApplicationContext(),com.example.zoomfit.activities.LoginActivity.class));
        finish();
    }

    private void findviews() {
        Start_BTN_RegTrain   = findViewById(R.id.Start_BTN_RegTrain)  ;
        Start_BTN_RecordTrain=findViewById(R.id.Start_BTN_RecordTrain);
        Start_BTN_Regdiet    =findViewById(R.id.Start_BTN_Regdiet) ;
        Start_BTN_Regsupply  =findViewById(R.id.Start_BTN_Regsupply)  ;
        register_TXT_login= findViewById(R.id.register_TXT_login);
    }
}
