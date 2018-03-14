package com.example.colincumming.sacapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //create class instance variable for the bottom nav view
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the bottom nav view object from your layout
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

    /*For each menu item i wrote a new start method. This is because in the nav listener below
     * I do not have access to the View object, and without it, I cannot call the start methods above
      * (original). So what I did is something called 'Overloading' this means creating multiple
      * methods with the same name, but different arguments. The method println() in System.out
      * is a heavily overloaded method. You can pass it strings, ints, doubles, chars, and it will
      * know what to do because the java developers at oracle created a method for all of those
      * different arguments. What I did here is the same.*/
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

    //here's the nav listener from above(onCreate()), it takes a MenuItem object called item
    //and I compare it's toString() method to the three button texts you created, and call a start
    //method that corresponds to which button was pressed.
    public void navListener(MenuItem item) {
        if (item.toString().equals("Resources"))
            startResources();
        else if (item.toString().equals("Home"))
            startHome();
        else if (item.toString().equals("About"))
            startSAC();
    }
}
