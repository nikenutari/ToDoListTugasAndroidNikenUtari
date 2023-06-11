package com.infinitelearning.baligo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnBackListener()
        btnLoginListener()

    }

    private fun btnBackListener() {
        btn_back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btnLoginListener() {
        btn_login.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

}