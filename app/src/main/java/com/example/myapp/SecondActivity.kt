package com.example.myapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name = intent.getStringExtra("EXTRA_TEXT")
        val tV = findViewById<TextView>(R.id.tV2)
        tV.text = name
    }
}