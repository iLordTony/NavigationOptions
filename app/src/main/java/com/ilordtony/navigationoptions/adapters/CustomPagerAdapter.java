package com.ilordtony.navigationoptions.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ilordtony.navigationoptions.fragments.FirstFragment;
import com.ilordtony.navigationoptions.fragments.SecondFragment;
import com.ilordtony.navigationoptions.fragments.ThirdFragment;

import java.util.ArrayList;

/**
 * Created by USER on 23/03/2015.
 */
public class CustomPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<String> titles;
    Fragment[] fragments;
    public CustomPagerAdapter(FragmentManager fm, ArrayList<String> titles) {
        super(fm);
        fragments = new Fragment[]{
                new FirstFragment(),
                new SecondFragment(),
                new ThirdFragment()
        };
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return fragments[position];
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return titles.get(position);
            case 1:
                return titles.get(position);
            case 2:
                return titles.get(position);
        }
        return null;
    }
}
