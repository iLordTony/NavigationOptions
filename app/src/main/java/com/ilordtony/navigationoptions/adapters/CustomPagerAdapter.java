package com.ilordtony.navigationoptions.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ilordtony.navigationoptions.R;
import com.ilordtony.navigationoptions.fragments.FirstFragment;

import java.util.ArrayList;

/**
 * Created by USER on 23/03/2015.
 */
public class CustomPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<String> titles;
    public CustomPagerAdapter(FragmentManager fm, ArrayList<String> titles) {
        super(fm);
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return FirstFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
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
