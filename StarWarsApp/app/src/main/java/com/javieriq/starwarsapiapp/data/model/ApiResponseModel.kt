package com.javieriq.starwarsapiapp.data.model

import com.google.gson.annotations.SerializedName

data class ApiResponseModel(
    @SerializedName("count") val count: Int,
    @SerializedName("next") val nextPage: String,
    @SerializedName("previous") val previousPage: String,
    @SerializedName("results") val results: ResultsModel
)
