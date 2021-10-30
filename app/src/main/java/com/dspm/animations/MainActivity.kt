package com.dspm.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dspm.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.host_fragment, FirstAnimationFragment())
            .commit()
    }
}