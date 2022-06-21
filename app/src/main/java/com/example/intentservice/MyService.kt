package com.example.intentservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService:Service() {

    init {
        Log.d("service","services is running")
    }
    override fun onBind(p0: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val dataString=intent?.getStringExtra("EXTRA_DATA")
        dataString?.let {
            Log.d("service",dataString)
        }
       // while (true){}
      return START_STICKY
    }

}