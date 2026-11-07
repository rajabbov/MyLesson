package com.example.mylesson.shared

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.ActivitySharedBinding

class SharedActivity :AppCompatActivity() {

    private lateinit var binding:ActivitySharedBinding
    private lateinit var sharedPreferences:SharedPreferences
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedBinding.inflate(layoutInflater)
         sharedPreferences = getPreferences(MODE_PRIVATE)
        counter = sharedPreferences.getInt("count",0)
        setContentView(binding.root )
        binding.counterTv.text = counter.toString()
        binding.incrementBtn.setOnClickListener {
            counter++
            binding.counterTv.text = counter.toString()

        }
    }

    override fun onStop() {
        super.onStop()
        sharedPreferences.edit().putInt("count",counter).apply()
    }
}