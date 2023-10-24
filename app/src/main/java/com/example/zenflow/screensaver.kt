package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.view.animation.AnimationUtils.*
import android.widget.LinearLayout
import android.widget.TextView

class screensaver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screensaver)

        var upDown = loadAnimation(this, R.anim.anim_translate)
        var downUp = loadAnimation(this, R.anim.anim_translate1)
        var scaleUp = loadAnimation(this, R.anim.anim_scale)
        var linearLayout2 = findViewById<LinearLayout>(R.id.linearLayout2)
        var textView2: TextView = findViewById<TextView>(R.id.textView3)
        var line_3 = findViewById<LinearLayout>(R.id.line_3)
        var line_4 = findViewById<LinearLayout>(R.id.line_4)

        line_3.startAnimation(scaleUp)
        line_4.startAnimation(scaleUp)
        linearLayout2.startAnimation(upDown)
        textView2.startAnimation(downUp)

        Handler().postDelayed({
            val intent = Intent(this, welcome_screen_with_button1::class.java)
            startActivity(intent)
        }, 3000)
    }
}