package com.example.furniture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.furniture.adapterFe.FernatureAdaptor
import com.example.furniture.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val datset = DataSource().loadfurniture()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        val adapter = FernatureAdaptor(this, datset)

        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize(true)

/*


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
        */

    }

}
