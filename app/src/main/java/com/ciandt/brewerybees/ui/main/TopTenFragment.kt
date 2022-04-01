package com.ciandt.brewerybees.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ciandt.brewerybees.data.model.faketop10
import com.ciandt.brewerybees.databinding.FragmentTopTenBinding


class TopTenFragment : Fragment() {

    private var _binding: FragmentTopTenBinding ? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {


        // Inflate the layout for this fragment
        _binding = FragmentTopTenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = TopTenAdapter(faketop10())
        val recyclerView = binding.topTenRecycler
        recyclerView.adapter = adapter
        //val recyclerView = view.findViewById<RecyclerView>(R.id.topDezRecycler)
        //recyclerView.adapter = adapter

    }






}