package com.example.mvpproject.model;

import java.util.List;

public class ProductSearchResult {
    public List<Product> products;

    public ProductSearchResult() {
    }

    public ProductSearchResult(List<Product> products) {
        this.products = products;
    }
}