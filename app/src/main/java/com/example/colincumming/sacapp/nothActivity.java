package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class nothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noth);
    }

    public void startCont2(View view){
        Intent intent = new Intent(this, famResActivity.class);
        startActivity(intent);
    }
}
