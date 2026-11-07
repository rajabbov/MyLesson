package com.example.mylesson.listadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mylesson.databinding.ListItemLayoutBinding

private class MyDiffUtils:DiffUtil.ItemCallback<String>(){
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem===newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem==newItem
    }

}

class MyListAdapter():ListAdapter<String,MyListAdapter.MyViewHolder>(MyDiffUtils()) {

    inner class MyViewHolder(val binding:ListItemLayoutBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(title: String) {
           binding.titleTv.text = title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}