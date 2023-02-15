package com.gbagd24.bookexercise_ch11

import androidx.lifecycle.ViewModel

class TotalsViewModel : ViewModel() {
    var total = 0
    fun increaseTotal(): Int {
        total++
        return total
    }
}
