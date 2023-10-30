package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class welcome_screen_start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen_start)

        var alpha_in = AnimationUtils.loadAnimation(this, R.anim.alpha_in)

        var textView7: TextView = findViewById<TextView>(R.id.textView7)
        var textView2:TextView= findViewById<TextView>(R.id.textView2)
        var button: Button = findViewById<Button>(R.id.button)


        textView7.startAnimation(alpha_in)
        button.startAnimation(alpha_in)

        button.setOnClickListener {
            val intent = Intent(this, welcome_screen_test1::class.java)
            startActivity(intent)
        }
        textView2.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}