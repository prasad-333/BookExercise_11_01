package com.gbagd24.bookexercise_ch11.exercise_13_04

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gbagd24.bookexercise_ch11.R
import org.koin.android.ext.android.inject
import org.koin.androidx.scope.ScopeActivity
//import org.koin.java.KoinJavaComponent.inject


//class MainActivity13_04 : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main13_01)
//
//
//        val mainContainer =
//            MainContainer((application as RandomApplication).applicationContainer.numberRepository)
//        val viewModel = ViewModelProvider(
//            this,
//            mainContainer.getMainViewModelFactory()
//        ).get(MainViewModel::class.java)
//        viewModel.numberLiveData.observe(this, Observer {
//            findViewById<TextView>(R.id.activity_main_text_view).text = it.toString()
//        }
//        )
//        findViewById<TextView>(R.id.activity_main_button).setOnClickListener {
//            viewModel.generateNextNumber()
//        }
//
//
//
//    }
//}

class MainActivity13_04 : ScopeActivity() {
    private val mainViewModel: MainViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13_01)
        //mainViewModel.getLiveData().observe()
        mainViewModel.numberLiveData.observe(this, Observer {
            findViewById<TextView>(R.id.activity_main_text_view) .text = it.toString()
        }
        )
        findViewById<TextView>(R.id.activity_main_button) .setOnClickListener {
            mainViewModel.generateNextNumber()
        }
    }
}

