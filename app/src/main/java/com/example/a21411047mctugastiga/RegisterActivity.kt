package com.example.a21411047mctugastiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnBackRegisterListener()
        btnTxtLoginListener()
    }
    private fun btnBackRegisterListener() {
        backR_1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btnTxtLoginListener() {
        txt_log.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}