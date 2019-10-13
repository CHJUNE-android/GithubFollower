package com.example.githubfollower.view_holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.githubfollower.R
import com.example.githubfollower.data.GithubData
import com.example.githubfollower.data.WebtoonData

class WebtoonViewHolder (view : View) : RecyclerView.ViewHolder(view){

    val webtoon_img_imageview : ImageView = view.findViewById(R.id.webtoon_img_imageview)
    val webtoon_name_textview : TextView = view.findViewById(R.id.webtoon_name_textview)
    val rating_textview : TextView = view.findViewById(R.id.rating_textview)
    val writer_name_textview : TextView = view.findViewById(R.id.writer_name_textview)

    fun bind(data : WebtoonData){
        setImage(data.webtoon_img)
        webtoon_name_textview.text = data.webtoon_name
        rating_textview.text = data.rating
        writer_name_textview.text = data.writer
    }
    fun setImage(resource : Int){
        if (resource ==1)webtoon_img_imageview.setImageResource(R.drawable.free_draw)
        else if(resource ==2)webtoon_img_imageview.setImageResource(R.drawable.yumi)
        else if(resource ==3)webtoon_img_imageview.setImageResource(R.drawable.horani)
        else if(resource ==4)webtoon_img_imageview.setImageResource(R.drawable.youngisanda)
        else if(resource ==5)webtoon_img_imageview.setImageResource(R.drawable.buhwalnam)
        else if(resource ==6)webtoon_img_imageview.setImageResource(R.drawable.studygroup)
        else if(resource ==7)webtoon_img_imageview.setImageResource(R.drawable.chwisabyung)
        else if(resource ==8)webtoon_img_imageview.setImageResource(R.drawable.moneygame)
        else if(resource ==9)webtoon_img_imageview.setImageResource(R.drawable.bizilante)
    }
}

