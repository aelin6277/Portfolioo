package com.example.portfolioo

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ProjectRecyclerAdapter( val projects: List<Project> ) :
    RecyclerView.Adapter<ProjectRecyclerAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        Log.d("!!!Adapter", "oncreateViewholder")

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("!!!Adapter", "onbindviewholder $position")

        // när en list_view ska visas så tar vi rätt person från vår lista
        val project = projects[position] //HOW DOES IT KNOW THE RIGHT PROJECT?

        // sätt in den personens uppgifter i vår view
        holder.projectName.text = project.name
        holder.projectImagePreview.setImageResource(project.image)

        holder.itemView.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(holder.itemView.context, ProjectDetailActivity::class.java)

            intent.putExtra("project_name",  project.name)
            intent.putExtra("project_description",  project.description)
            intent.putExtra("project_github_url",  project.github)
            intent.putExtra("project_image",  project.image)

            holder.itemView.context.startActivity(intent)
        })
    }

    override fun getItemCount(): Int { //TIENE SENTIDO?
        return projects.size
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)   {
        // när en viewholder skapas letar vi reda på två textviews som finns inne i vår itemview
        // (vår itemview är skapad utifrån vår list_item layout)
        val projectName: TextView
        val projectImagePreview: ImageView

        init {
            // Define click listener for the ViewHolder's View
            projectName =  itemView.findViewById<TextView>(R.id.projectName)
            projectImagePreview =  itemView.findViewById<ImageView>(R.id.projectImagePreview)
        }
    }

}


