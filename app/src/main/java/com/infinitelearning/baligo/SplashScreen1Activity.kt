package com.infinitelearning.baligo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen1Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen1)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()

        }, 3000)
    }
}