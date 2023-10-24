package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class setting_main_window : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_main_window)

        val btn_about: Button = findViewById(R.id.btn_aboutus)
        val btn_general: Button = findViewById(R.id.btn_generalsetting)
        val btn_feedback: Button = findViewById(R.id.btn_feedback)
        val btn_frequent: Button = findViewById(R.id.btn_frequent)
        val btn_exit: Button = findViewById(R.id.btn_exit)
        val imagebtn : ImageView = findViewById(R.id.setting_back_menu)

        btn_about.setOnClickListener {
            val intent = Intent(this, setting_about_us::class.java)
            startActivity(intent)
        }
        btn_general.setOnClickListener {
            val intent = Intent(this, setting_general_setting::class.java)
            startActivity(intent)
        }
        btn_feedback.setOnClickListener {
            val intent = Intent(this, setting_feedback::class.java)
            startActivity(intent)
        }
        btn_frequent.setOnClickListener {
            val intent = Intent(this, setting_frequent_questions::class.java)
            startActivity(intent)
        }
        btn_exit.setOnClickListener {
            val intent = Intent(this, setting_exit::class.java)
            startActivity(intent)
        }
        imagebtn.setOnClickListener {
            val intent = Intent(this, main_menu::class.java)
            startActivity(intent)
        }
    }
}