package com.gbagd24.bookexercise_ch11.exercise_13_02

import dagger.Subcomponent

@MainScope
@Subcomponent(modules = [MainModule::class])
interface MainSubcomponent {
    fun inject(mainActivity: MainActivity13_02)

}