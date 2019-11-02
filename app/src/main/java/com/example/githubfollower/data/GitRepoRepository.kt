package com.example.githubfollower.data

import retrofit2.Call

interface GitRepoRepository {
    /**
     * login 한 유저의 GitRepo를 리스트 형태로 반환하는 함수
     * */
    fun getRepos(login: String): Call<List<GetGitRepoData>>
}