package com.example.presly.servicepractice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import static android.support.v4.app.ServiceCompat.START_STICKY;

public class MyService extends Service{

    //always have to put Ibinder...even if just for null return
    public IBinder onBind(Intent arg0){
        return null;
    }

public int onStartCommand(Intent intent, int flags, int startId){
        //let it continue running untill it is stopped
    Toast.makeText(this,"Service started", Toast.LENGTH_LONG).show();
    return START_STICKY;
}

public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Service ended", Toast.LENGTH_LONG).show();
}
}
