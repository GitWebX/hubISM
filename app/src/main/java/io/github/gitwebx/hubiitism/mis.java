package io.github.gitwebx.hubiitism;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class mis extends Fragment {
    WebView v;

    public mis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mis=inflater.inflate(R.layout.fragment_mis, container, false);
        v=(WebView)mis.findViewById(R.id.dd);
        v.getSettings().setLoadsImagesAutomatically(true);
        v.getSettings().setJavaScriptEnabled(true);
        v.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        v.loadUrl("https://172.16.8.45");
        return mis;
    }

}
