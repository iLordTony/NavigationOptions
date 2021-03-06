package com.ilordtony.navigationoptions.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ilordtony.navigationoptions.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public FirstFragment() {
        // Required empty public constructor
    }
    public static FirstFragment newInstance(int sectionNumber) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
        return rootView;
    }


}
