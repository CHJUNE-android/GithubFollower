package com.example.githubfollower.data

import com.google.gson.annotations.SerializedName

data class GetGitRepoData(
    //서버의 데이터 규약과 맞는 이름이 들어와야한다.
    @SerializedName("id")
    val git_id: String,
    @SerializedName("name")
    val git_name: String?,
    @SerializedName("description")
    val git_description: String?
)