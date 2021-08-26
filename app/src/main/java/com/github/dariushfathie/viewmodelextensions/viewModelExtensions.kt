package com.github.dariushfathie.viewmodelextensions

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


inline fun BaseViewModel.onMain(
    crossinline body: suspend CoroutineScope.() -> Unit
): Job {
    // by default, Dispatchers.Main is default dispatcher to viewModelScope
    return viewModelScope.launch() {
        body(this)
    }
}


inline fun BaseViewModel.onMainImmediate(
    crossinline body: suspend CoroutineScope.() -> Unit
): Job {
    // make sure to read documentation about immediate dispatcher, it can throw Exception!
    return viewModelScope.launch(mainImmediate) {
        body(this)
    }
}


inline fun BaseViewModel.onIO(
    crossinline body: suspend CoroutineScope.() -> Unit
): Job {
    return viewModelScope.launch(io) {
        body(this)
    }
}


inline fun BaseViewModel.onDefault(
    crossinline body: suspend CoroutineScope.() -> Unit
): Job {
    return viewModelScope.launch(default) {
        body(this)
    }
}

inline fun BaseViewModel.onUnconfined(
    crossinline body: suspend CoroutineScope.() -> Unit
): Job {
    return viewModelScope.launch(unconfined) {
        body(this)
    }
}