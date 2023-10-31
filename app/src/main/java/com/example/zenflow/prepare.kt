package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class prepare : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prepare)

        val btn:ImageView = findViewById(R.id.prepare_back)

        val Podgotovka:Button = findViewById(R.id.btn_1)
        val base_pri:Button = findViewById(R.id.btn_2)
        val meditation_povse:Button = findViewById(R.id.btn_3)
        val texnuki:Button = findViewById(R.id.btn_4)

        btn.setOnClickListener {
            val intent = Intent(this, main_menu::class.java)
            startActivity(intent)
        }
        base_pri.setOnClickListener {
            val intent = Intent(this, med_your_live::class.java)
            startActivity(intent)
        }
        meditation_povse.setOnClickListener {

        }
        Podgotovka.setOnClickListener {
            val intent = Intent(this, prepare_meditation::class.java)
            startActivity(intent)
        }
        texnuki.setOnClickListener {
            val intent = Intent(this, texnuki::class.java)
            startActivity(intent)
        }
    }
}