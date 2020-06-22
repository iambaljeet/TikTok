package com.app.tiktok.di

import android.content.Context
import com.app.tiktok.mock.Mock
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@InstallIn(ActivityRetainedComponent::class)
@Module
object MockModule {
    @Provides
    fun providesMockDependency(@ApplicationContext context: Context): Mock {
        return Mock(context)
    }
}