package com.assignment.di
import com.assignment.repository.NYTimesRepository
import com.assignment.usecase.NYTimesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object UseCaseModule {

    /**
     * UseCases
     */
    @Provides
    fun providesDataUseCase(repository: NYTimesRepository): NYTimesUseCase {
        return NYTimesUseCase(repository)
    }
}