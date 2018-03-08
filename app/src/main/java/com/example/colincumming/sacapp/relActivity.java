package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class relActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rel);
    }

    public void startParticipate(View view){
        Intent intent = new Intent(this, participateActivity.class);
        startActivity(intent);
    }

    public void startAvoid(View view){
        Intent intent = new Intent(this, notEngActivity.class);
        startActivity(intent);
    }
}
