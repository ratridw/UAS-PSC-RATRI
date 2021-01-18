package com.user.githubapp.api

import com.user.githubapp.data.model.DetailUserResponse
import com.user.githubapp.data.model.User
import com.user.githubapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token e417b605ede30b2a7ebef2a859174be5a8e8dfac")
    fun getSearchUsers(
        @Query ("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token e417b605ede30b2a7ebef2a859174be5a8e8dfac")
    fun getUserDetail(
            @Path ("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token e417b605ede30b2a7ebef2a859174be5a8e8dfac")
    fun getFollowers(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token e417b605ede30b2a7ebef2a859174be5a8e8dfac")
    fun getFollowing(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

}