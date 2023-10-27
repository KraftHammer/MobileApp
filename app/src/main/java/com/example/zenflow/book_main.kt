package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class book_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_main)

        val itemsList : RecyclerView = findViewById(R.id.meditation_RecycleView)
        val item123 = arrayListOf<Book>()
        val back:ImageView = findViewById(R.id.meditation_back)

        item123.add(Book("qweqweqwe", "Что такое Ёга?", "Предлагаем вниманию читателя научно-популярный труд Йога Рамачараки, посвященный учению индийских йогов. Эта книга для тех кто ищет реальное Знание о реальном Мире. Рамачарака отвечает на самые сложные вопросы реинакрнации и развития Души.", "https://sharlib.com/read_10961-1"))
        item123.add(Book("logo.png", "title", "title", "title"))
        item123.add(Book("lotus.xml", "title", "title", "title"))
        item123.add(Book("setting_foto", "title", "title", "title"))
        item123.add(Book("qweqweqwe", "title", "title", "title"))
        item123.add(Book("qweqweqwe", "title", "title", "title"))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = BookAdapter(item123, this)

        back.setOnClickListener {
            val intent = Intent(this, main_menu::class.java)
            startActivity(intent)
        }
    }
}