package com.example.furniture.data

import com.example.furniture.R
import com.example.furniture.moudel.furniture

class DataSource {


    fun loadfurniture(): List<furniture>
    {
        return listOf(
        furniture(R.string.furnature1,R.string.peice1 ,R.drawable.newport_sofa,R.string.des1),
        furniture(R.string.furnature2, R.string.peice2 ,R.drawable.coffe_table,R.string.des2),
        furniture(R.string.furnature3, R.string.peice3 ,R.drawable.parker_bed,R.string.des3),
        furniture(R.string.furnature4,R.string.peice4 ,R.drawable.storage_media,R.string.des4),
        furniture(R.string.furnature5,R.string.peice5,R.drawable.shelf_desk,R.string.des5)

            )
    }


}