package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class friendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
    }

    public void startInvolved(View view){
        Intent intent = new Intent(this, involvedActivity.class);
        startActivity(intent);
    }

    public void startIgnore(View view){
        Intent intent = new Intent(this, ignoreActivity.class);
        startActivity(intent);
    }
}
