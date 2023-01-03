package com.example.as_14_notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNotify = findViewById(R.id.btnShow);

       if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
           NotificationChannel channel=new NotificationChannel("my notification","my notification",NotificationManager.IMPORTANCE_DEFAULT);
           NotificationManager manager=getSystemService(NotificationManager.class);
           manager.createNotificationChannel(channel);
       }

        btnNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNotification();
            }
        });
    }

    private void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this,"my notification");
                        builder.setSmallIcon(R.drawable.ic_launcher_background);
                        builder.setContentTitle("Shubham Send Notification");
                        builder.setContentText("When a man learns to love, he must bear the risk of hatred. – Madara");
                        builder.setAutoCancel(true);

        NotificationManagerCompat managerCompat=NotificationManagerCompat.from(MainActivity.this);
        managerCompat.notify(1,builder.build());

    }
}