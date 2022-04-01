package com.ciandt.brewerybees.networking

import com.ciandt.brewerybees.model.BreweriesModel
import com.ciandt.brewerybees.model.PhotosItemModel
import com.ciandt.brewerybees.model.RateModal
import com.skydoves.sandwich.ApiResponse
import retrofit2.Response
import retrofit2.http.*

interface BreweryApiServices {

   @GET("/breweries")
   suspend fun breweriesSearch(@Query(value = "by_city", encoded = true) by_city: String): List<BreweriesModel>

   @GET("/breweries/{breweryId}")
   suspend fun breweriesSearchForId(
      @Query(value = "breweryId", encoded = true) breweryId:String
   ):Response<BreweriesModel>


   @GET("/breweries/topTen")
   suspend fun breweriesSearchTopTen():List<BreweriesModel>

   @GET("/breweries/photos/{breweryId}")
   suspend fun breweriesSearchPhotosForId(
      @Query(value = "breweryId", encoded = true) breweryId: String
   ):List<PhotosItemModel>

   @Multipart
   @POST("/breweries/photos/upload")
   suspend fun breweriesPhotosUpload(
      @Query(value = "brewery_id", encoded = true) brewery_id:String
   ):List<RateModal>

   @DELETE("/breweries/photos/{id}")
   suspend fun breweriesDeletePhoto(
      @Query(value = "id", encoded = true) id:String
   )


}
