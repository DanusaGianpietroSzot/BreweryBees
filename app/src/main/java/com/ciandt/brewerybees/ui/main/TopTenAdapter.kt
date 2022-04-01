package com.ciandt.brewerybees.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.ciandt.brewerybees.R
import com.ciandt.brewerybees.data.model.Top10


class TopTenAdapter(val top10s: MutableList<Top10>) : Adapter<TopTenAdapter.TopDezViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopDezViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.top_ten_layout, parent, false)
        return TopDezViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopDezViewHolder, position: Int) {
        holder.bind(top10s[position])
    }

    override fun getItemCount(): Int = top10s.size

    inner class TopDezViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(top10: Top10) {
            with(top10){
                itemView.findViewById<TextView>(R.id.brewery_name)
                itemView.findViewById<TextView>(R.id.brewery_rate)
                itemView.findViewById<TextView>(R.id.brewery_type_text)
                itemView.findViewById<TextView>(R.id.brewery_distance_txt)
            }
        }
    }

}

