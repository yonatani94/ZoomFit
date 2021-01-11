package com.example.zoomfit.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zoomfit.R;
import com.example.zoomfit.activities.LoginActivity;
import com.google.android.material.button.MaterialButton;

public class regSupply extends AppCompatActivity {
    MaterialButton register_BTN_create ;
    ProgressBar register_PGB_pgb ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regsupply);
        register_BTN_create = findViewById(R.id.register_BTN_create);
        register_PGB_pgb = findViewById(R.id.register_PGB_pgb);
        register_PGB_pgb.setVisibility(View.GONE);
        register_BTN_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register_PGB_pgb.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"User created",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
            }
        });
    }
}