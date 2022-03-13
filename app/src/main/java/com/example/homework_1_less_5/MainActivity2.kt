package com.example.homework_1_less_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val add = findViewById<Button>(R.id.Add1)
        val back = findViewById<Button>(R.id.Back)
        val number = findViewById<TextView>(R.id.Number1)
        number.text = intent.getStringExtra("Number")
        var num = number.text.toString().toInt()
        add.setOnClickListener {
            num--
            number.setText(num.toString())
        }

        back.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}