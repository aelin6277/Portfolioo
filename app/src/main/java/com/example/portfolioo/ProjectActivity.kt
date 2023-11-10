package com.example.portfolioo

//MVP arkitektur?

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
            "Beskriv",
            "http://github.com",
            R.drawable.cardsgameapp
        ),//hejkonpejkon
        Project("BMI app",
            "Beskriv",
            "http://github.com 2",
            R.drawable.bmiapp),
        Project("Menu app",
            "Beskriv",
            "http://github.com3",
            R.drawable.menyapp),
        Project("employee",
            "Beskriv",
            "http://github.com 2",
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


        // 1. skapa adapter
        // 2. koppla data ( vilken ) till adapter
        // 3. koppla adapter till recycleview


    }


}


//    handleButtonItProjects()
//
//    buttonItProjects = findViewById<Button>(R.id.ButtonItProjects)
//
//    buttonItProjects.setOnClickListener(){
//        handleButtonItProjects()
//    }
//
//    fun handleButtonItProjects(){
//        val intent = Intent(this, Project::class.java)
//        startActivity(intent)
//    }
//}
//
//
//
