package com.example.mvpproject;

import com.example.mvpproject.data.FetchDataService;
import com.example.mvpproject.data.model.ProductSearchResult;

public class FakeFetchDataServiceImpl implements FetchDataService {
    @Override
    public void getProducts(FetchDataCallback<ProductSearchResult> callback) {
        callback.onLoaded(new ProductSearchResult());
    }
}
