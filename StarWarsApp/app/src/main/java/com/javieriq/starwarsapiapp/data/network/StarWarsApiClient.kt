package com.javieriq.starwarsapiapp.data.network

import com.javieriq.starwarsapiapp.data.model.ApiResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface StarWarsApiClient {

    @GET("people/")
    suspend fun getAllPeople(): Response<ApiResponseModel>

}