package com.gbagd24.bookexercise_ch11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class SplitFragmentTwo : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_split_two, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView> (R.id.fragment_split_two_text_view).text = getString(R.string.total, 0)
        //val totalsViewModel = ViewModelProvider(this) .get(TotalsViewModel::class.java)
        val totalsViewModel = ViewModelProvider(requireActivity()) .get(TotalsViewModel::class.java)
        updateText(totalsViewModel.total)
    }
    private fun updateText(total: Int) {
        view?.findViewById<TextView> (R.id. fragment_split_two_text_view)?.text = getString(R.string.total, total)
    }

}
