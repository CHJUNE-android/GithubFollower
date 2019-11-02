package com.example.githubfollower.api

import com.example.githubfollower.data.GetGitRepoData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService{
    @GET("/users/{login}/repos")//요청 URL적는 곳. API 문서 내용 : GET / users/:username/repos 에서 username이 변수.
    fun getRepos(
        @Path("login") login: String//요청 URL에서 {}안의 내용을 동적으로 처리하겠다고 했으므로 매개변수 전달이 필요. 때문에 @Path에서 이를 처리해줘야 함.
    ): Call<List<GetGitRepoData>>//비동기 통신을 돕는 Retrofit에서 제공하는 객체(Call), List<GetGitRepoData>는 서버에서 받아올 데이터
}