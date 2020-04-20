package com.practicaldemo.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APICallingInterface {

    @GET("search_by_date")
    Call<Object> getUsers(@Query("tags") int tags, @Query("page") int page);

}
