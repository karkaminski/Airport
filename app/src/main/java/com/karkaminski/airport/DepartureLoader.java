package com.karkaminski.airport;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.List;

public class DepartureLoader  extends AsyncTaskLoader<List<Event>> {

    private static final String TAG = "DepartureLoader";

    private String mUrl;

    public DepartureLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Nullable
    @Override
    public ArrayList<Event> loadInBackground() {
        ArrayList<Event> departures = (ArrayList<Event>) EventsQueryUtils.fetchDeparturesEventsData(mUrl);
        return departures;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}
