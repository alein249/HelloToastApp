package com.streamliners.hellotoastapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.streamliners.hellotoastapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Initialize binding
        b=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        //Handle the click event
        eventHandler();
    }

    /**
     * Trigger Event handlers to listen the actions
     */
    private void eventHandler() {
        //click listener on Toast button
        b.toastBtn.setOnClickListener(v -> {
            //Show toast message
            Toast.makeText(MainActivity.this, R.string.toast_msg, Toast.LENGTH_SHORT).show();
        });

        //click listener on Count button
        b.countBtn.setOnClickListener(v -> {
            /*
             *Increase the count
             *Update count TextView
             */
            b.count.setText(++count+"");
        });
    }
}