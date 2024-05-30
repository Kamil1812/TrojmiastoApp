package com.example.trojmiastoapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textViewGdynia = findViewById<TextView>(R.id.textViewGdynia)
        var textViewSopot = findViewById<TextView>(R.id.textViewSopot)
        var textViewGdansk = findViewById<TextView>(R.id.textViewGdansk)

        textViewGdynia.setOnClickListener {
            val intent = Intent(this, GdyniaActivity::class.java)
            startActivity(intent)
        }

        textViewSopot.setOnClickListener {
            val intent = Intent(this, SopotActivity::class.java)
            startActivity(intent)
        }

        textViewGdansk.setOnClickListener {
            val intent = Intent(this, GdanskActivity::class.java)
            startActivity(intent)
        }
    }
}