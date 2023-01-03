package com.example.as_09_tablelayoutlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtuser,edtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtuser=findViewById(R.id.edtusername);
        edtPass=findViewById(R.id.edtpass);
        btnLogin=findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(v->{
            if(edtuser.getText().toString().equals("mca") && edtPass.getText().toString().equals("android")){

                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Please enter correct credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}