package com.amarpreetsinghprojects.newproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kulvi on 06/19/17.
 */

public class FragmentB extends Fragment {

    public static FragmentB newInstance(int count) {

        Bundle args = new Bundle();
        args.putInt("count",count);
        FragmentB fragment = new FragmentB();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_b,container,false);
        ((TextView)v.findViewById(R.id.fragment_B_textView)).setText(""+getArguments().getInt("count"));

        return v;
    }
}
