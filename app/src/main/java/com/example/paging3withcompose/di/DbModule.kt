package com.example.paging3withcompose.di

import android.content.Context
import androidx.room.Room
import com.example.paging3withcompose.Constant.UNSPLASH_DB
import com.example.paging3withcompose.data.local.UnsplashImageDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DbModule {

    @Provides
    @Singleton
    fun providesDataBase(@ApplicationContext context: Context): UnsplashImageDB {
        return Room.databaseBuilder(context, UnsplashImageDB::class.java, UNSPLASH_DB)
            .build()
    }
}