package com.infinitelearning.baligo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnBackListener()
        btnRegisterListener()
    }

    private fun btnBackListener() {
        btn_back.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btnRegisterListener() {
        btn_register.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}