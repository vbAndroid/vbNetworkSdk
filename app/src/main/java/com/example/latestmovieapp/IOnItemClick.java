package com.example.latestmovieapp;

import android.view.View;

/**
 * Created by ashishsingh on 01/12/17.
 */

public interface IOnItemClick<T> {
    void OnItemClick(T t, int index);

    default void OnItemClick(int position) {
    }

    default boolean OnLongClick(T t, View v) {
        return false;
    }

    default void refreshCommensCount(int position, String status) {
    }

    default void selectedBrandID(String id, int position) {

    }

    default void giveDealerImageUrlAndName(String url, String name) {
    }

}
