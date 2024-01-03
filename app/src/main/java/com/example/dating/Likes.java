package com.example.dating;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class Likes extends Fragment {

    private ArrayList<LikesModel> dataModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_likes, container, false);

        GridView gridView = view.findViewById(R.id.gridView);

        dataModels = new ArrayList<>();

        LikesModel likes1 = new LikesModel(R.drawable.image1);
        LikesModel likes2 = new LikesModel(R.drawable.image2);
        LikesModel likes3 = new LikesModel(R.drawable.image3);
        LikesModel likes4 = new LikesModel(R.drawable.image4);

        dataModels.add(likes1);
        dataModels.add(likes2);
        dataModels.add(likes3);
        dataModels.add(likes4);

        LikesAdapter adapter = new LikesAdapter(getContext(), dataModels);
        gridView.setNumColumns(2);
        gridView.setAdapter(adapter);

        return view;
    }
}