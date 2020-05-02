package com.example.android.explorenewsapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader {
    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public Object loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        List<News> news = QueryUtils.fetchNewsData(mUrl);
        return news;
    }
}