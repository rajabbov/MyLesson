package com.example.mylesson.expandable

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.MainActivityBinding
import kotlin.random.Random

class MainActivity :AppCompatActivity() {

    private lateinit var binding:MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val groupList = mutableListOf<String>()
        val chilMap = mutableMapOf<String,List<String>>()
        repeat(5){groupId->
            groupList.add("Group $groupId")
            val childNumber = Random.nextInt(10)
            val tempList = mutableListOf<String>()
            repeat(childNumber){childId->
                tempList.add("Child $childId in Group $groupId")

            }
            chilMap["Group $groupId"] = tempList
        }

        val adapter = CustomAdapter(this,groupList,chilMap)
        binding.expandableListView.setAdapter(adapter)


        binding.expandableListView.setOnChildClickListener { _, _, groupP, childP, _ ->
            val groupName = groupList[groupP]
            val childName = chilMap[groupName]!![childP]
            Toast.makeText(this,childName,Toast.LENGTH_SHORT).show()

            true
        }
    }
}