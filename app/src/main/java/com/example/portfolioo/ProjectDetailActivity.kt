package com.example.portfolioo

import android.os.Bundle
import android.text.util.Linkify
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProjectDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_it_project_detail)

        val intent = getIntent()
        if (intent != null) {
            val projectName = intent.getStringExtra("project_name")
            val projectDescription = intent.getStringExtra("project_description")
            val projectGithubUrl = intent.getStringExtra("project_github_url")
            val projectImage = intent.getIntExtra("project_image", 0)

            findViewById<TextView>(R.id.project_detail_name).text = projectName
            findViewById<TextView>(R.id.project_detail_description).text = projectDescription
            findViewById<ImageView>(R.id.project_detail_image).setImageResource(projectImage)
            val githubUrlTextView = findViewById<TextView>(R.id.project_detail_github_url)
            githubUrlTextView.text = projectGithubUrl
            Linkify.addLinks(githubUrlTextView, Linkify.WEB_URLS)
        }

    }
}