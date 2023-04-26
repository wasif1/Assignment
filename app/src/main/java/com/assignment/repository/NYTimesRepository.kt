package com.assignment.repository

import com.assignment.model.NYTimesResponse
import com.assignment.network.ApiService
import javax.inject.Inject

class NYTimesRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getArticlesNYTimes(): NYTimesResponse {
        return apiService.getArticlesNYTimes()
    }
}