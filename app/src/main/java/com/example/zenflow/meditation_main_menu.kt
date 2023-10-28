package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class meditation_main_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation_main_menu)

        val back: ImageView = findViewById(R.id.meditation_back)

        back.setOnClickListener{
            val intent = Intent(this, main_menu::class.java)
            startActivity(intent)
        }
    }
}