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

public class FragmentA extends Fragment {

    public static FragmentA newInstance(int count) {

        Bundle args = new Bundle();
        args.putInt("count",count);
        FragmentA fragment = new FragmentA();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_a,container,false);
        Bundle b = getArguments();
        int count = b.getInt("count");
        TextView textview = (TextView)v.findViewById(R.id.fragment_A_textView);
        textview.setText(""+count);
        return v;

    }
}
