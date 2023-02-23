package com.gbagd24.bookexercise_ch11.exercise_13_02

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck //excluded for 13_03 hilt dependency testing as EXCLUDE directory didn't work
class MainModule {
    @Provides
    fun provideMainViewModelFactory(numberRepository: NumberRepository): ViewModelProvider.Factory {
        return object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return MainViewModel(numberRepository) as T
            }
        }
    }
}
