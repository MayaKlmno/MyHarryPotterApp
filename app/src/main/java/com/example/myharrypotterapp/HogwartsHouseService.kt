package com.example.myharrypotterapp

import retrofit2.Call
import retrofit2.http.GET

interface HogwartsHouseService {
    // the argument for the get annotation is what comes after the base URL
    // and the rest is the path to the endpoint
    @GET("Houses")
    fun getHogwartsHouseData(): Call<List<House>>
        //TODO: make the .json folder similar to the .quakes.json folder
        //TODO: make the "type": "FeatureCollection",
}