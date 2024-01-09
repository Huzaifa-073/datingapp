package com.example.dating;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Likes extends Fragment {
    private ArrayList<LikesModel> dataModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_likes, container, false);

        GridView gridView = view.findViewById(R.id.gridView);
        dataModels = new ArrayList<>();

        LikesModel likes1 = new LikesModel(R.drawable.one, "Leilani, 19", R.drawable.crossvec, R.drawable.likevec);
        LikesModel likes2 = new LikesModel(R.drawable.two, "Annabelle, 20", R.drawable.crossvec, R.drawable.likevec);
        LikesModel likes3 = new LikesModel(R.drawable.three, "Reagon, 25", R.drawable.crossvec, R.drawable.likevec);
        LikesModel likes4 = new LikesModel(R.drawable.four, "Hadley, 24", R.drawable.crossvec, R.drawable.likevec);

        dataModels.add(likes1);
        dataModels.add(likes2);
        dataModels.add(likes3);
        dataModels.add(likes4);

        LikesAdapter adapter = new LikesAdapter(getContext(), dataModels);
        gridView.setNumColumns(2);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        return view;
    }
}
