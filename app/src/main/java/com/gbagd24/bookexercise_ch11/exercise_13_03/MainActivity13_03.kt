package com.gbagd24.bookexercise_ch11.exercise_13_03

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.gbagd24.bookexercise_ch11.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity13_03 : AppCompatActivity() {

//    @Inject
//    lateinit var factory: ViewModelProvider.Factory

    private val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13_01)


////        val mainContainer =
//////            MainContainer((application as RandomApplication).applicationContainer.numberRepository)
////        val viewModel = ViewModelProvider(
////            this,
////            mainContainer.getMainViewModelFactory()
////        ).get(MainViewModel::class.java)
////        viewModel.numberLiveData.observe(this, Observer {
////            findViewById<TextView>(R.id.activity_main_text_view).text = it.toString()
////        }
////        )
////        findViewById<TextView>(R.id.activity_main_button).setOnClickListener {
////            viewModel.generateNextNumber()
////        }
//
//        (application as RandomApplication).applicationComponent.createMainSubcomponent()
//            .inject(this)
//
//        val viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)
//        viewModel.numberLiveData.observe(
//            this
//        ) {
//            findViewById<TextView>(R.id.activity_main_text_view).text = it.toString()
//        }
//        findViewById<TextView>(R.id.activity_main_button).setOnClickListener {
//            viewModel.generateNextNumber()
//        }

        //13_03
        mainViewModel.numberLiveData.observe(
            this
        ) {
            findViewById<TextView>(R.id.activity_main_text_view).text = it.toString()
        }
        findViewById<TextView>(R.id.activity_main_button).setOnClickListener {
            mainViewModel.generateNextNumber()
        }



    }
}
