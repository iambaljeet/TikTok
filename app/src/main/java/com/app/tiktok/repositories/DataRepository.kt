package com.app.tiktok.repositories

import com.app.tiktok.mock.Mock
import com.app.tiktok.model.StoriesDataModel
import javax.inject.Inject

class DataRepository @Inject constructor(private val mock: Mock) {
    fun getStoriesData(): MutableList<StoriesDataModel>? {
        val dataList = mock.loadMockData()
        return dataList
    }
}