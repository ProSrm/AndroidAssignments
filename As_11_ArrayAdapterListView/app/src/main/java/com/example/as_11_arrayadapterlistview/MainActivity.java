package com.example.as_11_arrayadapterlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ArrayAdapter aAdapter;
    private String[] fruit = { "Mango","Kiwi","pear","Grapes","Orange"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.fruitList);
        aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, fruit);
        mListView.setAdapter(aAdapter);


    }
}