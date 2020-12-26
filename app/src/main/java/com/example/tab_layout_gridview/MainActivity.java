package com.example.tab_layout_gridview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;




public class MainActivity extends AppCompatActivity {

    private ActionBar toobar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toobar= getSupportActionBar();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFragment(new Trangchu());
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener(){
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment;
        switch (item.getItemId()){
            case R.id.nav_home:
                fragment = new Trangchu();
                loadFragment(fragment);
                return true;
            case R.id.nav_donhang:
                fragment = new Trangchu();
                loadFragment(fragment);
                return true;
            case R.id.nav_thietbi:
                fragment = new Trangchu();
                loadFragment(fragment);
                return true;
            case R.id.nav_thongbao:
                fragment = new Trangchu();
                loadFragment(fragment);
                return true;
            case R.id.hnav_taikhoan:
                fragment = new Trangchu();
                loadFragment(fragment);
                return true;
        }
        return false;
    }

};
    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}