package com.example.githubfollower.view_holder

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.githubfollower.R
import com.example.githubfollower.data.GithubData

class GithubFollowerViewHolder (view : View) : RecyclerView.ViewHolder(view){
    val id_textview : TextView = view.findViewById(R.id.id_textview)
    val name_textview : TextView = view.findViewById(R.id.name_textview)
    val item_layout : ConstraintLayout = view.findViewById(R.id.item_layout)

    fun bind(data : GithubData){
        id_textview.text = data.git_id
        name_textview.text = data.git_name
    }
}