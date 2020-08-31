package com.example.actividadnahuelscerca;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import static androidx.core.content.ContextCompat.startActivity;

public class UsbDetect extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        int bandera= 0;
        boolean b = intent.getExtras().getBoolean("connected");

            if (b && bandera==0){

                Toast.makeText(context, "Entre", Toast.LENGTH_LONG).show();
                Intent i = new Intent(context,LlamadaActivity.class);
                context.startActivity(i);

                bandera= 1;
            }
            else{
                bandera= 0;
                Toast.makeText(context, "Desconectado", Toast.LENGTH_LONG).show();
            }

    }









}
