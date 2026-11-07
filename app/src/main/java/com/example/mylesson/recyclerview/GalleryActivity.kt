package com.example.mylesson.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.mylesson.R
import com.example.mylesson.databinding.RecyclerViewActivityBinding

class GalleryActivity :AppCompatActivity() {

    private lateinit var binding:RecyclerViewActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RecyclerViewActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = listOf<Int>(
            R.drawable.uzum,
            R.drawable.orik,
            R.drawable.apple,
            R.drawable.banan,
            R.drawable.shaftoli,
            R.drawable.banan,
            R.drawable.uzum,
            R.drawable.uzum,
            R.drawable.orik,
            R.drawable.apple,
            R.drawable.banan,
            R.drawable.shaftoli,
            R.drawable.banan,
            R.drawable.uzum,
        )


        val galleryAdapter = GalleryAdapter(list)
        val myManager = StaggeredGridLayoutManager(3,LinearLayoutManager.VERTICAL)

        binding.recyclerView.apply {
            adapter = galleryAdapter
            layoutManager = myManager
        }

        galleryAdapter.setListener(object :RecyclerViewListener{
            override fun onItemClick(position: Int) {
                Intent(this@GalleryActivity,ImageViewActivity::class.java).apply {
                    putExtra("image",list[position])
                    startActivity(this)
                }
            }
        })

    }
}