package com.greenfrvr.hashtagview.sample.fragments;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenfrvr.hashtagview.sample.R;
import com.greenfrvr.hashtagview.sample.RecyclerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;

/**
 * Created by pincopallino93
 */
public class RecyclerViewFragment extends BaseFragment {

    protected @Bind(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recyclerview_sample, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // use a linear layout manager
        LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        List<List<String>> list = new ArrayList<>();
        list.add(PEOPLE);
        list.add(DATA);
        list.add(TAGS);
        list.add(Arrays.asList("alfa", "beta", "gamma", "omega"));
        list.add(new ArrayList<String>());
        list.add(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));
        list.add(Arrays.asList("a", "b", "c", "d"));
        list.add(Arrays.asList("cane", "gatto"));
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(Arrays.asList("5452", "5996", "9293", "1212"));
        list.add(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));

        // specify an adapter (see also next example)
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(recyclerAdapter);

    }
}