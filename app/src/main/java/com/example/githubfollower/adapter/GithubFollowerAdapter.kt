package com.example.githubfollower.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubfollower.R
import com.example.githubfollower.data.GithubData
import com.example.githubfollower.view_holder.GithubFollowerViewHolder

class GithubFollowerAdapter (private val context: Context, private val id_textview : TextView, private val name_textview : TextView,private val description_textview : TextView) : RecyclerView.Adapter<GithubFollowerViewHolder>(){

    var datas = listOf<GithubData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubFollowerViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.item_github_list,parent,false)
        return GithubFollowerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: GithubFollowerViewHolder, position: Int) {
        holder.bind(datas[position])
        holder.item_layout.setOnClickListener{
            id_textview.text = datas[position].git_id
            name_textview.text = datas[position].git_name
            description_textview.text = datas[position].git_description
        }
    }

}