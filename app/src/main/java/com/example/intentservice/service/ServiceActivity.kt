package com.example.intentservice.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.intentservice.MyService
import com.example.intentservice.R
import kotlinx.android.synthetic.main.activity_service.*

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        button.setOnClickListener {
            Intent(this,MyService::class.java).also {
                startService(it)
                textView.text="Service is Started running"
            }
        }

        button2.setOnClickListener {
            Intent(this,MyService::class.java).also {
                stopService(it)
                textView.text="Service is Stopped.."
            }
        }

        button3.setOnClickListener {
       Intent(this,MyService::class.java).also {
           val dataString=editTextTextPersonName.text.toString()
           it.putExtra("EXTRA_DATA", dataString)
           Log.d("myService", "service start = $dataString")
            }

        }
    }
}