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
public class calendar extends Fragment {


    public calendar() {
        // Required empty public constructor
    }
    ImageView imageView;
    PhotoViewAttacher mAttacher;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View cal=inflater.inflate(R.layout.fragment_calendar, container, false);
        ImageView imageview=(ImageView)cal.findViewById(R.id.calendar);
        mAttacher = new PhotoViewAttacher(imageview);
        return cal;
    }

}
