package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class friend2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend2);
    }

    public void startDone(View view){
        Intent intent = new Intent(this, doneActivity.class);
        startActivity(intent);
    }

    public void startFollow(View view){
        Intent intent = new Intent(this, followActivity.class);
        startActivity(intent);
    }
}
