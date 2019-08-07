package com.example.mvpproject.presenter;

import com.example.mvpproject.data.model.Product;

import java.util.List;

public interface ProductsContract {

    interface View {
        void showProducts(List<Product> productList);
        void setLoading(boolean active);
        void showProduct(Product product);
    }

    interface Actions {
        void loadProducts();
        void openProduct(Product product);
    }
}
