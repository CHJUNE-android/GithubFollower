package com.example.githubfollower.feature.git_repo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.example.githubfollower.R
import com.example.githubfollower.data.GetGitRepoData
import com.example.githubfollower.data.GitRepoRepository
import com.example.githubfollower.data.ServerGitRepoRepository
import com.example.githubfollower.feature.webtoon.WebToonActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GitRepoListActivity : AppCompatActivity() {

    private lateinit var gitRepoAdapter: GitRepoAdapter
    private val gitRepoRepository: GitRepoRepository = ServerGitRepoRepository()
    private var login: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id_textview : TextView = findViewById(R.id.id_textview)
        val name_textview : TextView = findViewById(R.id.name_textview)
        val description_textview : TextView = findViewById(R.id.description_textview)
        gitRepoAdapter =
            GitRepoAdapter(
                this,
                id_textview,
                name_textview,
                description_textview
            )
        github_list_recyclerview.layoutManager = LinearLayoutManager(this)
        github_list_recyclerview.addItemDecoration(
            SimpleDividerItemDecoration(this)
        )
        github_list_recyclerview.adapter = gitRepoAdapter

        val snapHelper : SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(github_list_recyclerview)

        imageView.setOnClickListener{
            val intent : Intent = Intent(this@GitRepoListActivity,
                WebToonActivity::class.java)
            startActivity(intent)
        }
        login = "CHJUNE-android"
        gitRepoRepository.getRepos(login).enqueue(object : Callback<List<GetGitRepoData>> {
            override fun onFailure(call: Call<List<GetGitRepoData>>, t: Throwable) {
                //네트워크 통신에 실패했을 때
                Log.e("sopt_git_star", "error : $t")
            }

            override fun onResponse(call: Call<List<GetGitRepoData>>, response: Response<List<GetGitRepoData>>) {
                //네트워크 통신에 성공했을때, response 에 서버에서 받아온 데이터가 있을 것이다.
                if (response.isSuccessful) {
                    val gitRepos = response.body()!! // TODO 여기서 body 가 없다면, 어플리케이션이 죽을 것이다 어떻게 해야할까?

                    // adapter에 데이터 갱신하기
                    // 데이터의 소스는 repository가 관리한다.
                    gitRepoAdapter.datas = gitRepos
                    // 데이터 갱신한 다음, 어뎁터에게 다시 그리라고 알려준다. (이거 안하면 변화가 갱신되지 않는다.)
                    gitRepoAdapter.notifyDataSetChanged()
                }
            }
        })

        gitRepoAdapter.notifyDataSetChanged()

    }

}
