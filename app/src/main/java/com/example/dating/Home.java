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

    ImageView backImg, filterImg, mainImg, dislikeImg, likeImg, starImg, img1, img2, img3, img4;
    TextView discoverText, placeText, matchText, conversationText;
    Button helloBtn, swipeBtn;
    CardView cvOne, cvTwo, cvThree, cvFour;
    FrameLayout fl1, fl2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        backImg = view.findViewById(R.id.backImage);
        filterImg = view.findViewById(R.id.filterImage);
        mainImg = view.findViewById(R.id.mainPhoto);
        dislikeImg = view.findViewById(R.id.dislikeImage);
        likeImg = view.findViewById(R.id.likeImage);
        starImg = view.findViewById(R.id.starImage);
        img1 = view.findViewById(R.id.img1);
        img2 = view.findViewById(R.id.img2);
        img3 = view.findViewById(R.id.img3);
        img4 = view.findViewById(R.id.img4);
        discoverText = view.findViewById(R.id.discoverText);
        placeText = view.findViewById(R.id.placeText);
        swipeBtn = view.findViewById(R.id.swipeButton);
        matchText = view.findViewById(R.id.matchText);
        conversationText = view.findViewById(R.id.convoText);
        helloBtn = view.findViewById(R.id.helloButton);
        cvFour = view.findViewById(R.id.cvFour);
        cvOne = view.findViewById(R.id.cvOne);
        cvTwo = view.findViewById(R.id.cvTwo);
        cvThree = view.findViewById(R.id.cvThree);
        fl1 = view.findViewById(R.id.fl1);
        fl2 = view.findViewById(R.id.fl2);

        likeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backImg.setVisibility(View.INVISIBLE);
                filterImg.setVisibility(View.INVISIBLE);
                discoverText.setVisibility(View.INVISIBLE);
                placeText.setVisibility(View.INVISIBLE);
                mainImg.setVisibility(View.INVISIBLE);
                dislikeImg.setVisibility(View.INVISIBLE);
                likeImg.setVisibility(View.INVISIBLE);
                starImg.setVisibility(View.INVISIBLE);
                fl1.setVisibility(View.VISIBLE);
                fl2.setVisibility(View.VISIBLE);
                cvOne.setVisibility(View.VISIBLE);
                cvThree.setVisibility(View.VISIBLE);
                cvTwo.setVisibility(View.VISIBLE);
                cvFour.setVisibility(View.VISIBLE);
                img1.setVisibility(View.VISIBLE);
                img2.setVisibility(View.VISIBLE);
                img3.setVisibility(View.VISIBLE);
                img4.setVisibility(View.VISIBLE);
                matchText.setVisibility(View.VISIBLE);
                conversationText.setVisibility(View.VISIBLE);
                swipeBtn.setVisibility(View.VISIBLE);
                helloBtn.setVisibility(View.VISIBLE);
            }
        });

        swipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backImg.setVisibility(View.VISIBLE);
                filterImg.setVisibility(View.VISIBLE);
                discoverText.setVisibility(View.VISIBLE);
                placeText.setVisibility(View.VISIBLE);
                mainImg.setVisibility(View.VISIBLE);
                dislikeImg.setVisibility(View.VISIBLE);
                likeImg.setVisibility(View.VISIBLE);
                starImg.setVisibility(View.VISIBLE);
                fl1.setVisibility(View.INVISIBLE);
                fl2.setVisibility(View.INVISIBLE);
                cvOne.setVisibility(View.INVISIBLE);
                cvThree.setVisibility(View.INVISIBLE);
                cvTwo.setVisibility(View.INVISIBLE);
                cvFour.setVisibility(View.INVISIBLE);
                img1.setVisibility(View.INVISIBLE);
                img2.setVisibility(View.INVISIBLE);
                img3.setVisibility(View.INVISIBLE);
                img4.setVisibility(View.INVISIBLE);
                matchText.setVisibility(View.INVISIBLE);
                conversationText.setVisibility(View.INVISIBLE);
                swipeBtn.setVisibility(View.INVISIBLE);
                helloBtn.setVisibility(View.INVISIBLE);
            }
        });

        return view;

    }
}