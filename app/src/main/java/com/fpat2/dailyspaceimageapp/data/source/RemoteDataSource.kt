package com.fpat2.dailyspaceimageapp.data.source

interface RemoteDataSource {
    suspend fun fetchTodayApod(apiKey: String): ApodResponse
    suspend fun fetchApodByDate(apiKey: String, date: String): ApodResponse
    suspend fun fetchApodsInRange(apiKey: String, startDate: String, endDate: String): List
}