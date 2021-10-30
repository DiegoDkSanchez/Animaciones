package com.dspm.animations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dspm.animations.databinding.FragmentSecondAnimationBinding

class SecondAnimationFragment : Fragment() {

    private lateinit var binding: FragmentSecondAnimationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondAnimationBinding.inflate(layoutInflater)
        return binding.root
    }

}