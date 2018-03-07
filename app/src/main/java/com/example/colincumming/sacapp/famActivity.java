package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class famActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam);
    }

    public void startTrust(View view){
        Intent intent = new Intent(this, trustActivity.class);
        startActivity(intent);
    }

    public void startAvoid(View view){
        Intent intent = new Intent(this, avoidActivity.class);
        startActivity(intent);
    }

}
