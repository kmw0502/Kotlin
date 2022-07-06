package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if(value == 0) {

            findViewById<TextView>(R.id.tv_content)
                .text = "ssss"
        } else {


            findViewById<TextView>(R.id.tv_content)
                .text = "zzzz"
        }
    }
}
