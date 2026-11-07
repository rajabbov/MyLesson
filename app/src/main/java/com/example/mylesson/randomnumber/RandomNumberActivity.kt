package com.example.mylesson.randomnumber

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.databinding.ActivityRandomBinding
import kotlin.random.Random

class RandomNumberActivity :AppCompatActivity() {
    private lateinit var binding:ActivityRandomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.generateBtn.setOnClickListener {
           val from = binding.sliderBtn.values[0]
            val to = binding.sliderBtn.values[1]

            if (binding.checkboxBtn.isChecked){
                val randomNumber = Random.nextInt(from.toInt(),to.toInt())
                binding.resultTv.text = "generated Number : $randomNumber"

            }else{
                val randomNumber = Random.nextDouble(from.toDouble(),to.toDouble())
                binding.resultTv.text = String.format("Generated Number : %.3f",randomNumber)
            }
        }
    }
}