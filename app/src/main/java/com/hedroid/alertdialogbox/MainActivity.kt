package com.hedroid.alertdialogbox

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn_alert)
        btn.setOnClickListener{
             val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete files")
            dialog.setMessage(R.string.has)
            dialog.setIcon(R.drawable.baseline_delete_forever_24)

            dialog.setPositiveButton("YES"){dialogInterface,which ->
                Toast.makeText(this,"Clicked Yes",Toast.LENGTH_SHORT).show()
            }
            dialog.setNegativeButton("NO"){dialogInterface,which ->
                Toast.makeText(this,"Clicked No",Toast.LENGTH_SHORT).show()
            }
            dialog.setNeutralButton("CANCEL"){dialogInterface,which ->
                Toast.makeText(this,"Clicked Cancele",Toast.LENGTH_SHORT).show()
            }

            val alertDialog:AlertDialog = dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

    }
}