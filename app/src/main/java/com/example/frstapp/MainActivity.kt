package com.example.frstapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edit:EditText = findViewById(R.id.edt)
        val mainText:TextView = findViewById(R.id.txt)
        val btn:Button = findViewById(R.id.btn)

        btn.setOnClickListener {
            //logic
            val editInfo = edit.text.toString()
            Log.i("tag",editInfo)
            mainText.text = editInfo
        }


        }
    }
