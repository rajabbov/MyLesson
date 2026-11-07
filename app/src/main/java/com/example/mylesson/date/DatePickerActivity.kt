package com.example.mylesson.date

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.DatePickerLayoutBinding

class DatePickerActivity : AppCompatActivity() {

    private lateinit var binding: DatePickerLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DatePickerLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.showDatePickerBtn.setOnClickListener {

            val calendar = Calendar.getInstance()
            val datePickerDialog = DatePickerDialog(
                this,
                0,
                DatePickerDialog.OnDateSetListener { _, year, month, day ->
             binding.selectedDateTv.text = "$day/${month+1}/$year" //<-index 0 dan boshlangani uchun 1 ni qo'shib qo'yamiz
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )
         //   calendar.set(Calendar.DAY_OF_MONTH,10)
         //   datePickerDialog.datePicker.maxDate = calendar.timeInMillis
         //   calendar.set(Calendar.DAY_OF_MONTH,4)
         //   datePickerDialog.datePicker.minDate = calendar.timeInMillis

            datePickerDialog.show()
            datePickerDialog.getButton(DatePickerDialog.BUTTON_POSITIVE).text = "Tanla"
        }
    }
}