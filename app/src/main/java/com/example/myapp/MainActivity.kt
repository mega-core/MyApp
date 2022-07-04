package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.widget.LinearLayoutCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.splashScreenTheme)
        setContentView(R.layout.activity_main)
        val textV = findViewById<EditText>(R.id.editTextTextPersonName)
        val nextButton = findViewById<LinearLayoutCompat>(R.id.linearLayoutCompat)
        val profileImg = findViewById<ImageView>(R.id.profile_img)
        val nothing = findViewById<ImageButton>(R.id.nothing)
        nothing.setOnClickListener{
            Toast.makeText(this,"This button does nothing",Toast.LENGTH_LONG).show()
        }
        profileImg.setOnClickListener{
            Toast.makeText(this,"There is no image",Toast.LENGTH_SHORT).show()
        }
        nextButton.setOnClickListener {
            val name = textV.text?.toString()
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_TEXT",name)
                startActivity(it)

            }
        }
    }
}