package com.app.tiktok.repositories

import android.content.Context
import com.app.tiktok.R
import com.app.tiktok.model.StoriesDataModel
import dagger.hilt.android.qualifiers.ActivityContext

class DataRepository(@ActivityContext private val context: Context) {
    fun getStoriesData(): MutableList<StoriesDataModel> {
        val dataList = mutableListOf<StoriesDataModel>()
        for (i in 0..25) {
            when {
                i % 2 == 0 -> {
                    val storiesDataModel = StoriesDataModel(
                        likesCount = i.toLong(),
                        commentsCount = i.toLong(),
                        contentWarning = null,
                        musicCoverImageLink = null,
                        musicCoverTitle = "Large test title for video's music description",
                        storyId = i.toLong(),
                        storyUrl = context.getString(R.string.test_story_url_1),
                        storyThumbUrl = context.getString(R.string.test_story_url_1),
                        storyDescription = context.getString(R.string.test_story_description),
                        userId = "$i",
                        storyUserName = "@Baljeet",
                        userProfilePicUrl = context.getString(R.string.test_user_pic_url)
                    )
                    dataList.add(storiesDataModel)
                }
                i % 3 == 0 -> {
                    val storiesDataModel = StoriesDataModel(
                        likesCount = i.toLong(),
                        commentsCount = i.toLong(),
                        contentWarning = null,
                        musicCoverImageLink = null,
                        musicCoverTitle = "Test title",
                        storyId = i.toLong(),
                        storyUrl = context.getString(R.string.test_story_url_2),
                        storyThumbUrl = context.getString(R.string.test_story_url_2),
                        storyDescription = context.getString(R.string.test_story_description),
                        userId = "$i",
                        storyUserName = "@Baljeet",
                        userProfilePicUrl = context.getString(R.string.test_user_pic_url)
                    )
                    dataList.add(storiesDataModel)
                }
                i % 5 == 0 -> {
                    val storiesDataModel = StoriesDataModel(
                        likesCount = i.toLong(),
                        commentsCount = i.toLong(),
                        contentWarning = null,
                        musicCoverImageLink = null,
                        musicCoverTitle = "Test title",
                        storyId = i.toLong(),
                        storyUrl = context.getString(R.string.test_story_url_3),
                        storyThumbUrl = context.getString(R.string.test_story_url_3),
                        storyDescription = context.getString(R.string.test_story_description),
                        userId = "$i",
                        storyUserName = "@Baljeet",
                        userProfilePicUrl = context.getString(R.string.test_user_pic_url)
                    )
                    dataList.add(storiesDataModel)
                }
                else -> {
                    val storiesDataModel = StoriesDataModel(
                        likesCount = i.toLong(),
                        commentsCount = i.toLong(),
                        contentWarning = null,
                        musicCoverImageLink = null,
                        musicCoverTitle = "Test title",
                        storyId = i.toLong(),
                        storyUrl = context.getString(R.string.test_story_url_4),
                        storyThumbUrl = context.getString(R.string.test_story_url_4),
                        storyDescription = context.getString(R.string.test_story_description),
                        userId = "$i",
                        storyUserName = "@Baljeet",
                        userProfilePicUrl = context.getString(R.string.test_user_pic_url)
                    )
                    dataList.add(storiesDataModel)
                }
            }
        }
        return dataList
    }
}