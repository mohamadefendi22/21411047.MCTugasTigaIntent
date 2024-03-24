package com.example.a21411047mctugastiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fphactivity.*
import kotlinx.android.synthetic.main.activity_login.*

class FPHActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fphactivity)
        supportActionBar?.hide()

        btnBackFListener()
    }
    private fun btnBackFListener() {
        backF_1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}