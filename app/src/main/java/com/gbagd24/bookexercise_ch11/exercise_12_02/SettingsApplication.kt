package com.gbagd24.bookexercise_ch11.exercise_12_02

import android.app.Application

class SettingsApplication : Application() {


    lateinit var settingsStore: SettingsStore


    override fun onCreate() {
        super.onCreate()
        settingsStore = SettingsStore(this)
    }
}
