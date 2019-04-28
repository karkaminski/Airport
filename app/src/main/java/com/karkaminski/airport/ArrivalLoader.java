package com.karkaminski.airport;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.List;

public class ArrivalLoader extends AsyncTaskLoader<List<Event>> {

    private static final String TAG = "EventLoader";

    private String mUrl;

    public ArrivalLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Nullable
    @Override
    public ArrayList<Event> loadInBackground() {
        ArrayList<Event> arrivals = (ArrayList<Event>) EventsQueryUtils.fetchArrivalEventsData(mUrl);
        return arrivals;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

}
