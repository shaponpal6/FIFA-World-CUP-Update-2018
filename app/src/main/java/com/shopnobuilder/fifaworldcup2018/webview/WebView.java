package com.shopnobuilder.fifaworldcup2018.webview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.shopnobuilder.fifaworldcup2018.R;

/**
 * Created by SHOPNOBUILDER on 5/26/2018.
 */

public class WebView extends Fragment {
    WebView myWebView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.webview, container, false);

        return v;
    }
}
