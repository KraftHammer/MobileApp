package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView

class welcome_screen_end : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen_end)

        var alpha_in = AnimationUtils.loadAnimation(this, R.anim.alpha_in)

        var textView7:TextView = findViewById<TextView>(R.id.textView7)

        Handler().postDelayed({
            val intent = Intent(this, main_menu::class.java)
            startActivity(intent)
        }, 3000)
    }
}