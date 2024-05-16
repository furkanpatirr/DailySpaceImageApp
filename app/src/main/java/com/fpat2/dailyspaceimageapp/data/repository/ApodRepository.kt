package com.fpat2.dailyspaceimageapp.data.repository

import com.fpat2.dailyspaceimageapp.data.NetworkResponseState
import com.fpat2.dailyspaceimageapp.model.Apod
import kotlinx.coroutines.flow.Flow

interface ApodRepository {
    suspend fun getTodayApod(): Flow<NetworkResponseState<Apod>>

    suspend fun getTodayApodByDate(date: String): Flow<NetworkResponseState<Apod>>

    suspend fun getApodsInRange(
        startDate: String,
        endDate: String
    ): Flow<NetworkResponseState<List<Apod>>>
}