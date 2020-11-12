package com.example.ca1_20091.landing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.ca1_20091.R
import com.example.ca1_20091.databinding.FragmentLandingBinding


class LandingFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentLandingBinding>(inflater,
            R.layout.fragment_landing,container,false)

        return binding.root
    }

}