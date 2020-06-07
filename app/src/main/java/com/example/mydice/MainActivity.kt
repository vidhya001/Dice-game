package com.example.mydice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       btnRoll.setOnClickListener {
           Toast.makeText(this, "Here we go",
               Toast.LENGTH_SHORT).show()

            val randomInt = (1..6).random()

            val resultText: TextView = findViewById(R.id.result)
            resultText.text = randomInt.toString()
       }



    }
}
