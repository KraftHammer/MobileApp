package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class welcome_screen_with_button1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen_with_button1)

        var alpha_in = AnimationUtils.loadAnimation(this, R.anim.alpha_in)
        var alpha_out = AnimationUtils.loadAnimation(this, R.anim.alpha_out)

        var textView7: TextView = findViewById<TextView>(R.id.textView7)
        var textView6: TextView = findViewById<TextView>(R.id.textView6)
        var button: Button = findViewById<Button>(R.id.button)

        textView6.startAnimation(alpha_in)
        textView7.startAnimation(alpha_in)
        button.startAnimation(alpha_in)

        button.setOnClickListener {
            val intent = Intent(this, welcome_screen_start::class.java)
            startActivity(intent)
        }
    }
}