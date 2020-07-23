package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.thread.ThreadActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Button thread = findViewById(R.id.thread_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToListActivity();
            }
        });
        thread.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                navigateToThreadActivity();
            }
        });
    }

    private void navigateToListActivity() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    private void navigateToThreadActivity() {
        Intent intent = new Intent(this, ThreadActivity.class);
        startActivity(intent);
    }
}
