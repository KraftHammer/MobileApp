package com.example.zenflow

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GuideAdapter (var guide_items: List<Guide>, val context: Context) : RecyclerView.Adapter<GuideAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val title: TextView = view.findViewById(R.id.guideView_title)
        val desc: TextView = view.findViewById(R.id.guideView_desc)
        val btn: Button = view.findViewById(R.id.guideView_btn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuideAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.guide_view, parent, false)
        return GuideAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return guide_items.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = guide_items[position].gudieTtitle
        holder.desc.text = guide_items[position].guideDesc

        holder.btn.setOnClickListener {
            val intent = Intent(context, guide_guide::class.java)

            intent.putExtra("guide_guide_Title", guide_items[position].gudieTtitle)
            intent.putExtra("guide_guide_Text", guide_items[position].guideText)


            context.startActivity(intent)
        }
    }
}