package com.example.mylesson.animation

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.ActivityAnimationBinding

class AnimationActivity :AppCompatActivity() {

    private lateinit var binding:ActivityAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alphaBtn.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this,R.anim.alpha_anim)
            binding.imageView2.startAnimation(animation)
        }

        binding.rotateBtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this,R.anim.rotate_anim)
            binding.imageView2.startAnimation(animation)
        }

        binding.translateBtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this,R.anim.translate_anim)
            binding.imageView2.startAnimation(animation)
        }

        binding.scaleBtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this,R.anim.scale_anim)
            binding.imageView2.startAnimation(animation)
        }

        binding.combinationBtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this,R.anim.combination_anim)
            binding.imageView2.startAnimation(animation)
        }
    }
}