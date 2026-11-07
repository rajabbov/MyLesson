package com.example.mylesson.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.example.mylesson.R
import com.example.mylesson.databinding.RecyclerViewActivityBinding

class RecyclerViewActivity :AppCompatActivity() {

    private lateinit var binding:RecyclerViewActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RecyclerViewActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = mutableListOf<String>()
        repeat(30){

            list.add("Title $it")
        }
        val customAdapter = MyCustomAdapter(list)

        val myLayoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        binding.recyclerView.apply {
            adapter = customAdapter
            layoutManager = myLayoutManager
            addItemDecoration(DividerItemDecoration(this@RecyclerViewActivity,myLayoutManager.orientation))
        }

    }
}