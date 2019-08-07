package com.example.mvpproject.data;

public interface FetchDataContract {

    interface FetchDataCallback<T> {
        void onLoaded(T data);
    }
}
