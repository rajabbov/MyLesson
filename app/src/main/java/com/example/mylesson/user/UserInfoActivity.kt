package com.example.mylesson.user

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.UserInfoActivityBinding

class UserInfoActivity :AppCompatActivity() {

    private lateinit var binding:UserInfoActivityBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UserInfoActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("db", MODE_PRIVATE)
        binding.nameTv.text = sharedPreferences.getString("name","")
        binding.surnameTv.text = sharedPreferences.getString("surname","")
        binding.ageTv.text = sharedPreferences.getString("age","")

        binding.clearBtn.setOnClickListener {
            sharedPreferences.edit().clear().apply()
            finish()
        }
    }
}