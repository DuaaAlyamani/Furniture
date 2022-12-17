package com.example.furniture.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.furniture.ProductsDirections
import com.example.furniture.R
import com.example.furniture.moudel.furniture


class FernatureAdaptor(

    private val context: Context, private val dataset: List<furniture>) :
    RecyclerView.Adapter<FernatureAdaptor.FurnatureViewHolder>() {
    class FurnatureViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById(R.id.tv_name)
        val imageView: ImageView = view.findViewById(R.id.photo_image_view)
        val price: TextView = view.findViewById(R.id.tv_price)
        val textdescrption: TextView =view.findViewById(R.id.detali)
        val card: CardView = view.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FurnatureViewHolder {
        val itemLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.item_furniture, parent, false)
        return FurnatureViewHolder(itemLayout)

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: FurnatureViewHolder, position: Int){
    val item = dataset[position]
        holder.name.text = context.resources.getString(item.name)
        holder.price.text = context.resources.getString(item.price)
        holder.textdescrption.text= context.resources.getString(item.descition)
       holder.imageView.setImageResource(item.imag)
        holder.card.setOnClickListener {
           // Toast.makeText(context,context.resources.getString(item.name), Toast.LENGTH_SHORT).show()

            val action = ProductsDirections.actionProductsToProductDetail(holder.name.text.toString(),holder.price.text.toString(),item.imag,holder.textdescrption.text.toString())

              holder.view.findNavController().navigate(action)
            }




    }





    override fun getItemCount() = dataset.size

   /* class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val furnitureName: TextView = view.findViewById(R.id.tv_name)
        val furniturePrice: TextView = view.findViewById(R.id.tv_price)
        val furnitureImage: ImageView = view.findViewById(R.id.photo_image_view)
       // val furnitureDescration: TextView = view.findViewById(R.id.detali)
         val card: CardView = view.findViewById(R.id.cardView)*/


    }

