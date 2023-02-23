package com.gbagd24.bookexercise_ch11.exercise_13_02

import android.app.Application
import com.gbagd24.bookexercise_ch11.exercise_13_01.ApplicationContainer

class RandomApplication : Application() {
    //val applicationContainer = ApplicationContainer()

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.create()
    }
}
