package com.example.homework_1_less_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.Add)
        val next = findViewById<Button>(R.id.Next)
        val number = findViewById<TextView>(R.id.Number)
        var num = 0
        add.setOnClickListener {
            num++
            number.setText(num.toString())
        }
        next.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Number", number.text.toString())
            startActivity(intent)
        }
    }

}
