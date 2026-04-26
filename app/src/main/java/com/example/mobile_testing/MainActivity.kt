package com.example.mobile_testing

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnClick)
        val textView = findViewById<TextView>(R.id.tvMessage)

        button.setOnClickListener {
            textView.text = "Hello, User!"
        }
    }
}