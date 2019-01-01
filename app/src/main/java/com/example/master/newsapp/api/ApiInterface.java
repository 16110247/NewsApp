package com.example.master.newsapp.api;

import com.example.master.newsapp.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Master on 29-Dec-18.
 */

public interface ApiInterface {
    @GET ("top-headlines")
    Call<News> getNews(
                @Query("country") String country ,
                @Query("apiKey") String apiKey
    );

    @GET ("everything")
    Call<News> getMewsSearch(
            @Query("q") String keyword,
            @Query("language") String language,
            @Query("sortBy") String sortBy,
            @Query("apiKey") String apiKey
    );


}
