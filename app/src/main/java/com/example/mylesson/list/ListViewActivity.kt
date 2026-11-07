package com.example.mylesson.list

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.ListViewActivityBinding

class ListViewActivity :AppCompatActivity() {

    private val fruits = arrayListOf<FruitModel>(
        FruitModel("Olma",R.drawable.apple),
        FruitModel("Banan",R.drawable.banan),
        FruitModel("O'rik",R.drawable.orik),
        FruitModel("Uzum",R.drawable.uzum),
        FruitModel("Shaftoli",R.drawable.shaftoli),
    )

    private lateinit var binding:ListViewActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ListViewActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = CustomAdapter(this,fruits)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this,"${fruits[position]} tanlandi",Toast.LENGTH_SHORT).show()
            Intent(this,FruitImageActivity::class.java).apply {
                this.putExtra("position",position)
                startActivity(this)
            }
        }
    }
}