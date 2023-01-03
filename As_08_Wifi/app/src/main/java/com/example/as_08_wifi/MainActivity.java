package com.example.as_08_wifi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean enable=false;
    int REQUEST_WIFI=1;
    WifiManager wifiManager;

    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btntOn = findViewById(R.id.btnwifi);
         wifiManager = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);

//         btntOn.setOnClickListener(V->{
//             wifiManager.setWifiEnabled(true);
//         });

    }
    public void  enablewifi(View v){
        wifiManager.setWifiEnabled(true);
    }
    public void  disablewifi(View v){
        wifiManager.setWifiEnabled(true);
    }


}