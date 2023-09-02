package com.example.aplicativosala.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.example.aplicativosala.R
import com.example.aplicativosala.model.IntroItem

class IntroAdapter(
    private val context: Context,
    private val dataset: List<IntroItem>
) : RecyclerView.Adapter<IntroAdapter.IntroItemViewHolder>() {

    class IntroItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.educationImage)
        val titleView: TextView = view.findViewById(R.id.titleIntro)
        val descriptionView: TextView = view.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroItemViewHolder {
        val layout =
            LayoutInflater.from(parent.context).inflate(R.layout.intro_item, parent, false)

        return IntroItemViewHolder(layout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: IntroItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.imageView.setImageResource(item.imageEducation)
        holder.titleView.text = context.resources.getString(item.title)
        holder.descriptionView.text = context.resources.getString(item.description)

    }


}