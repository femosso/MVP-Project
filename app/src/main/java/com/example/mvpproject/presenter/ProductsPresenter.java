package com.example.mvpproject.presenter;

import com.example.mvpproject.data.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsPresenter implements ProductsContract.Actions {

    public ProductsContract.View mProductsView;

    public ProductsPresenter(ProductsContract.View productsView) {
        mProductsView = productsView;
    }

    @Override
    public void loadProducts() {
        mProductsView.setLoading(true);
        Product product = new Product();
        product.name = "skol";

        List<Product> productList = new ArrayList<>();
        productList.add(product);

        mProductsView.showProducts(productList);
        mProductsView.setLoading(false);
    }

    @Override
    public void openProduct() {

    }
}
