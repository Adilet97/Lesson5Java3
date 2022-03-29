package com.example.lesson5java3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);
        ArrayList<String> names = new ArrayList<>();
        names.add("Malika");
        names.add("Malika");
        names.add("Malika");
        names.add("Malika");
        names.add("Malika");
        names.add("Malika");
        names.add("Malika");
        names.add("Malika");
        adapter = new Adapter(names);
        recyclerView.setAdapter(adapter);

    }
}