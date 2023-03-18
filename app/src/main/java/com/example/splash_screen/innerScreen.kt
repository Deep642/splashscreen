package com.example.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class innerScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inner_screen)
        val btn=findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val intent= Intent(this,lastScreen::class.java)
            startActivity(intent)
        }
    }
}