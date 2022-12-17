
    package com.example.furniture

    import android.annotation.SuppressLint
    import android.content.ContentValues.TAG
    import android.content.Intent
    import android.os.Bundle
    import android.util.Log
    import android.view.*
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.fragment.app.Fragment
    import com.example.furniture.databinding.FragmentProductDetailBinding

    class ProductDetail : Fragment() {

        private var _binding: FragmentProductDetailBinding? = null
        private val binding get() = _binding!!
        companion object {
            var name = "name"
            var furnatureName = "Name"
            var desc = "desc"
            var furnatureDescrption = "Description"
            var image = "image"
            var imagepath = 0
            var price = "price"
            var furnaturePrice = "price"


        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setHasOptionsMenu(true)
          /*  arguments?.let {
                nameId = it.getString("name").toString()
                priceId = it.getString("price").toString()
                imageId = it.getInt("image")
                descriptionId = it.getString("description").toString()
*/
            setHasOptionsMenu(true)

            Log.d(TAG, "onCreate Called")
            }




        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            Log.d(TAG, "onCreateView Called")

            return inflater.inflate(R.layout.fragment_product_detail, container, false)
        }

        @SuppressLint("ResourceType")
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            arguments?.let {
                furnatureName = it.getString(name).toString()
                furnatureDescrption = it.getString(desc).toString()
                imagepath = it.getInt(image)
                furnaturePrice= it.getString(price).toString()


            }
            var furnature_name: TextView = view.findViewById(R.id.tv_nameDetaile)
            var furnature_Price: TextView = view.findViewById(R.id.tv_priceDetailed)
            var furnature_Description: TextView = view.findViewById(R.id.detaile)
            var furnatur_image: ImageView = view.findViewById(R.id.imageViewDetailed)

            furnature_name.text = furnatureName
            furnature_Description.text = furnatureDescrption
            furnatur_image.setImageResource(imagepath)
            furnature_Price.text = furnaturePrice
            Log.d(TAG, "onViewCreatedD Called")


        }
        override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
            inflater.inflate(R.menu.main_menu, menu)
            Log.d(TAG, "onCreateOptionsMenuD Called")

        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            Log.d(TAG, "onOptionsItemSelectedD Called")

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