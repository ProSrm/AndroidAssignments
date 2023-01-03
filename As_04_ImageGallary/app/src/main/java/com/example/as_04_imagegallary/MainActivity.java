package com.example.as_04_imagegallary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton btnfirst,btnsecond,btnthird ,btnfourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfirst=findViewById(R.id.first);
        btnsecond=findViewById(R.id.first);
        btnthird=findViewById(R.id.third);
        btnfourth=findViewById(R.id.fourth);

        btnfirst.setOnClickListener(V->{

            Toast.makeText(this, "first Image clicked \n"+"image id:"+btnfirst.getId(), Toast.LENGTH_SHORT).show();

        });
        btnsecond.setOnClickListener(V->{

            Toast.makeText(this, "second Image clicked \n"+"image id:"+btnsecond.getId(), Toast.LENGTH_SHORT).show();

        });
        btnthird.setOnClickListener(V->{

            Toast.makeText(this, "third Image clicked \n"+"image id:"+btnthird.getId(), Toast.LENGTH_SHORT).show();

        });
        btnfourth.setOnClickListener(V->{

            Toast.makeText(this, "fourth Image clicked \n"+"image id:"+btnfourth.getId(), Toast.LENGTH_SHORT).show();

        });



    }

}