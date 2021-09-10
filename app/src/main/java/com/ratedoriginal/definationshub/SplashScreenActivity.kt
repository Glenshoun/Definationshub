package com.ratedoriginal.definationshub

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.window.SplashScreen

class SplashScreenActivity : AppCompatActivity() {
    
    private val splashScreentimeout: Long = 3000
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({

              startActivity(Intent(this, MainActivity::class.java))

        }, splashScreentimeout)
    }
}