package com.example.mylesson.listadapter

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mylesson.R
import com.example.mylesson.databinding.MainActivityListBinding

class MainActivity :AppCompatActivity() {

    private lateinit var binding:MainActivityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listAdapter = MyListAdapter()

        binding.swipeRefresh.setOnRefreshListener {
            Handler().postDelayed({
                listAdapter.submitList(getTitleList())
                binding.swipeRefresh.isRefreshing = false
            },5000)

        }

        binding.swipeRefresh.setColorSchemeColors(
            Color.BLACK,
            Color.BLUE,
            Color.GRAY,
            Color.RED
        )

        binding.recyclerListView.apply {
            adapter = listAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        listAdapter.submitList(getTitleList())
    }

    private fun getTitleList():List<String>{
        val list = mutableListOf<String>()
        for (i in 1..100){
            list.add("Title $i")
        }
        return list
    }
}