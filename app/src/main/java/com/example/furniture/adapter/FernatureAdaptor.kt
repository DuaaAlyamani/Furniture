package com.example.furniture.adapterFe

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.furniture.DetaliedActivity
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
        holder.furnitureName.text = context.resources.getString(item.name)
        holder.furniturePrice.text = context.resources.getString(item.price)
        holder.furnitureDescration.text=context.resources.getString(item.descition)
       holder.furnitureImage.setImageResource(item.imag)
        holder.card.setOnClickListener {
           // Toast.makeText(context,context.resources.getString(item.name), Toast.LENGTH_SHORT).show()
            val context = holder.itemView.context
            val intent = Intent(context, DetaliedActivity::class.java)
            intent.putExtra("FurnatureName",  holder.furnitureName.text.toString())
            intent.putExtra("FurnPric", holder.furniturePrice.text.toString())
            intent.putExtra("FurImage", item.imag)
            intent.putExtra("Decription",  holder.furnitureDescration.text.toString())
            context.startActivity(intent)


        }

    }





    override fun getItemCount() = dataset.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val furnitureName: TextView = view.findViewById(R.id.tv_name)
        val furniturePrice: TextView = view.findViewById(R.id.tv_price)
        val furnitureImage: ImageView = view.findViewById(R.id.photo_image_view)
        val furnitureDescration: TextView = view.findViewById(R.id.detali)
         val card: CardView = view.findViewById(R.id.cardView)


    }
}// End of FernatureAdaptor