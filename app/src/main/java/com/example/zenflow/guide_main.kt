package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class guide_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_main)

        val itemsList : RecyclerView = findViewById(R.id.guide_RecycleView)
        val item123 = arrayListOf<Guide>()
        val back: ImageView = findViewById(R.id.guide_back)

        item123.add(Guide("Концентрация внимания", "Концентрация - это одно из свойств внимани", "3"))
        item123.add(Guide("Концентрация внимания", "Концентрация - это одно из свойств внимани", "3"))
        item123.add(Guide("Концентрация внимания", "Концентрация - это одно из свойств внимани", "3"))
        item123.add(Guide("Концентрация внимания", "Концентрация - это одно из свойств внимани", "3"))
        item123.add(Guide("Концентрация внимания", "Концентрация - это одно из свойств внимани", "3"))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = GuideAdapter(item123, this)

        back.setOnClickListener {
            val intent = Intent(this, main_menu::class.java)
            startActivity(intent)
        }
    }
}