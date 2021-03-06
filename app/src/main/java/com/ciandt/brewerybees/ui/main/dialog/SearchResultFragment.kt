package com.ciandt.brewerybees.ui.main.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ciandt.brewerybees.R
import com.ciandt.brewerybees.databinding.FragmentSearchResultBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchResultFragment : Fragment() {

   private var _binding: FragmentSearchResultBinding? = null
   private val binding get() = _binding!!
   private val viewModel: SearchResultViewModel by viewModel()


   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
   }

   override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?,
   ): View? {
      _binding = FragmentSearchResultBinding.inflate(inflater, container, false)
      return binding.root
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)
      val bundle = this.arguments

      viewModel.searchListLiveData.observe(this.viewLifecycleOwner) { list ->
         binding.recyclerSearchResult.adapter = SearchResultAdapter(list)
      }
      bundle?.getString("searchCity").toString().apply {
         viewModel.getSearchList(this)
      }
   }


}