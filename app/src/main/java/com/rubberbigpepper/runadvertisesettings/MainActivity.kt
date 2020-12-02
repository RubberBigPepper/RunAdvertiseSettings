package com.rubberbigpepper.runadvertisesettings

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        startAdvertiseActivity()
        finish()
    }

    private fun startAdvertiseActivity() {//запуск активити рекламы для настройки
        try {
            val cIntent = Intent()
            intent.setComponent(ComponentName("com.rubberbigpepper.advertise_on_screen", "com.rubberbigpepper.advertise_on_screen.MainActivity"))
            startActivity(intent)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}