package com.gbagd24.bookexercise_ch11.exercise_13_02

import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import java.util.*

@Module
@DisableInstallInCheck //excluded for 13_03 hilt dependency testing as EXCLUDE directory didn't work
class ApplicationModule {
    @Provides
    fun provideRandom(): Random = Random()
    @Provides
    fun provideNumberRepository(random: Random): NumberRepository = NumberRepositoryImpl(random)
}
