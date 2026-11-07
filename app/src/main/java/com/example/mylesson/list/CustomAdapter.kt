package com.example.mylesson.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.mylesson.R
import com.example.mylesson.databinding.FruitListItemLayoutBinding

class CustomAdapter(context: Context,val fruitList:ArrayList<FruitModel>) :
    ArrayAdapter<FruitModel>(context, R.layout.fruit_list_item_layout,fruitList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: FruitListItemLayoutBinding = if (convertView == null){
            FruitListItemLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        }else{
            FruitListItemLayoutBinding.bind(convertView)
        }

        binding.fruitNameTv.text = fruitList[position].name
        binding.fruitImage.setImageResource(fruitList[position].image)

        return binding.root
    }
}