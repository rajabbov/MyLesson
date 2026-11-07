package com.example.mylesson.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mylesson.databinding.ItemListLayoutBinding

class MyCustomAdapter(val list:List<String>):RecyclerView.Adapter<MyCustomAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding:ItemListLayoutBinding):RecyclerView.ViewHolder(binding.root){
       fun bind(title:String){
           binding.titleTv.text = title
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemListLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val title = list[position]
        holder.bind(title)
    }
}