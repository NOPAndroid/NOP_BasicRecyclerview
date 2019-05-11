package com.nop.basicrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.nop.basicrecyclerview.adapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar setup start
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_recyclerview_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //End
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager recylerViewManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recylerViewManager);
        ArrayList<String> arlstName = new ArrayList<>();
        arlstName.add("Aadarsh");
        arlstName.add("Aadhidev");
        arlstName.add("Aadhira");
        arlstName.add("Aadhishankar");
        arlstName.add("Aaditey");
        arlstName.add("Aagman");
        arlstName.add("Aagney");
        arlstName.add("Aalok");
        arlstName.add("Akash");
        arlstName.add("Mahesh");
        arlstName.add("Divya");
        arlstName.add("Dinesh");
        arlstName.add("Vir");
        arlstName.add("Mahesh");
        arlstName.add("Kumar");
        arlstName.add("Naresh");
        arlstName.add("Dhaval");
        arlstName.add("Kartik");
        adapter = new RecyclerViewAdapter(this,arlstName);
        recyclerView.setAdapter(adapter);
    }
}
