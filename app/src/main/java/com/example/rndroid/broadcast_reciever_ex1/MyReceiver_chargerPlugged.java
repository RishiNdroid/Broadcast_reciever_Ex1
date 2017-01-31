package com.example.rndroid.broadcast_reciever_ex1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver_chargerPlugged extends BroadcastReceiver {
    public MyReceiver_chargerPlugged() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String action  = intent.getAction();
        switch (action){
            case Intent.ACTION_POWER_CONNECTED:
                    Toast.makeText(context, "Charger Plugged", Toast.LENGTH_SHORT).show();
                Log.d("B34", "Charger Plugged");
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "Charger Un-Plugged", Toast.LENGTH_SHORT).show();
                Log.d("B34", "Un-Plugged");
                break;
            case Intent.ACTION_CAMERA_BUTTON:
                Toast.makeText(context, "Welcome", Toast.LENGTH_SHORT).show();
                Log.d("B34", "camera");
                break;
            case Intent.ACTION_SCREEN_OFF:
                Toast.makeText(context, "Welcome", Toast.LENGTH_SHORT).show();
                Log.d("B34", "action screen off");
                break;
        }

    }
}
