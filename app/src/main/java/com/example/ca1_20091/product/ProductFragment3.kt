package com.example.ca1_20091.product

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.ca1_20091.R
import com.example.ca1_20091.databinding.FragmentLandingBinding
import com.example.ca1_20091.databinding.FragmentProduct3Binding


class ProductFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentProduct3Binding>(inflater,
            R.layout.fragment_product3,container,false)
        return binding.root
    }

}