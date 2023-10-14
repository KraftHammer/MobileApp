package com.example.zenflow

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlockAdapter(var blocks: List<Block>, var context: Context) : RecyclerView.Adapter<BlockAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.Block_imageView)
        val title: TextView = view.findViewById(R.id.Block_textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context). inflate(R.layout.block_in_menu, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: BlockAdapter.MyViewHolder, position: Int) {
        holder.title.text = blocks[position].Title
    }

    override fun getItemCount(): Int {
        return blocks.count()
    }
}