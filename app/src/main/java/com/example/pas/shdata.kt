package com.example.pas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class shdata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shdata)


        val getint = intent.getIntExtra("INT_Value",0)
        val textView=findViewById<TextView>(R.id.textView)
        textView.text="INT Value: $getint"
    }
}