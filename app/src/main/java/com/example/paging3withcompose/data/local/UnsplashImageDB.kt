package com.example.paging3withcompose.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomOpenHelper
import com.example.paging3withcompose.data.local.dao.ImageDao
import com.example.paging3withcompose.data.local.dao.UnsplashRemoteKeysDao
import com.example.paging3withcompose.model.UnsplashImage
import com.example.paging3withcompose.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashImageDB() : RoomDatabase() {
    abstract fun unsplashImage(): ImageDao
    abstract fun unsplashRemoteKeys(): UnsplashRemoteKeysDao

}