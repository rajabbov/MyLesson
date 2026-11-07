package com.example.mylesson.registration

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.mylesson.R

class RegistrationActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val userImage = findViewById<ImageView>(R.id.userImage)
        Glide
            .with(this)
            .load("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.greenbot.com%2Fwp-content%2Fuploads%2F2021%2F12%2Fandroid.png&tbnid=Vjz6Ic8WCbZrvM&vet=12ahUKEwiF5YaNoZKFAxWhQFUIHUKXDB4QMygSegQIARB3..i&imgrefurl=https%3A%2F%2Fwww.greenbot.com%2Ftop-android-stories-week-5-2022%2F&docid=Vsb7KWkEuGZ9jM&w=1920&h=1080&q=android%20image&ved=2ahUKEwiF5YaNoZKFAxWhQFUIHUKXDB4QMygSegQIARB3")
            .centerCrop()
            .placeholder(R.drawable.img)
            .into(userImage)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)

        val nameText = findViewById<TextView>(R.id.nameText)
        val emailText = findViewById<TextView>(R.id.emailText)
        val passwordText = findViewById<TextView>(R.id.passwordText)

        val registerBtn = findViewById<Button>(R.id.registerBtn)

        registerBtn.setOnClickListener {

            nameText.text = "Name: ${nameEditText.text}"
            emailText.text = "Email: ${emailEditText.text}"
            passwordText.text = "Password: ${passwordEditText.text}"
        }
    }
}