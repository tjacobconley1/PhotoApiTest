package com.example.photoapitest.model.remote


import com.example.photoapitest.BuildConfig.ENDPOINT
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotoApi {

    // https://pixabay.com/
    // api/?
    // key=23476117-8ce505c1632a7deceb170b7d7
    // &safesearch=true
    // &per_page=50

    @GET(ENDPOINT)
    suspend fun getPhotos(
        @Query("key")
        key: String = "23476117-8ce505c1632a7deceb170b7d7",
        @Query("safesearch")
        searchType: String = "true",
        @Query("per_page")
        responseSize: Int = 50
    )



}