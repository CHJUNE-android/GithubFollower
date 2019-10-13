package com.example.githubfollower.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.example.githubfollower.R
import com.example.githubfollower.adapter.GithubFollowerAdapter
import com.example.githubfollower.data.GithubData
import com.example.githubfollower.util.SimpleDividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var githubFollowerAdapter: GithubFollowerAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id_textview : TextView = findViewById(R.id.id_textview)
        val name_textview : TextView = findViewById(R.id.name_textview)
        val description_textview : TextView = findViewById(R.id.description_textview)
        githubFollowerAdapter = GithubFollowerAdapter(this,id_textview,name_textview,description_textview)
        github_list_recyclerview.layoutManager = LinearLayoutManager(this)
        github_list_recyclerview.addItemDecoration(
            SimpleDividerItemDecoration(this)
        )
        github_list_recyclerview.adapter = githubFollowerAdapter

        val snapHelper : SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(github_list_recyclerview)

        imageView.setOnClickListener{
            val intent : Intent = Intent(this@MainActivity,WebToonActivity::class.java)
            startActivity(intent)
        }

        githubFollowerAdapter.datas = listOf(
            GithubData(
                git_id = "apt103703",
                git_name = "HoJune Choi",
                git_description = "developer, interested in Android \n Java & UI/UX"
            ),
            GithubData(
                git_id = "subin123",
                git_name = "SuBin Kang",
                git_description = "developer, interested in Android \n Java & C++"
            ),
            GithubData(
                git_id = "somin123",
                git_name = "SoMin Lee",
                git_description = "developer, interested in Android \n Kotlin & C"
            ),
            GithubData(
                git_id = "euni123",
                git_name = "EunI Jung",
                git_description = "developer, interested in Android \n C# & UI/UX"
            ),
            GithubData(
                git_id = "seungjun123",
                git_name = "SeungJune Choi",
                git_description = "developer, interested in Android \n BigData R & Python"
            ),
            GithubData(
                git_id = "yewon123",
                git_name = "YeWon Choi",
                git_description = "developer, interested in Android \n Kotlin & UI/UX"
            ),
            GithubData(
                git_id = "greedy0110",
                git_name = "SeungMin Shin",
                git_description = "developer, interested in Android \n HTML5 & UI/UX"
            )
        )
        githubFollowerAdapter.notifyDataSetChanged()

    }

}
