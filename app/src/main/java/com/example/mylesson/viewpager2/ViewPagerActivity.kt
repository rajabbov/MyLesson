package com.example.mylesson.viewpager2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.PageTransformer
import com.example.mylesson.R
import com.example.mylesson.databinding.ViewPagerActivityBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.math.abs
import kotlin.math.max
import kotlin.random.Random

class ViewPagerActivity :AppCompatActivity() {

    private lateinit var binding:ViewPagerActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ViewPagerActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

          val date = listOf<CustomDateModel>(
              CustomDateModel(R.drawable.baseline_home_24,R.drawable.apple,"Olma"),
              CustomDateModel(R.drawable.baseline_format_list_bulleted_24,R.drawable.orik,"O'rik"),
              CustomDateModel(R.drawable.baseline_filter_list_24,R.drawable.shaftoli,"Shaftoli"),
              CustomDateModel(R.drawable.baseline_attach_file_24,R.drawable.banan,"Banan"),

          )

        val customViewPagerAdapter = CustomViewPagerAdapter(this,date.map { it.image })
        binding.myViewPager.adapter = customViewPagerAdapter

        TabLayoutMediator(binding.tabLayout,binding.myViewPager){tab,position->
            tab.text = date[position].title
            tab.setIcon(date[position].icon)
            val badge = tab.orCreateBadge
            badge.number = Random.nextInt(10_000)
        }.attach()

        binding.myViewPager.apply {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
        }

        binding.myViewPager.apply {
            setPageTransformer(CompositePageTransformer().apply {
                addTransformer(MarginPageTransformer(40))
                addTransformer(object :ViewPager2.PageTransformer{
                    override fun transformPage(page: View, position: Float) {
                        page.apply {
                            scaleY = 0.85F + 0.15F*(1-(abs(position)))
                        }
                    }
                })
            })
        }
    }
}