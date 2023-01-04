package com.raywenderlich.android.rickycharacters.data.network

import com.raywenderlich.android.rickycharacters.data.models.CharactersResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/api/character/")
    suspend fun getCharacters(): Response<CharactersResponseModel>
}