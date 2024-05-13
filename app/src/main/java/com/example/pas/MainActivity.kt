package com.example.pas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btn= findViewById<Button>(R.id.button2)
        btn.setOnClickListener{
           val intent = Intent(this, shdata::class.java)
            intent.putExtra("INT_Value",745)
            startActivity(intent)
        }
    }
}