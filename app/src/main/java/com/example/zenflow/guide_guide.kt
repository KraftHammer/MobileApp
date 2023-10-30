package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class guide_guide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_guide)

        val textq: TextView = findViewById(R.id.guide_guide_Text)
        val titleq: TextView = findViewById(R.id.guide_guide_Title)
        val btn: ImageView = findViewById(R.id.guide_guide_Back)

            titleq.text = intent.getStringExtra("guide_guide_Title")
            textq.text = intent.getStringExtra("guide_guide_Text")


        btn.setOnClickListener{
            val intent = Intent(this, guide_main::class.java)
            startActivity(intent)
        }
    }
}