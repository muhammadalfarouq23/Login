package com.example.myapplicationlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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
                // Navigasi ke MainActivity dengan membawa data nama
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
