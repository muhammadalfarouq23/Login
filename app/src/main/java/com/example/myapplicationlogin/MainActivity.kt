package com.example.myapplicationlogin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etusername)
        val etPassword = findViewById<EditText>(R.id.etpassword)
        val btnLogin = findViewById<Button>(R.id.btnlogin)

        btnLogin.setOnClickListener {
            val name = etName.text.toString()
            val password = etPassword.text.toString()

            if (name.isNotEmpty() && password.isNotEmpty()) {
                // Log email (username) ke Logcat
                Log.d("LoginActivity", "Email yang dimasukkan: $name")

                // Navigasi ke MainActivity2 dengan membawa data nama
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Kolom harus diisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
