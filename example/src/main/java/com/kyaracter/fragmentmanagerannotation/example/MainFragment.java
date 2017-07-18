package com.kyaracter.fragmentmanagerannotation.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kyaracter.fragmentmanagerannotation.annotation.SupportChildFragmentManager;

@SupportChildFragmentManager
public class MainFragment extends Fragment {

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(com.kyaracter.fragmentmanagerannotation.example.R.layout.fragment_main, container, false);
    }
}
