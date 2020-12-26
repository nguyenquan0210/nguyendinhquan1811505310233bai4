package com.example.tab_layout_gridview;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;


public class SanPhamAdapter extends ArrayAdapter<sanpham> {
    Activity context;
    int resource;
    public SanPhamAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context= context;
        this.resource=resource;
    }
}
