package com.app.tiktok.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class StoriesDataModel(
    val storyId: Long,
    val storyUrl: String,
    val storyThumbUrl: String? = null,
    val storyDescription: String? = null,
    val musicCoverTitle: String,
    val musicCoverImageLink: String? = null,
    val userId: String,
    val userProfilePicUrl: String? = null,
    val userName: String,
    val likesCount: Long,
    val commentsCount: Long,
    val contentWarning: String? = null
): Parcelable