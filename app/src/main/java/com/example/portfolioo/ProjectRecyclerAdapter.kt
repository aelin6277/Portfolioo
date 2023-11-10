package com.example.portfolioo

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProjectRecyclerAdapter(val context: Context, val projects: List<Project> ) :
    RecyclerView.Adapter<ProjectRecyclerAdapter.ViewHolder>(){

    val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)
        Log.d("!!!Adapter", "oncreateViewholder")

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("!!!Adapter", "onbindviewholder $position")

        // när en list_view ska visas så tar vi rätt person från vår lista
        val project = projects[position] //HOW DOES IT KNOW THE RIGHT PROJECT?

        // sätt in den personens uppgifter i vår view
        holder.projectName.text = project.name
        holder.projectImagePreview.setImageResource( project.imageView)
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


