package com.example.mylesson.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.SpinnerActivityBinding

class SpinnerActivity :AppCompatActivity() {

    private lateinit var binding:SpinnerActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SpinnerActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = arrayListOf<String>("Namangan","Toshkent","Farg'ona","Andijon")
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list)
        binding.spinner.adapter = adapter

        binding.spinner.onItemSelectedListener = object :OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val name = binding.spinner.getItemAtPosition(p2).toString()
                Toast.makeText(this@SpinnerActivity,name,Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }
}