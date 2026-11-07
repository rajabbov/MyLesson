package com.example.mylesson.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.FragmentActivityBinding

class FragmentActivity :AppCompatActivity() {

    private lateinit var binding:FragmentActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showFirstFragment.setOnClickListener {
            supportFragmentManager.apply {
                beginTransaction().replace(R.id.containerView,FirstFragment()).addToBackStack(null).commit()
            }
        }

        binding.showSecondFragmentBtn.setOnClickListener {
            supportFragmentManager.apply {
                beginTransaction().replace(R.id.containerView,SecondFragment()).addToBackStack(null).commit()
            }
        }
    }
}