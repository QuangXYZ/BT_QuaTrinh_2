package com.example.bt_quatrinh_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NoteAdapter mAdapter;
    private ArrayList<note> noteArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAll();
    }
    private void initAll(){
        recyclerView = findViewById(R.id.list_note);
        noteArrayList = new ArrayList<note>();
        noteArrayList.add(new note("Ghi chú 1","Nội dung của ghi chứ 1 abcdefghijklmnopq","img"
                , DateFormat.getDateTimeInstance().format(new Date()),"0:00"));
        noteArrayList.add(new note("Ghi chú 2","Nội dung của ghi chứ 2 abcdefghijklmnopq","img"
                , DateFormat.getDateTimeInstance().format(new Date()),"0:00"));
        mAdapter = new NoteAdapter(noteArrayList,this);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater im = getMenuInflater();
        im.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.save){
            Intent intent = new Intent(this, NoteDetailActivity.class);
            startActivity(intent);
        }

        if (item.getItemId() == R.id.info){

        }
        return true;
    }
}