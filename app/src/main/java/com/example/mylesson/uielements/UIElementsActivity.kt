package com.example.mylesson.uielements

import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import com.example.mylesson.R
import com.google.android.material.slider.RangeSlider
import com.google.android.material.slider.Slider

class UIElementsActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elements)

        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
            Toast.makeText(this,"CheckBox checked",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"CheckBox unchecked",Toast.LENGTH_SHORT).show()
        }

        val switcher = findViewById<SwitchCompat>(R.id.switcher)
        switcher.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this,"Switcher checked",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"Switcher unchecked",Toast.LENGTH_SHORT).show()
        }

        val toggleBtn = findViewById<ToggleButton>(R.id.toggleBtn)
        toggleBtn.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this,"Toggle button checked",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"Toggle button unchecked",Toast.LENGTH_SHORT).show()
        }

        val slider = findViewById<Slider>(R.id.slider)
        slider.addOnChangeListener { _, value, _ ->
            Toast.makeText(this,"Slider value changed$value",Toast.LENGTH_SHORT).show()
        }

        val rangeSlider = findViewById<RangeSlider>(R.id.rangeSlider)
        rangeSlider.addOnChangeListener { s, value, fromUser ->
            Toast.makeText(this,"Slider value changed from ${s.values[0]} to ${s.values[1]}",Toast.LENGTH_SHORT).show()
        }

    }
}