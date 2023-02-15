package com.gbagd24.bookexercise_ch11

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TotalsViewModelTest {


//    @get:Rule
//    val rule = InstantTaskExecutorRule()
//
//    private val totalsViewModel = TotalsViewModel()
//
//    @Before
//    fun setUp() {
//        assertEquals(0, totalsViewModel.total.value)
//    }

    //11.02
    @get:Rule
    val rule = InstantTaskExecutorRule()
    private lateinit var totalsViewModel: TotalsViewModel
    @Before
    fun setUp() {
        totalsViewModel = TotalsViewModel()
        assertEquals(0, totalsViewModel.total.value)
    }



    @Test
    fun increaseTotal() {
        val total = 5
        for (i in 0 until total) {
            totalsViewModel.increaseTotal()
        }
        assertEquals(5, totalsViewModel.total.value)
    }
}
