package com.example.catalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO:
        //  Skonfiguruj listę atrakcji i jej adapter,
        //  uwzględniając obsługę wyboru elementu.
    }

    private fun openDetails(attraction: Attraction) {
        // TODO:
        //  Zaimplementuj przejście do ekranu szczegółów
        //  z przekazaniem identyfikatora wybranej atrakcji.
    }

    companion object {
        const val TAG = "attraction_list"
    }
}
