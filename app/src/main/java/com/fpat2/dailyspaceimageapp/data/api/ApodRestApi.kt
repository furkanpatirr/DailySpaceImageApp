package com.fpat2.dailyspaceimageapp.data.api

import com.fpat2.dailyspaceimageapp.data.dto.ApodDto
import com.fpat2.dailyspaceimageapp.data.dto.ApodsResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApodRestApi { // TODO:  refactor api calls
    @GET("planetary/apod")
    suspend fun fetchTodayApod(
    ): Response<ApodDto>

    @GET("planetary/apod")
    suspend fun fetchApodByDate(
        @Query("date") date: String
    ): Response<ApodsResponseItem>

    @GET("planetary/apod")
    suspend fun fetchApodsInRange(
        @Query("start_date") startDate: String,
        @Query("end_date") endDate: String
    ): Response<ApodsResponseItem>
}