package com.example.dating;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class LikesAdapter extends ArrayAdapter<LikesModel> {
    private ArrayList<LikesModel> matchesArrayList;
    private Context context;

    public LikesAdapter(@NonNull Context context, ArrayList<LikesModel> matchesArrayList) {
        super(context, R.layout.item_layout, matchesArrayList);
        this.matchesArrayList = matchesArrayList;
        this.context = context;
    }

    private static class MyViewHolder {
        public RelativeLayout relativeLayout;
        public ImageView matchesImg;
        public TextView matchNameAge, textView;
        public ImageView crossImage;
        public ImageView likeImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LikesModel dataModel = matchesArrayList.get(position);

        MyViewHolder myViewHolder;
        final View result;

        if (convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_layout, parent, false);

            myViewHolder.matchesImg = convertView.findViewById(R.id.imageView);
            myViewHolder.matchNameAge = convertView.findViewById(R.id.matchNameAge);
            myViewHolder.crossImage = convertView.findViewById(R.id.crossImage);
            myViewHolder.likeImage = convertView.findViewById(R.id.likeImage);
            myViewHolder.relativeLayout = convertView.findViewById(R.id.relativeLayout);

            convertView.setTag(myViewHolder);
            result = convertView;
        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        myViewHolder.matchesImg.setImageResource(dataModel.getMatchImage());
        myViewHolder.matchNameAge.setText(dataModel.getMatchNameAge());
        myViewHolder.crossImage.setImageResource(dataModel.getCrossImage());
        myViewHolder.likeImage.setImageResource(dataModel.getLikeImage());

        myViewHolder.likeImage.setOnClickListener(v -> {
            LikesModel items = getItem(position);

            if (position == 0) {
                LikesModel firstItem = getItem(0);
                if (firstItem != null && firstItem.getLikeImage() == R.drawable.likevec) {
                    Toast.makeText(context, "Liked " + firstItem.getMatchNameAge(), Toast.LENGTH_SHORT).show();
                    myViewHolder.textView.setVisibility(View.INVISIBLE);
                }
            } else if (items != null && items.getLikeImage() == R.drawable.likevec) {
                Toast.makeText(context, "Liked " + items.getMatchNameAge(), Toast.LENGTH_SHORT).show();
            }
        });

        return result;
    }

    @Override
    public LikesModel getItem(int position) {
        return matchesArrayList.get(position);
    }
}