package com.gbagd24.bookexercise_ch11.exercise_13_02

import java.util.*

class NumberRepositoryImpl(private val random: Random) : NumberRepository {
    override fun generateNextNumber(): Int {
        return random.nextInt()
    }
}
