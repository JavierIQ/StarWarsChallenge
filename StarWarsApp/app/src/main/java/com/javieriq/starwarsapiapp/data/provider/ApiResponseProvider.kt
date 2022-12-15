package com.javieriq.starwarsapiapp.data.provider

import com.javieriq.starwarsapiapp.data.model.ApiResponseModel
import com.javieriq.starwarsapiapp.data.model.ResultsModel

class ApiResponseProvider{

    companion object{
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

        var peopleList: ApiResponseModel= ApiResponseModel(0, "null", "null", emptyResultModel)
    }
}
