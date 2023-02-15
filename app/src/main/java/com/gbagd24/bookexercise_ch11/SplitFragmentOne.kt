package com.gbagd24.bookexercise_ch11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class SplitFragmentOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_split_one, container, false)
    }

    //exercise_11_01
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        view.findViewById<TextView> (R.id.fragment_split_one_text_view).text = getString(R.string.total, 0)
//        prepareViewModel()
//    }
//
//    private fun prepareViewModel() {
//        //val totalsViewModel = ViewModelProvider(this)[TotalsViewModel::class.java]
//        val totalsViewModel = ViewModelProvider(requireActivity()) .get(TotalsViewModel::class.java)
//        updateText(totalsViewModel.total)
//        view?.findViewById<Button> (R.id.fragment_split_one_button)?.setOnClickListener {
//            updateText(totalsViewModel.increaseTotal())
//        }
//
//    }
//    private fun updateText(total: Int) {
//        view?.findViewById<TextView> (R.id.fragment_split_one_text_view)?.text = getString(R.string.total, total)
//    }



    //exercise_11_02
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val totalsViewModel = ViewModelProvider(requireActivity()).get(TotalsViewModel::class.java)
        totalsViewModel.total.observe(viewLifecycleOwner) {
            updateText(it)
        }
        view.findViewById<Button>(R.id.fragment_split_one_button).setOnClickListener {
            totalsViewModel.increaseTotal()
        }
    }


    private fun updateText(total: Int) {
        view?.findViewById<TextView>(R.id.fragment_split_one_text_view)?.text =
            getString(R.string.total, total)
    }


}
