package com.kyaracter.fragmentmanagerannotation.example;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.kyaracter.fragmentmanagerannotation.library.LookupFragmentManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kyaracter.fragmentmanagerannotation.example.R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(com.kyaracter.fragmentmanagerannotation.example.R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(com.kyaracter.fragmentmanagerannotation.example.R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        //throw IllegalArgumentException due to MainFragment with SupportChildFragmentManager annotation
        LookupFragmentManager.supportFragmentManager(this, com.kyaracter.fragmentmanagerannotation.example.R.id.fragment);
    }
}
