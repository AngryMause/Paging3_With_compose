package com.example.paging3withcompose.data

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.example.paging3withcompose.data.local.UnsplashImageDB
import com.example.paging3withcompose.data.remote.UnsplashApi
import com.example.paging3withcompose.model.UnsplashImage
import javax.inject.Inject

@OptIn(ExperimentalPagingApi::class)
class UnsplashRemoteMediator @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashImageDB: UnsplashImageDB,
) : RemoteMediator<Int, UnsplashImage>() {
    private val unsplashImageDao = unsplashImageDB.unsplashImage()
    private val unsplashRemoteKey = unsplashImageDB.unsplashRemoteKeys()


    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, UnsplashImage>,
    ): MediatorResult {
        TODO()
    }


}