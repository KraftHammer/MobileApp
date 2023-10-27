package com.example.zenflow

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class BookAdapter(var items: List<Book>, val context:Context) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookAdapter.ViewHolder, position: Int) {
        holder.title.text = items[position].Title
        holder.teext.text = items[position].Text

        var imageID = context.resources.getIdentifier(
            items[position].Image,
            "drawable",
            context.packageName
        )

        holder.image.setImageResource(imageID)
    }

    override fun getItemCount(): Int {
        return items.count()
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val image:ImageView = view.findViewById(R.id.image_book)
        val title:TextView = view.findViewById(R.id.title_book)
        val teext:TextView = view.findViewById(R.id.text_book)
    }
}