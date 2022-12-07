package com.example.furniture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.furniture.adapter.FernatureAdaptor
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
    }
}