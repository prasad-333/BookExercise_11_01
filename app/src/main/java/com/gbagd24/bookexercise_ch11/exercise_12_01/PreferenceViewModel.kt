package com.gbagd24.bookexercise_ch11.exercise_12_01

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class PreferenceViewModel(private val preferenceWrapper: PreferenceWrapper) : ViewModel() {
    fun saveText(text: String) {
        preferenceWrapper.saveText(text)
    }
    fun getText(): LiveData<String> {
        return preferenceWrapper.getText()
    }
}
