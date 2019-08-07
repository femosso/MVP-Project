package com.example.mvpproject.presenter;

public class ProductsPresenter implements ProductsContract.Actions {

    public ProductsContract.View mProductsView;

    public ProductsPresenter(ProductsContract.View productsView) {
        mProductsView = productsView;
    }
}
