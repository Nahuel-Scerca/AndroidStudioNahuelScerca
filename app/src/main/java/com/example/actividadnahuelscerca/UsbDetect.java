package com.example.actividadnahuelscerca;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import static androidx.core.content.ContextCompat.startActivity;

public class UsbDetect extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean b = intent.getExtras().getBoolean("connected");

            if (b){

                Toast.makeText(context, "Entre", Toast.LENGTH_LONG).show();

                Intent i = new Intent("Intent.ACTION_CALL");
                intent.setData(Uri.parse("tel: "+"911"));
                context.startActivity(i);

            }
            else{
                Toast.makeText(context, "Desconectado", Toast.LENGTH_LONG).show();
            }

    }



}
