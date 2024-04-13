package com.example.uts_amariani

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tombolPindahHalaman: Button = findViewById(R.id.login)
        tombolPindahHalaman.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


    }
        val tombolPindahHalaman2: Button = findViewById(R.id.res)
        tombolPindahHalaman2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
}

    }}