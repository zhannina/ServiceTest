package com.example.zsarsenbayev.servicetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println(intent.getAction());
        if (intent.getAction().equals(Intent.ACTION_USER_PRESENT)) {
            Intent i = new Intent(context, MyService.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startService(i);
        }
    }
}
