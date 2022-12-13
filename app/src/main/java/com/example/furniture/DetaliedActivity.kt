package com.example.furniture

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetaliedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalied)

        val furnitureImage = findViewById<ImageView>(R.id.imageViewDetailed)
        furnitureImage.setImageResource(intent.extras!!.getInt("FurImage"))

        val furnitureName = findViewById<TextView>(R.id.tv_nameDetaile)
        val data = intent?.extras?.getString("FurnatureName").toString()
        furnitureName.text=data

        val furnitureDecription = findViewById<TextView>(R.id.detaile)
       val datades= intent?.extras?.getString("Decription").toString()
       furnitureDecription.text=datades

       val furniturePrice = findViewById<TextView>(R.id.tv_priceDetailed)
       val datapric= intent?.extras?.getString("FurnPric").toString()
       furniturePrice.text=datapric

    }
     override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.share -> {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "Share this URL")
                    type = "text/plain"
                }
                startActivity(sendIntent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}