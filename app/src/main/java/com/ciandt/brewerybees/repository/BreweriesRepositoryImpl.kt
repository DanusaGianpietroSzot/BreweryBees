package com.ciandt.brewerybees.repository

import com.ciandt.brewerybees.model.BreweriesModel
import com.ciandt.brewerybees.networking.BreweryApiServices
import com.skydoves.sandwich.onError
import com.skydoves.sandwich.onException
import com.skydoves.sandwich.onSuccess

class BreweriesRepositoryImpl(private val service: BreweryApiServices) : BreweriesRepository {

   override suspend fun breweriesSearch(search: String): List<BreweriesModel> {

      val responseSearch = service.breweriesSearch(search)
      var data: List<BreweriesModel>? = listOf<BreweriesModel>()

//      responseSearch
//         .onSuccess {
//            data = this.data
//         }.onError {
//            data = listOf<BreweriesModel>()
//         }.onException {
//            data = listOf<BreweriesModel>()
//         }

      return responseSearch
   }

}