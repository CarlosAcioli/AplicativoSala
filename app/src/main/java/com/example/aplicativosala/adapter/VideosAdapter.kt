package com.example.aplicativosala.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicativosala.R
import com.example.aplicativosala.model.Informations

class VideosAdapter (private val context: Context,
                     private val dataset: List<Informations>) : RecyclerView.Adapter<VideosAdapter.VideosHolderAdapter>() {

    class VideosHolderAdapter(private val view: View) : RecyclerView.ViewHolder(view) {
        val profileImageView: ImageView = view.findViewById(R.id.image_profile)
        val titleTextView: TextView = view.findViewById(R.id.titleText)
        val themeTextView: TextView = view.findViewById(R.id.themeText)
        val studentsTextView: TextView = view.findViewById(R.id.students)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideosHolderAdapter {

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return VideosHolderAdapter(adapterLayout)
    }

    override fun onBindViewHolder(holder: VideosHolderAdapter, position: Int) {

        val item = dataset[position]

        holder.profileImageView.setImageResource(item.imageProfile)
        holder.titleTextView.text = context.resources.getString(item.titleName)
        holder.themeTextView.text = context.resources.getString(item.themeName)
        holder.studentsTextView.text = context.resources.getString(item.studentsName)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}