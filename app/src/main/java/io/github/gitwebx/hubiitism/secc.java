package io.github.gitwebx.hubiitism;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;


/**
 * A simple {@link Fragment} subclass.
 */
public class secc extends Fragment {


    public secc() {
        // Required empty public constructor
    }

    ImageView imageView;
    PhotoViewAttacher mAttacher;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewc=inflater.inflate(R.layout.fragment_secc, container, false);
        ImageView imageview=(ImageView)viewc.findViewById(R.id.seccimgview);
        mAttacher = new PhotoViewAttacher(imageview);
        return viewc;
    }

}
