package com.example.mvpproject.data;

import com.example.mvpproject.data.model.ProductSearchResult;

public interface FetchDataService {

    interface FetchDataCallback<T> {
        void onLoaded(T data);
    }

    void getProducts(FetchDataCallback<ProductSearchResult> callback);
}
