package com.example.as_07_bluetooth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int REQUEST_BLUETOOTH = 1;
    boolean enable = false;
    final BluetoothAdapter bAdapter = BluetoothAdapter.getDefaultAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btntOn = (Button) findViewById(R.id.btnblue);


        btntOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bAdapter == null) {
                    Toast.makeText(getApplicationContext(), "Bluetooth Not Supported", Toast.LENGTH_SHORT).show();
                } else {
                    if (!bAdapter.isEnabled()) {

                        if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
                            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.BLUETOOTH_CONNECT}, REQUEST_BLUETOOTH);
                        }
                        {
//                            startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE),1);
                            bAdapter.enable();
                            btntOn.setText("off");
                            Toast.makeText(getApplicationContext(), "Bluetooth Turned on", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        btntOn.setText("on");
                        bAdapter.disable();
                        Toast.makeText(getApplicationContext(), "Bluetoothe is off", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }

}