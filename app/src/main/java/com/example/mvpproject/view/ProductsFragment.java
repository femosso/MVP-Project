package com.example.mvpproject.view;

import androidx.fragment.app.Fragment;

import com.example.mvpproject.presenter.ProductsContract;

public class ProductsFragment extends Fragment implements ProductsContract.View {

    public static ProductsFragment newInstance() {
        return new ProductsFragment();
    }
}
