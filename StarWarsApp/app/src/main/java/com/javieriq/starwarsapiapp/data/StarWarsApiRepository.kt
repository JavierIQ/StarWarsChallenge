package com.javieriq.starwarsapiapp.data

import com.javieriq.starwarsapiapp.data.model.ApiResponseModel
import com.javieriq.starwarsapiapp.data.network.StarWarsPeopleService
import com.javieriq.starwarsapiapp.data.provider.ApiResponseProvider

class StarWarsApiRepository {

    private val api = StarWarsPeopleService()

    suspend fun getAllPeopleApi(): ApiResponseModel{
        val response = api.getAllPeople()
        ApiResponseProvider.peopleList = response
        return response
    }
}