package com.amarpreetsinghprojects.newproject;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int b=0,g=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentA fragmentA = new FragmentA();
        final FragmentB fragmentB = new FragmentB();

        Button blue = (Button)findViewById(R.id.blue);
        Button green = (Button)findViewById(R.id.green);
        final FragmentManager fragmentManager = getSupportFragmentManager();

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.add(R.id.container,fragmentA.newInstance(b++)); // this doesnot make changes in view only in memory
                transaction.commit(); // this brings changes to screen
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.container,fragmentB.newInstance(g++));
                transaction.commit();
            }
        });
    }
}
