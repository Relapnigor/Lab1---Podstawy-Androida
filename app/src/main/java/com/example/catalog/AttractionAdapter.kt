package com.example.catalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AttractionAdapter(
    private val attractions: List<Attraction>,
    private val onAttractionClick: (Attraction) -> Unit
) : RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttractionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_attraction, parent, false)
        return AttractionViewHolder(view, onAttractionClick)
    }

    override fun onBindViewHolder(holder: AttractionViewHolder, position: Int) {
        holder.bind(attractions[position])
    }

    override fun getItemCount(): Int = attractions.size

    class AttractionViewHolder(
        itemView: View,
        private val onAttractionClick: (Attraction) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(attraction: Attraction) {
            // TODO:
            //  Wyświetl informacje o atrakcji w odpowiednich widokach
            //  i obsłuż kliknięcie elementu listy, przekazując wybraną atrakcję
            //  do funkcji onAttractionClick.
        }
    }
}
