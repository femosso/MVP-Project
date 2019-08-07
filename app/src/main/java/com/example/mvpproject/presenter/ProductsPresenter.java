package com.example.mvpproject.presenter;

import com.example.mvpproject.data.FetchDataService;
import com.example.mvpproject.data.model.Product;
import com.example.mvpproject.data.model.ProductSearchResult;

public class ProductsPresenter implements ProductsContract.Actions {

    private ProductsContract.View mProductsView;
    private FetchDataService mFetchDataService;

    public ProductsPresenter(ProductsContract.View productsView, FetchDataService fetchDataService) {
        mProductsView = productsView;
        mFetchDataService = fetchDataService;
    }

    @Override
    public void loadProducts() {
        mProductsView.setLoading(true);
        mFetchDataService.getProducts(new FetchDataService.FetchDataCallback<ProductSearchResult>() {
            @Override
            public void onLoaded(ProductSearchResult data) {
                mProductsView.setLoading(false);
                mProductsView.showProducts(data.products);
            }
        });
    }

    @Override
    public void openProduct(Product product) {
        mProductsView.showProduct(product);
    }
}
