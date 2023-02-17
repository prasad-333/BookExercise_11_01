package com.gbagd24.bookexercise_ch11.exercise_12_01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gbagd24.bookexercise_ch11.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12_01)
        val preferenceWrapper = (application as PreferenceApplication).preferenceWrapper
        val preferenceViewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {

            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return PreferenceViewModel(preferenceWrapper) as T
            }

//            override fun <T : ViewModel> create(modelClass: Class<T>): T {
//                return PreferenceViewModel(preferenceWrapper) as T
//            }
        }).get(PreferenceViewModel::class.java)
        preferenceViewModel.getText().observe(this, Observer {
            findViewById<TextView>(R.id.activity_main_text_view) .text = it
        })
        findViewById<Button>(R.id.activity_main_button) .setOnClickListener {
            preferenceViewModel.saveText(findViewById<EditText> (R.id.activity_main_edit_text).text.toString())
        }
    }

}
