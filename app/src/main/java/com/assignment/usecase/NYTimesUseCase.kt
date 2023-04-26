package com.assignment.usecase

import com.assignment.model.NYTimesResponse
import com.assignment.model.ResultData
import com.assignment.repository.NYTimesRepository
import javax.inject.Inject

class NYTimesUseCase @Inject constructor(private val repository: NYTimesRepository) {
    suspend fun getArticlesNYTimes(): ResultData<NYTimesResponse> {
        val data = repository.getArticlesNYTimes()
        return ResultData.Success(data)
    }
}