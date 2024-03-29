package com.example.mvpproject.data;

import com.example.mvpproject.data.model.ProductSearchResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitServiceImpl implements FetchDataService {

    private RetrofitEndpoint mRetrofitEndpoint;

    public RetrofitServiceImpl() {
        mRetrofitEndpoint = RetrofitClient.getClient().create(RetrofitEndpoint.class);
    }

    @Override
    public void getProducts(final FetchDataCallback<ProductSearchResult> callback) {
        Call<ProductSearchResult> callProduct = mRetrofitEndpoint.query();
        callProduct.enqueue(new Callback<ProductSearchResult>() {
            @Override
            public void onResponse(Call<ProductSearchResult> call, Response<ProductSearchResult> response) {
                if (response.code() == 200) {
                    ProductSearchResult searchResult = response.body();
                    callback.onLoaded(searchResult);
                }
            }

            @Override
            public void onFailure(Call<ProductSearchResult> call, Throwable t) {
                callback.onLoaded(null);
            }
        });
    }
}
