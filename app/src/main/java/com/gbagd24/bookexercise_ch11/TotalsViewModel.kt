package com.gbagd24.bookexercise_ch11

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TotalsViewModel : ViewModel() {
    //exercise_11_01
//    var total = 0
//    fun increaseTotal(): Int {
//        total++
//        return total
//    }

    //exercise_11_02
    private val _total = MutableLiveData<Int>()
    val total: LiveData<Int> = _total


    init {
        _total.postValue(0)
    }


    fun increaseTotal() {
        _total.postValue((_total.value ?: 0) + 1)
    }

}
