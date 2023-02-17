package com.gbagd24.bookexercise_ch11.exercise_12_01

import android.app.Application
import android.content.Context

class PreferenceApplication : Application() {
    lateinit var preferenceWrapper: PreferenceWrapper
    override fun onCreate() {
        super.onCreate()
        preferenceWrapper = PreferenceWrapper(getSharedPreferences("prefs", Context.MODE_PRIVATE))
    }
}
