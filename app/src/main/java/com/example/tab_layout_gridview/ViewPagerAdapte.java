package com.example.tab_layout_gridview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapte extends FragmentStatePagerAdapter {


    public ViewPagerAdapte(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new SPFragment();
            case 1: return new SPFragment();
            default:return new SPFragment();
        }
    }
    @Override
    public int getCount() {
        return 2;

    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Sản Phẩm 1";
                break;
            case 1:
                title="Sản Phẩm 2";
                break;
        }
        return title;
    }

}
