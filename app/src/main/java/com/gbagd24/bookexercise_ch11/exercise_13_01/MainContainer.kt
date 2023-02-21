package com.gbagd24.bookexercise_ch11.exercise_13_01

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainContainer(private val numberRepository: NumberRepository) {
    fun getMainViewModelFactory(): ViewModelProvider.Factory {
        return object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return MainViewModel(numberRepository) as T
            }
        }
    }
}
