package com.example.catalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO:
        //  Odczytaj identyfikator atrakcji z argumentów fragmentu,
        //  pobierz odpowiadające mu dane i wyświetl szczegóły atrakcji.
    }

    companion object {
        const val TAG = "attraction_details"
        const val ARG_ATTRACTION_ID = "attraction_id"
        private const val INVALID_ID = -1

        fun newInstance(attractionId: Int): DetailsFragment {
            val fragment = DetailsFragment()

            // TODO:
            //  Przekaż identyfikator atrakcji do fragmentu
            //  za pomocą argumentów Bundle.

            return fragment
        }
    }
}
