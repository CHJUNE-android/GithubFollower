package com.example.githubfollower.data

import com.example.githubfollower.api.GithubServiceImpl
import retrofit2.Call

class ServerGitRepoRepository: GitRepoRepository {
    override fun getRepos(login: String): Call<List<GetGitRepoData>> {
        return GithubServiceImpl.service.getRepos(login)
    }
}
