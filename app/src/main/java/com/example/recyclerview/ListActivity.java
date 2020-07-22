package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ListActivityAdapter adapter = new ListActivityAdapter(mockData());
        recyclerView.setAdapter(adapter);
    }

    private List<Data> mockData() {
        List<Data> dataSet = new ArrayList<>();
        String title = "title";
        String desp = "desp";
        for(int i = 1; i < 16; ++i) {
            String number = String.valueOf(i);
            Data data = new Data(title.concat(number), desp.concat(number), i);
            dataSet.add(data);
        }

        return dataSet;
    }
}
