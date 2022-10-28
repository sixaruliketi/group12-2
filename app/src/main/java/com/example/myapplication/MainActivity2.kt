package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        findViewById<TextView>(R.id.backToHomeButton).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        findViewById<TextView>(R.id.doneButton).setOnClickListener {
            Toast.makeText(this, "done!!", Toast.LENGTH_SHORT).show()
        }

    }
}