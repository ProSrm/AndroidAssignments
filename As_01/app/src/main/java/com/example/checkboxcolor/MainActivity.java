package com.example.checkboxcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chxOrange,chxGreen,chxViolet;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chxOrange=findViewById(R.id.chxcolor1);
        chxGreen=findViewById(R.id.chxcolor2);
        chxViolet=findViewById(R.id.chxcolor3);
        TextView txtResult=findViewById(R.id.txtResult);
        Button btn =findViewById(R.id.btnshow);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected colors";
                if(chxOrange.isChecked()){
                    result += "\nOrange";
                }
                if(chxGreen.isChecked()){
                    result += "\nGreen";
                }
                if(chxViolet.isChecked()){
                    result += "\nViolet";
                }

               txtResult.setText(result);
            }
        });










    }
}