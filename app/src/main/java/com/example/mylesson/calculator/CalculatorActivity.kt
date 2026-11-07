package com.example.mylesson.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.databinding.ActivityCalculatorBinding

class CalculatorActivity :AppCompatActivity() {
    private lateinit var binding:ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.plusBtn.setOnClickListener {
            val firstNumber = binding.firstNumberEt.text.toString().toInt()
            val secondNumber = binding.secondNumberEt.text.toString().toInt()
            binding.resultTv.text = "${firstNumber+secondNumber}"
        }

        binding.minusBtn.setOnClickListener {
            val firstNumber = binding.firstNumberEt.text.toString().toInt()
            val secondNumber = binding.secondNumberEt.text.toString().toInt()
            binding.resultTv.text = "${firstNumber-secondNumber}"
        }

        binding.multiplyBtn.setOnClickListener {
            val firstNumber = binding.firstNumberEt.text.toString().toInt()
            val secondNumber = binding.secondNumberEt.text.toString().toInt()
            binding.resultTv.text = "${firstNumber*secondNumber}"
        }

        binding.devideBtn.setOnClickListener {
            val firstNumber = binding.firstNumberEt.text.toString().toDouble()
            val secondNumber = binding.secondNumberEt.text.toString().toInt()
            binding.resultTv.text = "${firstNumber/secondNumber}"
        }
    }
}