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
    private ViewPager mViewPager;
    private CustomPagerAdapter mSectionsPagerAdapter;
    private ArrayList<String> titles;
    private SlidingTabLayout slidingTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_layout);
        //Los titulos de nuestro nav
        titles = new ArrayList<String>();
        titles.add(getString(R.string.title_section1));
        titles.add(getString(R.string.title_section2));
        titles.add(getString(R.string.title_section3));
        //Creamos el constructor para el sliding segun la documentacion
        mSectionsPagerAdapter = new CustomPagerAdapter(getSupportFragmentManager(), titles, this);
        //Recuperamos el viewpager y le asignamos el adaptador
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tabs);
        slidingTabLayout.setDistributeEvenly(true); //Para que se dividan proporcionalmente los titulos
        //Le damos color a la barra que aparece debajo del titulo seleccionado
        slidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.text_button);
            }
        });
        slidingTabLayout.setViewPager(mViewPager); //Le pasamos nuestro viewpager para crear el nav
    }

}
