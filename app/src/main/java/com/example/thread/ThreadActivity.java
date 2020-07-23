package com.example.thread;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerview.R;

public class ThreadActivity extends AppCompatActivity {
    private Button startThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        startThread = findViewById(R.id.start_thread);
        startThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    private void start() {
        AndroidThread thread = new AndroidThread(startThread);
        thread.start();
    }
}
