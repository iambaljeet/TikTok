package com.app.tiktok.ui.main.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.app.tiktok.model.ResultData
import com.app.tiktok.model.StoriesDataModel
import com.app.tiktok.repository.DataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow

class MainViewModel @ViewModelInject constructor(private val dataRepository: DataRepository): ViewModel() {
    fun getDataList(): LiveData<ResultData<ArrayList<StoriesDataModel>?>> {
        return flow {
            emit(ResultData.Loading())
            emit(ResultData.Success(dataRepository.getStoriesData()))
        }.asLiveData(Dispatchers.IO)
    }
}