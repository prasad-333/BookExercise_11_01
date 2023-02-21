package com.gbagd24.bookexercise_ch11.exercise_13_01

import java.util.*

class ApplicationContainer {
    val numberRepository: NumberRepository = NumberRepositoryImpl(Random())
}
