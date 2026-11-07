package com.example.mylesson.dialoglist



import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.mylesson.databinding.DialogListBinding

class DialogList :AppCompatActivity() {

    private lateinit var binding:DialogListBinding
    private var checkedItemPosition = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dialogShowBtn.setOnClickListener {
          val list = arrayOf<String>("Birinchi","Ikkinchi","Uchinchi")
          val dialogs = AlertDialog.Builder(this)
              .setTitle("Choose one")
              .setCancelable(false)
              .setSingleChoiceItems(
                  list,checkedItemPosition
              ){_,position ->
                  checkedItemPosition = position
              }
              .setPositiveButton("Ok"){_,_->}
              .setNegativeButton("Cancel"){_,_->}
              .create()

            dialogs.show()
        }
    }
}