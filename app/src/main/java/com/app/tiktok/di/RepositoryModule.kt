package com.app.tiktok.di

import android.app.Application
import com.app.tiktok.repositories.DataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object RepositoryModule {
    @Provides
    fun providesDataRepository(application: Application): DataRepository {
        return DataRepository(application)
    }
}