package com.example.zoomfit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zoomfit.R;
import com.example.zoomfit.StartUp;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {
    private MaterialButton login_BTN_login;
    private MaterialButton login_BTN_register;
    private ProgressBar login_PGB_pgb;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViews();

        login_PGB_pgb.setVisibility(View.GONE);
        login_BTN_login.setOnClickListener(fillAccount);
        login_BTN_register.setOnClickListener(fillAccount);
    }
    private View.OnClickListener fillAccount = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            buttonClicked(view);
        }
    };

    private void buttonClicked(View view) {

        if (view.getTag().toString().equals("login")) {
            login_PGB_pgb.setVisibility(View.VISIBLE);
            Intent intent = new Intent(getApplicationContext(), StartUp.class);
         startActivity(intent);
        } else if ((view.getTag().toString().equals("register"))) {
            Intent intent = new Intent(getApplicationContext(), regMainActivity.class);
           startActivity(intent);
        }

    }
    private void findViews() {
        login_BTN_login = findViewById(R.id.login_BTN_login);
        login_BTN_register = findViewById(R.id.login_BTN_register);
        login_PGB_pgb  = findViewById(R.id.login_PGB_pgb);
    }
}
