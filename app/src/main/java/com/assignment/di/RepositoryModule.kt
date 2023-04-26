package com.assignment.di
import com.assignment.network.ApiService
import com.assignment.repository.NYTimesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object RepositoryModule {

    /**
     * Repositories
     */
    @Provides
    fun providesRepo(apiService: ApiService): NYTimesRepository {
        return NYTimesRepository(apiService = apiService)
    }
}