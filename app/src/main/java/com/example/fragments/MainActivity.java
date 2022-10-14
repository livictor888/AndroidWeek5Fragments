package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment first = new FirstFragment();
        Fragment second = new SecondFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.ctnFragment, first);
        fragmentTransaction.commit();


        Button btnFirst = findViewById(R.id.btnFragment1);
        btnFirst.setOnClickListener(view -> {
            FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
            fragmentTransaction1.replace(R.id.ctnFragment, first);
            fragmentTransaction1.commit();
        });

        Button btnSecond = findViewById(R.id.btnFragment2);
        btnSecond.setOnClickListener(view -> {
            FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
            fragmentTransaction2.replace(R.id.ctnFragment, second);
            fragmentTransaction2.commit();
        });
    }
}