package com.gbagd24.bookexercise_ch11.exercise_13_01

import android.app.Application

class RandomApplication : Application() {
    val applicationContainer = ApplicationContainer()

    override fun onCreate() {
        super.onCreate()
    }
}
