package com.example.mylesson.dialogs

import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.DialogMainBinding

class DialogMain :AppCompatActivity() {

    private lateinit var binding:DialogMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dialogBtn.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
                .setTitle("Are you sure")
                .setIcon(R.drawable.ic_error_)
                .setMessage("Bu ma'lumotlar qayta tiklanmaydi")
                .setPositiveButtonIcon(getDrawable(R.drawable.ic_error_))
                .setPositiveButton("Ok",object :DialogInterface.OnClickListener{
                    override fun onClick(p0: DialogInterface?, p1: Int) {
                        Toast.makeText(this@DialogMain,"Ok button clicked",Toast.LENGTH_SHORT).show()
                    }
                })
                .setNegativeButton("Cancel",object :DialogInterface.OnClickListener{
                    override fun onClick(p0: DialogInterface?, p1: Int) {
                        Toast.makeText(this@DialogMain,"Cancel button clicked",Toast.LENGTH_SHORT).show()
                    }
                })
                .create()

            dialog.show()
        }
    }
}