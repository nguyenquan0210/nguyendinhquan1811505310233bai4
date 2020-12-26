package com.example.tab_layout_gridview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Trangchu extends Fragment {
    private TabLayout mTabLayout_233;
    private ViewPager mViewPager_233;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View r = inflater.inflate(R.layout.fragment_navigation_sp, container, false);


            mTabLayout_233= r.findViewById(R.id.tab_layout);
        mViewPager_233=r.findViewById(R.id.view_pager);
        ViewPagerAdapte viewPagerAdapte = new ViewPagerAdapte(getFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager_233.setAdapter(viewPagerAdapte);
        mTabLayout_233.setupWithViewPager(mViewPager_233);
        return r;
    }
}
