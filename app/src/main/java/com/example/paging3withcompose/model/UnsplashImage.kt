package com.example.paging3withcompose.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paging3withcompose.Constant.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Entity(tableName = UNSPLASH_IMAGE_TABLE)
@Serializable
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User,
)

@Serializable
data class Urls(
    @SerialName("regular")
    val regularImage: String,
)

@Serializable
data class User(
    @SerialName("links")
    @Embedded
    val userLinks: UserLinks,
    val name: String,
)

@Serializable
data class UserLinks(
    val html: String,
)