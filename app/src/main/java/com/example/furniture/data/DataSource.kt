package com.example.furniture.data

import com.example.furniture.R
import com.example.furniture.moudel.furniture

class DataSource {


    fun loadfurniture(): List<furniture>
    {
        return listOf(
        furniture(R.string.furnature1),
        furniture(R.string.furnature2),
        furniture(R.string.furnature3),
        furniture(R.string.furnature4),
        furniture(R.string.furnature5)

            )
    }


}