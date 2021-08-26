package com.github.dariushfathie.viewmodelextensions

import androidx.lifecycle.ViewModel


open class BaseViewModel(dispatcherProvider: DispatcherProvider) : ViewModel(),
    DispatcherProvider by dispatcherProvider

