package com.example.intentservice

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService: IntentService("MyIntentsService") {
    companion object{
        private lateinit var  Instance:MyIntentService

        var isRunning=false

        fun onStopService(){
            Instance= MyIntentService()
            Log.d("service","service is Stopped Running")
            isRunning=false
            Instance.stopSelf()
        }
    }
    init {
        Instance=this
    }
    override fun onHandleIntent(p0: Intent?) {
        try {
            isRunning=true
            while (isRunning){
                Log.d("service","service is Running")
                Thread.sleep(1000)
            }

        }catch (e:InterruptedException){
            Thread.currentThread().interrupt()
            Log.d("service","$e")
        }

    }


}