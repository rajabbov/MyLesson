package com.example.mylesson.customdialog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.R
import com.example.mylesson.databinding.CustomDialogViewBinding
import com.example.mylesson.databinding.DialogCustomMainBinding

class DialogCustomMain :AppCompatActivity() {

    private lateinit var binding:DialogCustomMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogCustomMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dialogCustom.setOnClickListener {
            val dialogViewBinding = CustomDialogViewBinding.inflate(layoutInflater,null,false)
            val dialog = AlertDialog.Builder(this)
                .setView(dialogViewBinding.root)
                .setPositiveButton("Sing in"){_,_ ->
                    Log.d(
                        "dialog",
                        ":${dialogViewBinding.dialogEtName.text} ${dialogViewBinding.dialogEtEmail.text} "
                    )
                }
                .setNegativeButton("Cencel"){_,_ -> }
                .create()
            dialog.show()
        }
    }
}