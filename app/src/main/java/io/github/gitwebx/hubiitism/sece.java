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
public class sece extends Fragment {


    public sece() {
        // Required empty public constructor
    }

    ImageView imageView;
    PhotoViewAttacher mAttacher;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewe=inflater.inflate(R.layout.fragment_sece, container, false);
        ImageView imageview=(ImageView)viewe.findViewById(R.id.seceimgview);
        mAttacher = new PhotoViewAttacher(imageview);
        return viewe;
    }

}
