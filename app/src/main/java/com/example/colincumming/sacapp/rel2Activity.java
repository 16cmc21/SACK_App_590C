package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class rel2Activity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rel2);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        //set a 'listener' for the bottom nav view, this is a round-about way of doing onclick
        //but the android developers at google think this is a better way  to do it.
        //found a lot in gui programming
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                navListener(item);
                return true;
            }
        });
    }

    public void startPressure(View view){
        Intent intent = new Intent(this, pressureActivity.class);
        startActivity(intent);
    }

    public void startRespect(View view){
        Intent intent = new Intent(this, respectActivity.class);
        startActivity(intent);
    }

    public void startResources() {

        Intent intent = new Intent(this, ResActivity.class);
        startActivity(intent);
    }

    public void startSAC() {

        Intent intent = new Intent(this, SACActivity.class);
        startActivity(intent);
    }

    public void startHome() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void navListener(MenuItem item) {
        if (item.toString().equals("Resources"))
            startResources();
        else if (item.toString().equals("Home"))
            startHome();
        else if (item.toString().equals("About"))
            startSAC();
    }
}
