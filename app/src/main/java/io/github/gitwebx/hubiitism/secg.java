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
public class secg extends Fragment {


    public secg() {
        // Required empty public constructor
    }

    ImageView imageView;
    PhotoViewAttacher mAttacher;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewg=inflater.inflate(R.layout.fragment_secg, container, false);
        ImageView imageview=(ImageView)viewg.findViewById(R.id.secgimgview);
        mAttacher = new PhotoViewAttacher(imageview);
        return viewg;
    }

}
