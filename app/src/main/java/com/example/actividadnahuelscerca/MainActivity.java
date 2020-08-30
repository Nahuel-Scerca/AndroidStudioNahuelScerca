package com.example.actividadnahuelscerca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import static androidx.core.content.ContextCompat.startActivity;

public class MainActivity extends AppCompatActivity {

    private UsbDetect usbDetect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        usbDetect = new UsbDetect();
        registerReceiver(usbDetect,new IntentFilter("android.hardware.usb.action.USB_STATE"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(usbDetect);
    }



    public void llamarNueveOnce(){
        Intent intent = new Intent("Intent.ACTION_CALL");
        intent.setData(Uri.parse("tel: "+"911"));
        startActivity(intent);
    }
}