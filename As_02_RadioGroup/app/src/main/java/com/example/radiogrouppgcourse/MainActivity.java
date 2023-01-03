package com.example.radiogrouppgcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    
    RadioGroup rdogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdogroup=findViewById(R.id.radioGroup);

        rdogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);

                Toast.makeText(MainActivity.this, "Selected Course is : " + radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}