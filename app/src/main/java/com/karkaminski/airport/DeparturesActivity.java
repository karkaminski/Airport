package com.karkaminski.airport;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DeparturesActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Event>> {

    private static final String TAG = "ArrivalsActivity";
    private String URL_REQUEST = "http://aviation-edge.com/v2/public/timetable?key=ea6c6d-7014e4&iataCode=KRK&type=departure";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.single, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_refresh:
                //TODO: Implement REFRESH method
                refreshEvents();
                return true;
            default:
                //Option not recognized. Let superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    private void refreshEvents (){
        Toast toast = Toast.makeText(this,"REFRESH\nDon't forget to implement ME! :)", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departure);

        getSupportLoaderManager().initLoader(1,null,DeparturesActivity.this).forceLoad();


    }

    @NonNull
    @Override
    public Loader<List<Event>> onCreateLoader(int i, @Nullable Bundle bundle) {
        Log.i(TAG, "onCreateLoader: ");
        return new DepartureLoader(this, URL_REQUEST);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<Event>> loader, List<Event> events) {
        ArrayList<Event> departures = (ArrayList<Event>) events;
        EventAdapter adapter = new EventAdapter(this, departures);
        ListView listView = (ListView) findViewById(R.id.departures_list_view);
        listView.setAdapter(adapter);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<Event>> loader) {

    }
}
