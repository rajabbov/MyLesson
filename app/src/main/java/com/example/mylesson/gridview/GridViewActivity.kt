package com.example.mylesson.gridview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.GridViewActivityBinding

class GridViewActivity :AppCompatActivity() {

    private lateinit var binding:GridViewActivityBinding

    private val imageList = arrayListOf<Int>(
        R.drawable.apple,
        R.drawable.banan,
        R.drawable.orik,
        R.drawable.shaftoli,
        R.drawable.uzum,
        R.drawable.apple,
        R.drawable.banan,
        R.drawable.orik,
        R.drawable.shaftoli,
        R.drawable.uzum,
        R.drawable.apple,
        R.drawable.banan,
        R.drawable.orik,
        R.drawable.shaftoli,
        R.drawable.uzum,
        R.drawable.apple,
        R.drawable.banan,
        R.drawable.orik,
        R.drawable.shaftoli,
        R.drawable.uzum,
        R.drawable.apple,
        R.drawable.banan,
        R.drawable.orik,
        R.drawable.shaftoli,
        R.drawable.uzum,
        R.drawable.apple,
        R.drawable.banan,
        R.drawable.orik,
        R.drawable.shaftoli,
        R.drawable.uzum,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GridViewActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GalleryAdapter(context = this,imageList)

        binding.gridView.adapter = adapter

        binding.gridView.setOnItemClickListener { _, _, position, l ->
            Toast.makeText(this,"$position tanlandi",Toast.LENGTH_SHORT).show()
        }
    }
}