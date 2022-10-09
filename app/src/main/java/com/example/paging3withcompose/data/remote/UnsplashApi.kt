package com.example.paging3withcompose.data.remote

import com.example.paging3withcompose.BuildConfig
import com.example.paging3withcompose.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {
    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
    ): List<UnsplashImage>


     @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
     @GET("/search/photos")
     suspend fun searchImage(
         @Query("page") page: Int,
         @Query("per_page")per_page: Int
     ):UnsplashImage
}