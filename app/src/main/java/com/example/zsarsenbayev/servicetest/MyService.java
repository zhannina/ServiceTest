package com.example.zsarsenbayev.servicetest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;

import com.affectiva.android.affdex.sdk.Frame;
import com.affectiva.android.affdex.sdk.detector.CameraDetector;
import com.affectiva.android.affdex.sdk.detector.Detector;
import com.affectiva.android.affdex.sdk.detector.Face;


/**
 * Created by zsarsenbayev on 7/26/17.
 */

public class MyService extends Service {

    MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
//        player.setLooping(true);
//        player.start();
//        mediaplayer works perfectly fine when unlocked

//        start the service
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
//        kill the service
//        player.stop();
    }
}
