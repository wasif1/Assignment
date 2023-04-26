package com.assignment.network

import com.assignment.Utills.Constants
import com.assignment.model.NYTimesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    /**
     * API END POINTS
     */
    @GET("mostviewed/{section}/{period}.json")
    suspend fun getArticlesNYTimes(
        @Path("section") section: String = Constants.NY_TIME_SECTION,
        @Path("period") period: String = Constants.NY_TIME_PERIOD,
        @Query("api-key") apiKey: String = Constants.NY_TIME_API_KEY,
    ): NYTimesResponse

}