package com.gbagd24.bookexercise_ch11.exercise_13_01

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val numberRepository: NumberRepository) : ViewModel() {


    private val _numberLiveData = MutableLiveData<Int>()
    val numberLiveData: LiveData<Int> = _numberLiveData


    fun generateNextNumber() {
        _numberLiveData.postValue(numberRepository.generateNextNumber())
    }
}
