package com.example.photoapitest.model

data class PhotoResponse(
    val hits: List<PhotoHit>
)

data class PhotoHit(
    val webformatURL: String,
    val user: String,
    val likes: Int,
    val id: Int
)