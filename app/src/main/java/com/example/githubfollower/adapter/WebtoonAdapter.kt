package com.example.githubfollower.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubfollower.R
import com.example.githubfollower.data.GithubData
import com.example.githubfollower.data.WebtoonData
import com.example.githubfollower.view_holder.GithubFollowerViewHolder
import com.example.githubfollower.view_holder.WebtoonViewHolder

class WebtoonAdapter (private val context: Context) : RecyclerView.Adapter<WebtoonViewHolder>(){

    var datas = listOf<WebtoonData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebtoonViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.item_web_toon,parent,false)
        return WebtoonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: WebtoonViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}