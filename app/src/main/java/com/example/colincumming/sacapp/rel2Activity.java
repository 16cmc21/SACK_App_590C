package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rel2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rel2);
    }

    public void startPressure(View view){
        Intent intent = new Intent(this, pressureActivity.class);
        startActivity(intent);
    }

    public void startRespect(View view){
        Intent intent = new Intent(this, respectActivity.class);
        startActivity(intent);
    }
}
