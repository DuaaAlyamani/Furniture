package com.example.furniture.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.furniture.R
import com.example.furniture.moudel.furniture

class FernatureAdaptor(
    private val context: Context,
    private val dataset: List<furniture>
) : RecyclerView.Adapter<FernatureAdaptor.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.item_furniture, parent, false)
        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.furnitureTitle.text = context.resources.getString(item.name)
    }

    override fun getItemCount() = dataset.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val furnitureTitle: TextView = view.findViewById(R.id.item_furnature_name)

    }
}// End of FernatureAdaptor