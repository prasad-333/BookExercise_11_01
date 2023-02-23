package com.gbagd24.bookexercise_ch11.exercise_13_02

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun createMainSubcomponent(): MainSubcomponent
}
