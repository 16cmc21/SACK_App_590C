package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class avoidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avoid);
    }

    public void startCont(View view){
        Intent intent = new Intent(this, fam2Activity.class);
        startActivity(intent);
    }
}