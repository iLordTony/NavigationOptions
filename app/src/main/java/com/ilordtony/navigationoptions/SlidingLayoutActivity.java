package com.ilordtony.navigationoptions;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.ilordtony.navigationoptions.adapters.CustomPagerAdapter;
import com.ilordtony.navigationoptions.utils.SlidingTabLayout;

import java.util.ArrayList;


public class SlidingLayoutActivity extends ActionBarActivity {
    ViewPager mViewPager;
    CustomPagerAdapter mSectionsPagerAdapter;
    ArrayList<String> titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_layout);
        titles = new ArrayList<String>();
        titles.add(getString(R.string.title_section1));
        titles.add(getString(R.string.title_section2));
        titles.add(getString(R.string.title_section3));
        mSectionsPagerAdapter = new CustomPagerAdapter(getSupportFragmentManager(), titles, this);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
        // Center the tabs in the layout
        slidingTabLayout.setViewPager(mViewPager);
    }

}
