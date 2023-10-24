package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class setting_about_us : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_about_us)

        val imagebtn : ImageView = findViewById(R.id.setting_back_about)

        imagebtn.setOnClickListener {
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
    }
}