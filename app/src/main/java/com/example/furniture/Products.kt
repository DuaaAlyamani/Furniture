package com.example.furniture
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.furniture.adapter.FernatureAdaptor
import com.example.furniture.data.DataSource
import com.example.furniture.databinding.FragmentProductsBinding

class Products : Fragment() {
    private var _binding: FragmentProductsBinding? = null
    private var isLinearLayoutManager = true

    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate Called")


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentProductsBinding.inflate(inflater, container, false)
        val view = binding.root
        Log.d(TAG, "onCreateView Called")
        return view

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerview
        recyclerView.layoutManager = LinearLayoutManager(context)
        val datset = DataSource().loadfurniture()
        recyclerView.adapter = FernatureAdaptor(this.requireContext(), datset)
        Log.d(TAG, "onViewCreated")


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.d(TAG, "onDestroyView")

    }

}
