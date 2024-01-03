package com.example.dating;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LikesAdapter extends ArrayAdapter<LikesModel> {

    private ArrayList<LikesModel> matchesArrayList;
    private Context context;

    public LikesAdapter(@NonNull Context context, ArrayList<LikesModel> matchesArrayList) {
        super(context, R.layout.item_layout, matchesArrayList);
        this.matchesArrayList= matchesArrayList;
        this.context = context;
    }

    private static class MyViewHolder {
        public ImageView matchesImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LikesModel dataModel = matchesArrayList.get(position);

        MyViewHolder myViewHolder;
        final View result;

        if ( convertView == null ) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_layout, parent, false);

            myViewHolder.matchesImg = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);
            result = convertView;
        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        myViewHolder.matchesImg.setImageResource(dataModel.getMatchImage());

        return result;
    }
}
