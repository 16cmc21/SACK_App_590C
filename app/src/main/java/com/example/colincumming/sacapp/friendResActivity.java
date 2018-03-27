package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class friendResActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_res);
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

        setContentView(R.layout.activity_friend_res);
        TextView t13 = (TextView) findViewById(R.id.textView11);
        t13.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t14 = (TextView) findViewById(R.id.textView12);
        t14.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void startResources(View view){
        Intent intent = new Intent(this, ResActivity.class);
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
