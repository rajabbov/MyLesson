package com.example.mylesson.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylesson.R
import com.example.mylesson.databinding.ActivityImageViewBinding

class ImageViewActivity : AppCompatActivity() {

    private lateinit var binding:ActivityImageViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intent.getIntExtra("image",R.drawable.banan)

        binding.imageView4.setImageResource(imageId)

    }
}