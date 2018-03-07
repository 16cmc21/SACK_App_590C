package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fam2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam2);
    }

    public void startAdult(View view){
        Intent intent = new Intent(this, adultActivity.class);
        startActivity(intent);
    }

    public void startNothing(View view){
        Intent intent = new Intent(this, nothActivity.class);
        startActivity(intent);
    }
}
