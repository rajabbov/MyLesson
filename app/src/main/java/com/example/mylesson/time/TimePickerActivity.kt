package com.example.mylesson.time

import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.TimePickerActivityBinding

class TimePickerActivity : AppCompatActivity() {

    private lateinit var binding: TimePickerActivityBinding
    private var selectedHour = 0
    private var selectedMinute = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TimePickerActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calendar = Calendar.getInstance()
        selectedHour = calendar.get(Calendar.HOUR)
        selectedMinute = calendar.get(Calendar.MINUTE)

        binding.showTimePickerBtn.setOnClickListener {

            val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { _, hour, minute ->
                    selectedHour = hour
                    selectedMinute = minute
                    binding.selectedTimeTv.text = "$selectedHour:$selectedMinute"
                },
                selectedHour,
                selectedMinute,
                true
            )

          timePickerDialog.show()
        }
    }
}