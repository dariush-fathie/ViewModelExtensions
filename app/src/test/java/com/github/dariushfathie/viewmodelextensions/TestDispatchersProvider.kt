package com.github.dariushfathie.viewmodelextensions

import kotlinx.coroutines.CoroutineDispatcher

class TestDispatchersProvider(private val testDispatcher: CoroutineDispatcher) :
    DispatcherProvider {
    override val mainImmediate: CoroutineDispatcher
        get() = testDispatcher
    override val io: CoroutineDispatcher
        get() = testDispatcher
    override val default: CoroutineDispatcher
        get() = testDispatcher
    override val unconfined: CoroutineDispatcher
        get() = testDispatcher
}