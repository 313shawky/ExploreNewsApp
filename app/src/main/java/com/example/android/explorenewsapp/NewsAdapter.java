package com.example.android.explorenewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(@NonNull Context context, @NonNull List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        News currentNews = getItem(position);
        TextView titleTextView = convertView.findViewById(R.id.title);
        titleTextView.setText(currentNews.getTitle());
        TextView sectionTextView = convertView.findViewById(R.id.section);
        sectionTextView.setText(currentNews.getSection());
        TextView dateTextView = convertView.findViewById(R.id.date);
        dateTextView.setText(currentNews.getDate());
        return convertView;
    }
}