package com.shopnobuilder.fifaworldcup2018.matches;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shopnobuilder.fifaworldcup2018.R;

/**
 * Created by SHOPNOBUILDER on 5/18/2018.
 */

public class Matches extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.matches, container, false);

        return rootView;
    }
}
