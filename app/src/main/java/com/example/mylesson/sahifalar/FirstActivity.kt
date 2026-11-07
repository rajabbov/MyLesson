package com.example.mylesson.sahifalar

import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mylesson.R
import com.example.mylesson.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    private val Tag = "first_activity"
    private lateinit var binding:ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.secondActivityBtn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
           startActivityForResult(intent,77)
        }
        Log.d(TAG, "onCreate: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==77 && resultCode==Activity.RESULT_OK){
            val age = data?.getStringExtra("age")
            binding.resultTv.text = age
        }
    }
}