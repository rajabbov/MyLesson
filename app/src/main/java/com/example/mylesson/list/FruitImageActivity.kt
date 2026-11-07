package com.example.mylesson.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.mylesson.R
import com.example.mylesson.databinding.FruitImageActivityBinding

class FruitImageActivity : AppCompatActivity() {

    private lateinit var binding:FruitImageActivityBinding
    private val fruits = arrayListOf<String>("Olma","Banan","O'rik","Uzum","Shaftoli")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FruitImageActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val position = intent.getIntExtra("position",0)

        supportActionBar?.title = fruits[position]

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        when(position){
            0-> binding.fruitImage.setImageResource(R.drawable.apple)
            1-> binding.fruitImage.setImageResource(R.drawable.banan)
            2-> binding.fruitImage.setImageResource(R.drawable.orik)
            3-> binding.fruitImage.setImageResource(R.drawable.uzum)
            4-> binding.fruitImage.setImageResource(R.drawable.shaftoli)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       if (item.itemId == android.R.id.home){
           finish()
       }
        return super.onOptionsItemSelected(item)
    }
}