package com.example.mvpproject.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductSearchResult {

    @SerializedName("products")
    public List<Product> products;

    public ProductSearchResult() {
    }

    public ProductSearchResult(List<Product> products) {
        this.products = products;
    }
}