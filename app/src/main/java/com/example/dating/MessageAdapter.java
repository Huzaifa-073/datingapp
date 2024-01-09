package com.example.dating;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.viewHolder> {
    private MessageClickListener clickListener;
    private ArrayList<MessagesModel> dataModel;

    public MessageAdapter(ArrayList<MessagesModel> dataModel) {
        this.dataModel = dataModel;
    }

    public void setClickListener(MessageClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void updateList(List<MessagesModel> filteredList) {
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView personImage;
        private TextView personName;
        private TextView personMessage;
        private TextView personTime;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            this.personImage = itemView.findViewById(R.id.image);
            this.personName = itemView.findViewById(R.id.name);
            this.personMessage = itemView.findViewById(R.id.message);
            this.personTime = itemView.findViewById(R.id.time);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null) {
                clickListener.onClick(view, getAdapterPosition());
            }
        }
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItems = LayoutInflater.from(parent.getContext()).inflate(R.layout.messages_layout, parent, false);
        return new viewHolder(listItems);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        MessagesModel messagesModel = dataModel.get(position);
        holder.personImage.setImageResource(messagesModel.getPersonImage());
        holder.personName.setText(messagesModel.getPersonName());
        holder.personMessage.setText(messagesModel.getPersonMessage());
        holder.personTime.setText(messagesModel.getPersonTime());
    }

    @Override
    public int getItemCount() {
        return dataModel.size();
    }
}