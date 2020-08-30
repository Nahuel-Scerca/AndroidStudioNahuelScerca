package com.example.actividadnahuelscerca;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import static androidx.core.content.ContextCompat.startActivity;

public class UsbDetect extends BroadcastReceiver {
    private MainActivity ma = new MainActivity();

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean b = intent.getExtras().getBoolean("connected");

            if (b){
                Toast.makeText(context, "Entre", Toast.LENGTH_LONG).show();
                ma.llamarNueveOnce();
            }

        throw new UnsupportedOperationException("Not yet implemented");

    }

}
