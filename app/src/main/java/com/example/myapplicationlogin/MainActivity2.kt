package com.example.myapplicationlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)

        // Ambil nama pengguna dari Intent
        val userName = intent.getStringExtra("USER_NAME")
        tvWelcome.text = "Welcome, $userName!"
    }
}
