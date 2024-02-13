package com.example.adaptors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview= findViewById(R.id.list);
        String[] countries = {"usa", "india","japan","africa"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                countries
//        );

        adaptorJAVA adapter = new adaptorJAVA(this, countries);
        listview.setAdapter(adapter);
    }



}