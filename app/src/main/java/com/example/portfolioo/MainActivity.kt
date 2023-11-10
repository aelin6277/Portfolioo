package com.example.portfolioo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var buttonItProjects : Button
    lateinit var buttonProfile : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonItProjects = findViewById(R.id.buttonItProjects)
        buttonProfile = findViewById<Button>(R.id.buttonProfile)

        buttonProfile.setOnClickListener {
            handleButtonProfilePress()
        }
        buttonItProjects.setOnClickListener {
            handleButtonItProjectsPress()
        }

    }

    fun handleButtonProfilePress(){
        val intent = Intent(this, ProfileActivity::class.java)

        startActivity(intent)
    }

   fun handleButtonItProjectsPress() {
       val intent = Intent(this, ProjectActivity::class.java)
       startActivity(intent)
   }
}