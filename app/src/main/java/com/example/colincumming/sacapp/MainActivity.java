package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startQuiz(View view) {

        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    public void startResources(View view) {

        Intent intent = new Intent(this, ResActivity.class);
        startActivity(intent);
    }

    public void startSAC(View view) {

        Intent intent = new Intent(this, SACActivity.class);
        startActivity(intent);
    }

    public void startHome(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void startR(View view) {

        Intent intent  = new Intent(this, ResActivity.class);
        startActivity(intent);
    }
}
