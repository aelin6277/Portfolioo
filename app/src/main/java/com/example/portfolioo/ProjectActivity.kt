package com.example.portfolioo

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
            "It has a welcome page. Then there is an image of a card and you can now guess if next" +
                    " card is lower or higher than the current card. When you get to 1000 point the game ends and you are considered a winner.",
            "https://github.com/aelin6277/Cardsgame",
            R.drawable.cardsgameapp
        ),
        Project("BMI app",
            "The user can write lenght and weight, press the button that says \"calculate\" and get current BMI.",
            "http://github.com/example2",
            R.drawable.bmiapp),
        Project("Menu app",
            "Lorem ipsum dolor sit amet, tale nulla consetetur cum cu, sea facilis accumsan prodesset ne. No quo hinc ludus labitur.",
            "http://github.com/example3",
            R.drawable.menyapp),
        Project("Employee app",
            "Lorem ipsum dolor sit amet, tale nulla consetetur cum cu, sea facilis accumsan prodesset ne. No quo hinc ludus labitur.",
            "http://github.com/example4",
            R.drawable.employeeappen),
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
