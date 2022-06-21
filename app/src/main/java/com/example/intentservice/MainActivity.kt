package com.example.intentservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Intent(this,MyIntentService::class.java).also {
                startService(it)
                textView.text="Service started Running"
            }

        }

        button2.setOnClickListener {
            MyIntentService.onStopService()
            textView.text="Service Stopping.."
        }
    }
}