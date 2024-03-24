package com.example.a21411047mctugastiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()
        btnTxtRegisterListener()
        btnFPListener()
        btnLoginListener()
    }

    private fun btnBackLoginListener() {
        backL_1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btnTxtRegisterListener() {
        txt_reg.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun btnFPListener() {
        txtL_2.setOnClickListener {
            startActivity(Intent(this, FPHActivity::class.java))
        }
    }

    private fun btnLoginListener() {
        btnL_1.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}