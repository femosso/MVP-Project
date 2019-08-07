package com.example.mvpproject.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.mvpproject.R;
import com.example.mvpproject.data.model.Product;
import com.example.mvpproject.presenter.ProductsContract;
import com.example.mvpproject.presenter.ProductsPresenter;

import java.util.ArrayList;
import java.util.List;

public class ProductsFragment extends Fragment implements ProductsContract.View {

    private ProductsContract.Actions mActionsListener;
    private ProductsAdapter mListAdapter;

    public static ProductsFragment newInstance() {
        return new ProductsFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActionsListener = new ProductsPresenter(this);
        mListAdapter = new ProductsAdapter(new ArrayList<Product>(0));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.products_fragment, container, false);

        int numColumns = 1;

        RecyclerView recyclerView = root.findViewById(R.id.filmes_list);
        recyclerView.setAdapter(mListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numColumns));

        return root;
    }

    private static class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

        private List<Product> mList;

        public ProductsAdapter(List<Product> products) {
            mList = products;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView productThumbnail;
            public TextView productTitle;

            public ViewHolder(View itemView) {
                super(itemView);
                productThumbnail = itemView.findViewById(R.id.product_title);
                productTitle = itemView.findViewById(R.id.product_thumbnail);
            }

            @Override
            public void onClick(View view) {
                SwipeRefreshLayout swipeRefreshLayout;

            }
        }
    }
}
