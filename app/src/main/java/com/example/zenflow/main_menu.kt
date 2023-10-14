package com.example.zenflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class main_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val blocklist: RecyclerView =findViewById(R.id.Main_Menu_BlockList)
        val blocks = arrayListOf<Block>()

        blocks.add(Block("qwe", "qwe"))
        blocks.add(Block("qwe", "qwe"))
        blocks.add(Block("qwe", "qwe"))

        blocklist.layoutManager = LinearLayoutManager(this)
        blocklist.adapter = BlockAdapter(blocks,this)
    }
}