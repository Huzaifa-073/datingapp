package com.example.dating;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class Messages extends Fragment implements MessageClickListener {

    private ArrayList<MessagesModel> dataModels;
    private SearchView searchView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_messages, container, false);
        searchView = view.findViewById(R.id.searchView);

        dataModels = new ArrayList<>();
        dataModels.add(new MessagesModel(R.drawable.girl, "Olivia", "Typing...", "22 min"));
        dataModels.add(new MessagesModel(R.drawable.girl2, "Emma", "Hey, How are you?", "17 min"));
        dataModels.add(new MessagesModel(R.drawable.girl3, "Ava", "What's up?", "35 min"));
        dataModels.add(new MessagesModel(R.drawable.girl4, "Sophia", "You: How was your day?", "30 min"));
        dataModels.add(new MessagesModel(R.drawable.girl5, "Amelia", "When are we meeting?", "48 min"));
        dataModels.add(new MessagesModel(R.drawable.girl6, "Isabella", "Let's catch up soon!", "20 min"));
        dataModels.add(new MessagesModel(R.drawable.girl7, "Mia", "You: Hey!", "50 min"));
        dataModels.add(new MessagesModel(R.drawable.girl8, "Harper", "Good night!", "10 min"));
        dataModels.add(new MessagesModel(R.drawable.girl9, "Evelyn", "You: LOL, that's hilarious!", "5 min"));
        dataModels.add(new MessagesModel(R.drawable.girl10, "Abigail", "Can you send me the details?", "40 min"));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        MessageAdapter adapter = new MessageAdapter(dataModels);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this::onClick);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), R.drawable.divider);
        recyclerView.addItemDecoration(dividerItemDecoration);

        return view;
    }

    @Override
    public void onClick(View view, int pos) {

        String name = dataModels.get(pos).getPersonName();
        int image = dataModels.get(pos).getPersonImage();

        Intent intent = new Intent(getActivity(), ChatActivity.class);
        intent.putExtra("NAME_KEY", name);
        intent.putExtra("IMAGE_KEY", image);
        startActivity(intent);

    }
}