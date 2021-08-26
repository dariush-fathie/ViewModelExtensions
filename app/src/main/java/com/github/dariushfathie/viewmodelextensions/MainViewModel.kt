package com.github.dariushfathie.viewmodelextensions

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    dispatcherProvider: DispatcherProvider
) : BaseViewModel(dispatcherProvider) {


    var isSaved = false

    fun saveDataOnIO() {
        onIO {
            delay(5000)
            isSaved = true
        }
    }

    var isSessionExpired = false

    fun checkSessionExpired(){
        onMain {
            delay(10000)
            isSessionExpired = true
        }
    }


}