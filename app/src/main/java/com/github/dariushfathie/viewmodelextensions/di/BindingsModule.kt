package com.github.dariushfathie.viewmodelextensions.di

import com.github.dariushfathie.viewmodelextensions.DispatcherProvider
import com.github.dariushfathie.viewmodelextensions.DispatcherProviderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
interface BindingsModule {

    @Binds
    fun bindDispatcherProvider(impl: DispatcherProviderImpl): DispatcherProvider

}