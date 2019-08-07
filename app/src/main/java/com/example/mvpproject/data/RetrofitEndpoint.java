package com.example.mvpproject.data;

import com.example.mvpproject.data.model.ProductSearchResult;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitEndpoint {
    @GET("femosso/products-dataset/master/data.txt")
    Call<ProductSearchResult> query();
}