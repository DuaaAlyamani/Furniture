
    package com.example.furniture

    import android.content.Intent
    import android.os.Bundle
    import android.view.*
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.fragment.app.Fragment
    import com.example.furniture.databinding.FragmentProductDetailBinding
    import kotlin.properties.Delegates

    class ProductDetail : Fragment() {

        private var _binding: FragmentProductDetailBinding? = null
        private val binding get() = _binding!!
        private lateinit var nameId: String
        private lateinit var priceId: String
        private var imageId by Delegates.notNull<Int>()
        private lateinit var descriptionId: String

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setHasOptionsMenu(true)
            arguments?.let {
                nameId = it.getString("name").toString()
                priceId = it.getString("price").toString()
                imageId = it.getInt("image")
                descriptionId = it.getString("description").toString()
            }

        }


        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_product_detail, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

            var name: TextView = binding.tvNameDetaile
            name.text = nameId


            var price: TextView = binding.tvPriceDetailed
            price.text = priceId

            var description:TextView = binding.detaile
            description.text = descriptionId

            var image: ImageView = binding.imageViewDetailed

            image.setImageResource(imageId)

        }
        override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
            inflater.inflate(R.menu.main_menu, menu)
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