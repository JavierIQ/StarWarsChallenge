package com.javieriq.starwarsapiapp.data.network

import android.util.Log
import com.javieriq.starwarsapiapp.core.RetrofitHelper
import com.javieriq.starwarsapiapp.data.model.ApiResponseModel
import com.javieriq.starwarsapiapp.data.model.ResultsModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class StarWarsPeopleService {

    private val retrofit = RetrofitHelper.getRetrofit()

    private val emptyResultModel = ResultsModel(
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        emptyList(),
        emptyList(),
        emptyList(),
        emptyList(),
        "",
        "",
        ""
    )

    suspend fun getAllPeople(): ApiResponseModel {
        return try {
            withContext(Dispatchers.IO) {
                val response = retrofit.create(StarWarsApiClient::class.java).getAllPeople()
                response.body() ?: ApiResponseModel(0, "null", "null", emptyResultModel)
            }
        }catch (e: Exception){
            Log.e("DATAAPI", e.toString())
            return ApiResponseModel(0, "null", "null", emptyResultModel)
        }
    }
}