package com.example.portfolioo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var button2 : Button
    lateinit var buttonProfile : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonProfile = findViewById<Button>(R.id.buttonProfile)

        buttonProfile.setOnClickListener {
            handleButton4Press()
        }
    }

    fun handleButton4Press(){
        val intent = Intent(this, ProfileActivity::class.java)

        startActivity(intent)
    }
}