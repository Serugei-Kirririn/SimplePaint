package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Load extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
         Timer timer = new Timer();
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Load.this,MainActivity.class);
                startActivity(intent);


            }

        };
        timer.schedule(t,2000L);



    }
}