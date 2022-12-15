package com.javieriq.starwarsapiapp.domain

import com.javieriq.starwarsapiapp.data.StarWarsApiRepository
import com.javieriq.starwarsapiapp.data.model.ApiResponseModel

class GetAllPeopleUseCase {

    private val repository = StarWarsApiRepository()

    suspend operator fun invoke(): ApiResponseModel? = repository.getAllPeopleApi()
}