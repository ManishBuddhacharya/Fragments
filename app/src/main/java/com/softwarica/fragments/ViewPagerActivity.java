package com.softwarica.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.ViewPagerAdapter;
import fragments.FirstFragment;
import fragments.SecondFragment;

public class ViewPagerActivity extends AppCompatActivity{
    private ViewPager viewpager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout = findViewById(R.id.tabId);
        viewpager = findViewById(R.id.viewPager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragments(new FirstFragment(),"Sum");
        adapter.addFragments(new SecondFragment(),"Area of Circle");

        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);

    }
}
