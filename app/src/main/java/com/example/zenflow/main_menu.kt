package com.example.zenflow


import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class main_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        val btn_tomedi: Button = findViewById(R.id.Main_menu_tomeditation)
        val btn_spr: Button = findViewById(R.id.Main_menu_tosprav)
        val btn_ach: Button = findViewById(R.id.Main_menu_toach)
        val btn_melodi: Button = findViewById(R.id.Main_menu_tomelodi)
        val btn_lit: Button = findViewById(R.id.Main_menu_toliter)
        val btn_set : ImageView = findViewById(R.id.btn_setting)

        btn_tomedi.setOnClickListener {
            val intent = Intent(this, meditation_main_menu::class.java)
            startActivity(intent)
        }
        btn_spr.setOnClickListener{
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_ach.setOnClickListener{
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_melodi.setOnClickListener{
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_set.setOnClickListener{
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_lit.setOnClickListener{
            val intent = Intent(this, book_main::class.java)
            startActivity(intent)
        }
    }
}