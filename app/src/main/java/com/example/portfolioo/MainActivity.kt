package com.example.portfolioo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonProfile : Button
    lateinit var buttonItProjects : Button
    lateinit var buttonOtherInfo : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonProfile = findViewById<Button>(R.id.buttonProfile)
        buttonItProjects = findViewById(R.id.buttonItProjects)
        buttonOtherInfo = findViewById(R.id.buttonOtherInfo)

        buttonProfile.setOnClickListener {
            handleButtonProfilePress()
        }
        buttonItProjects.setOnClickListener {
            handleButtonItProjectsPress()
        }
        buttonOtherInfo.setOnClickListener {
            handleButtonOtherInfo()
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
    fun handleButtonOtherInfo() {
        val intent = Intent(this, OtherInfoActivity::class.java)
        startActivity(intent)
    }
}
