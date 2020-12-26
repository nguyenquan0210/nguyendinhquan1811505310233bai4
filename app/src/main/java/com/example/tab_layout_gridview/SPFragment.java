package com.example.tab_layout_gridview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class SPFragment extends Fragment {
    private GridView gv_sp;
    private SanPhamAdapter spadt;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View r = inflater.inflate(R.layout.frament_sp, container, false);
        gv_sp=r.findViewById(R.id.gridviewSP);
        spadt=new SanPhamAdapter(SPFragment.this.getActivity(), R.layout.item);
        gv_sp.setAdapter(spadt);
        registerForContextMenu(gv_sp);
        spDATA();
        return r;

    }

    private void spDATA() {
        spadt.add(new sanpham(R.drawable.tb1,"san pham 1"));
        spadt.add(new sanpham(R.drawable.tb2,"san pham 2"));
        spadt.add(new sanpham(R.drawable.tb3,"san pham 3"));
        spadt.add(new sanpham(R.drawable.tb4,"san pham 4"));
        spadt.add(new sanpham(R.drawable.tb5,"san pham 5"));
        spadt.add(new sanpham(R.drawable.tb6,"san pham 6"));
        spadt.add(new sanpham(R.drawable.tb1,"san pham 7"));
        spadt.add(new sanpham(R.drawable.tb2,"san pham 8"));

    }
}
