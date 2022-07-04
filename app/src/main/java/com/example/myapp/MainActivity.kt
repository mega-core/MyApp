package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.LinearLayoutCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.splashScreenTheme)
        setContentView(R.layout.activity_main)
        val textV = findViewById<EditText>(R.id.editTextTextPersonName)
        val nextButton = findViewById<LinearLayoutCompat>(R.id.linearLayoutCompat)
        nextButton.setOnClickListener {
            val name = textV.text?.toString()
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_TEXT",name)
                startActivity(it)

            }
        }
    }
}