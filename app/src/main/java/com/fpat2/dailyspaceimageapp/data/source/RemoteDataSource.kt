package com.fpat2.dailyspaceimageapp.data.source

import com.fpat2.dailyspaceimageapp.data.dto.ApodDto
import com.fpat2.dailyspaceimageapp.data.dto.ApodsResponseItem
import retrofit2.Response

interface RemoteDataSource {
    suspend fun fetchTodayApod(): Response<ApodDto>
    suspend fun fetchApodByDate(date: String): Response<ApodsResponseItem>
    suspend fun fetchApodsInRange(startDate: String, endDate: String): Response<ApodsResponseItem>
}