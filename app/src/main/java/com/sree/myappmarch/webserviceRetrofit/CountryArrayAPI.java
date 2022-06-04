package com.sree.myappmarch.webserviceRetrofit;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CountryArrayAPI {

    /* @GET url is after Base_URL.
       We are going to get List of country as response.
    */
    @GET("/arpitmandliya/AndroidRestJSONExample/master/countries.json")
    public Call<List<Country>> getCountries();
}