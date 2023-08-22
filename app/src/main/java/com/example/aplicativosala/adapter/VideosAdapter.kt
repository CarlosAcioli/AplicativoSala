package com.example.aplicativosala.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VideosAdapter (private val context: Context,
                     private val dataset: List<String>) : RecyclerView.Adapter<VideosAdapter.VideosHolderAdapter>() {

    class VideosHolderAdapter(private val view: View) : RecyclerView.ViewHolder(view) {

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideosAdapter.VideosHolderAdapter {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: VideosAdapter.VideosHolderAdapter, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}