package com.example.as_05_spinnercolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    String[] colors = { "pink","skyblue","green" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, colors);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


        if (colors[i]=="pink")
        getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);
        if (colors[i]=="skyblue")
            getWindow().getDecorView().setBackgroundColor(Color.CYAN);
        if (colors[i]=="green")
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}