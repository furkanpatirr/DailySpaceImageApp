package com.fpat2.dailyspaceimageapp.data.source

import com.fpat2.dailyspaceimageapp.data.api.ApodRestApi
import com.fpat2.dailyspaceimageapp.data.dto.ApodDto
import com.fpat2.dailyspaceimageapp.data.dto.ApodsResponseItem
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apodRestApi: ApodRestApi) :
    RemoteDataSource {
    override suspend fun fetchTodayApod(): Response<ApodDto> {
        return apodRestApi.fetchTodayApod()
    }

    override suspend fun fetchApodByDate(date: String): Response<ApodsResponseItem> {
        return apodRestApi.fetchApodByDate(date)
    }

    override suspend fun fetchApodsInRange(
        startDate: String,
        endDate: String
    ): Response<ApodsResponseItem> {
        return apodRestApi.fetchApodsInRange(startDate, endDate)
    }

}