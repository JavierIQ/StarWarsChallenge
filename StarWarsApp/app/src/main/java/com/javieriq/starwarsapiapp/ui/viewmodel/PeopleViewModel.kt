package com.javieriq.starwarsapiapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.javieriq.starwarsapiapp.data.model.ApiResponseModel
import com.javieriq.starwarsapiapp.domain.GetAllPeopleUseCase
import kotlinx.coroutines.launch

class PeopleViewModel: ViewModel() {

    val peopleListViewModel = MutableLiveData<ApiResponseModel?>()

    val getAllPeopleUseCase = GetAllPeopleUseCase()

    fun onCreate(){
        viewModelScope.launch {
            val result = getAllPeopleUseCase()
            if (result != null){
                peopleListViewModel.postValue(result)
            }else{
                Log.d("DATA_API","User does not exist")
            }
        }
    }

}