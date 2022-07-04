package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.splashScreenTheme)
        setContentView(R.layout.activity_main)
        val nothingBtn = findViewById<ImageView>(R.id.nothing)
        val goToNextActivity = findViewById<LinearLayoutCompat>(R.id.linearLayoutCompat)
        nothingBtn.setOnClickListener{
            Toast.makeText(this,"This button does nothing",Toast.LENGTH_SHORT).show()
        }
        goToNextActivity.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("Text","Hi whats up")
            startActivity(intent)
        }
    }
}