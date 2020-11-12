package com.example.ca1_20091.landing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.ca1_20091.R
import com.example.ca1_20091.databinding.FragmentLandingBinding


class LandingFragment : Fragment() {

    private var teaType = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentLandingBinding>(inflater,
            R.layout.fragment_landing,container,false)

        binding.lapsang.setOnClickListener{
                view : View ->
            view.findNavController().navigate(R.id.action_landingFragment2_to_productFragment2)}

        binding.assam.setOnClickListener{view : View ->
            view.findNavController().navigate(R.id.action_landingFragment2_to_productFragment3)}

        binding.darjelling.setOnClickListener{view : View ->
            view.findNavController().navigate(R.id.action_landingFragment2_to_productFragment4)}

        binding.irishBreakfast.setOnClickListener{view : View ->
            view.findNavController().navigate(R.id.action_landingFragment2_to_productFragment5)}

        binding.earlGrey.setOnClickListener{view : View ->
            view.findNavController().navigate(R.id.action_landingFragment2_to_productFragment22)}

        return binding.root
    }

}