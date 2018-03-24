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

public class ResActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
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
        TextView t1 = (TextView) findViewById(R.id.textView36);
                 t1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t2 = (TextView) findViewById(R.id.council1);
                t2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t3 = (TextView) findViewById(R.id.maltbyCentre);
                t3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t4 = (TextView) findViewById(R.id.resolveCouncil);
                t4.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t5 = (TextView) findViewById(R.id.textView38);
                t5.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t6 = (TextView) findViewById(R.id.textView37);
                t6.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t7 = (TextView) findViewById(R.id.textView30);
                t7.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t8 = (TextView) findViewById(R.id.textView32);
                t8.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void startHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
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
