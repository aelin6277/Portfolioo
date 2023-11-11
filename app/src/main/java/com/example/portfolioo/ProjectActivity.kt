package com.example.portfolioo

//MVP arkitektur

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ProjectActivity : AppCompatActivity() {

    //Skapar en lista med projekt:
    var projects = mutableListOf<Project>(
        Project(
            "Cards Game",
            "BesIt has a welcome page. Then there is an image of a card and you can now guess if next\n" +
                    " card is lower or higher than the current card. When you get to 1000 point the game ends and you are considered a winner.kriv",
            "https://github.com/aelin6277/Cardsgame",
            R.drawable.cardsgameapp
        ),//hejkonpejkon
        Project("BMI app",
            "bmiapp: The user can write its lenght and weight, press the button that says \"calculate\" and get its BMI.\n",
            "http://github.com/example2",
            R.drawable.bmiapp),
        Project("Menu app",
            "Menu app Beskriv, Lorem ipsum dolor sit amet, tale nulla consetetur cum cu, sea facilis accumsan prodesset ne. No quo hinc ludus labitur.",
            "http://github.com/example3",
            R.drawable.menyapp),
        Project("Employee app",
            "Employee app Beskriv, Lorem ipsum dolor sit amet, tale nulla consetetur cum cu, sea facilis accumsan prodesset ne. No quo hinc ludus labitur.",
            "http://github.com/example4",
            R.drawable.employeeappen),
        // Project("BMI app","Beskriv", "http://github.com 2", R.drawable.bmiapp1),
        //   Project("BMI app","Beskriv", "http://github.com 2", R.drawable.bmiapp1)
    )


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        //Skapar en recyclerView:
        val recyclerView = findViewById<RecyclerView>(R.id.ProjectRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Skapar en adapter från min adapter-klass och skickar med min lista av projekt:
        val adapter = ProjectRecyclerAdapter(projects)

        // Kopplar ihop min adapter med min RecyclerView:
        recyclerView.adapter = adapter
    }


}
