package com.github.dariushfathie.viewmodelextensions

import androidx.lifecycle.ViewModel


open class BaseViewModel(scopeProvider: DispatcherProvider) : ViewModel(),
    DispatcherProvider by scopeProvider

