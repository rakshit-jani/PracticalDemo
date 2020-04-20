package com.practicaldemo.api;

import com.practicaldemo.model.SearchByDateModel;
import com.practicaldemo.paging.SearchByDayPaging;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APICallingInterface {

    @GET("search_by_date")
    Call<SearchByDateModel> getStory(@Query("tags") String tags, @Query("page") String page);

}
