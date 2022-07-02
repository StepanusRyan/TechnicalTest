package com.stepanusryan.testprogram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.stepanusryan.testprogram.ui.login.LoginActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        Handler(mainLooper).postDelayed({
            startActivity(Intent(this@SplashScreenActivity,LoginActivity::class.java))
        },3000L)
        finish()
    }
}