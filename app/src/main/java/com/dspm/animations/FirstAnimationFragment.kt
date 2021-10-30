package com.dspm.animations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dspm.animations.databinding.FragmentFirstAnimationBinding

class FirstAnimationFragment : Fragment() {

    private lateinit var binding: FragmentFirstAnimationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstAnimationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSecondFragment.setOnClickListener {
            activity?.apply {
                this.supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(
                        R.anim.slide_in,
                        R.anim.slide_out,
                        R.anim.slide_in,
                        R.anim.slide_out
                    )
                    .replace(R.id.host_fragment, SecondAnimationFragment())
                    .addToBackStack("animation")
                    .commit()
            }
        }
    }

}