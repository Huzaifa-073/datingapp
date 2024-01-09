package com.example.dating;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends Fragment {
    ImageView backImg, filterImg, mainImg, dislikeImg, likeImg, starImg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        backImg = view.findViewById(R.id.backImage);
        filterImg = view.findViewById(R.id.filterImage);
        mainImg = view.findViewById(R.id.mainPhoto);
        dislikeImg = view.findViewById(R.id.dislikeImage);
        likeImg = view.findViewById(R.id.likeImage);
        starImg = view.findViewById(R.id.starImage);

        return view;

    }
}