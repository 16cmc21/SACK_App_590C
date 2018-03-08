package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void startFam(View view) {
        Intent intent = new Intent(this, famActivity.class);
        startActivity(intent);
    }

    public void startRel(View view){
        Intent intent = new Intent(this, relActivity.class);
        startActivity(intent);
    }

    public void startFriend(View view) {
        Intent intent = new Intent(this, friendActivity.class);
        startActivity(intent);
    }

    public void startR(View view) {
        Intent intent  = new Intent(this, ResActivity.class);
        startActivity(intent);
    }

    public void startHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
