package com.karkaminski.airport;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class EventsQueryUtils {

    private static final String TAG = "EventsQueryUtils";

    /**
     * Prywatny konstruktor bo nie chcemy tworzyć instancji tej klasy.
     * wszystkie jej metody są statyczne
     */
    private EventsQueryUtils (){
    }

    public static List<Event> fetchArrivalEventsData (String requestURL){
        Log.i(TAG, "fetchArrivalEventsData: ");

        URL url = createURL(requestURL);
        String jsonResponse = null;
        jsonResponse = makeHttpRequest(url);

        List<Event> events = extractArrivalsFromJson(jsonResponse);
        return events;
    }

    public static List<Event> fetchDeparturesEventsData (String requestURL){
        Log.i(TAG, "fetchDeparturesEventsData: ");

        URL url = createURL(requestURL);
        String jsonResponse = null;
        jsonResponse = makeHttpRequest(url);

        List<Event> events = extractDeparturesFromJson(jsonResponse);
        return events;
    }

    private static ArrayList<Event> extractDeparturesFromJson(String jsonResponse) {
        ArrayList<Event> events = new ArrayList<Event>();


        try {
            //Whole JSON response is under in rootArrat object
            JSONArray rootArray = new JSONArray(jsonResponse);

            for (int i = 0; i < rootArray.length(); i++) {
                JSONObject singleEvent = rootArray.getJSONObject(i);
                //eventToAdd will be filled using setters and then added to ArrayList events
                Event eventToAdd = new Event();

                if (!"landed".equals(singleEvent.getString("status"))) {
                    eventToAdd.setEventStatus(singleEvent.getString("status"));
                    JSONObject departureOfSingleEvent = singleEvent.getJSONObject("departure");
                    eventToAdd.setScheduledTime(departureOfSingleEvent.getString("scheduledTime"));

                    try {
                        eventToAdd.setDelayInMinutes(departureOfSingleEvent.getInt("delay"));
                    } catch (JSONException e) {
                        eventToAdd.setDelayInMinutes(0);
                    }

                    JSONObject arrivalOfSingleEvent = singleEvent.getJSONObject("arrival");
                    eventToAdd.setCityCode(arrivalOfSingleEvent.getString("iataCode"));

                    JSONObject airlineOfSingleEvent = singleEvent.getJSONObject("airline");
                    eventToAdd.setAirlineName(airlineOfSingleEvent.getString("name"));

                    JSONObject flightOfSingleEvent = singleEvent.getJSONObject("flight");
                    eventToAdd.setFlightNumber(flightOfSingleEvent.getString("number"));

                    events.add(eventToAdd);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return events;
    }

    private static ArrayList<Event> extractArrivalsFromJson(String jsonResponse) {

        ArrayList<Event> arrivals = new ArrayList<Event>();

        try {
            //Whole JSON response is under in rootArrat object
            JSONArray rootArray = new JSONArray(jsonResponse);

            for (int i = 0; i < rootArray.length(); i++) {
                JSONObject singleEvent = rootArray.getJSONObject(i);
                //eventToAdd will be filled using setters and then added to ArrayList arrivals
                Event eventToAdd = new Event();

                if (!"landed".equals(singleEvent.getString("status"))) {
                    eventToAdd.setEventStatus(singleEvent.getString("status"));
                    JSONObject departureOfSingleEvent = singleEvent.getJSONObject("arrival");
                    eventToAdd.setScheduledTime(departureOfSingleEvent.getString("scheduledTime"));

                    try {
                        eventToAdd.setDelayInMinutes(departureOfSingleEvent.getInt("delay"));
                    } catch (JSONException e) {
                        eventToAdd.setDelayInMinutes(0);
                    }

                    JSONObject arrivalOfSingleEvent = singleEvent.getJSONObject("departure");
                    eventToAdd.setCityCode(arrivalOfSingleEvent.getString("iataCode"));

                    JSONObject airlineOfSingleEvent = singleEvent.getJSONObject("airline");
                    eventToAdd.setAirlineName(airlineOfSingleEvent.getString("name"));

                    JSONObject flightOfSingleEvent = singleEvent.getJSONObject("flight");
                    eventToAdd.setFlightNumber(flightOfSingleEvent.getString("number"));

                    arrivals.add(eventToAdd);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return arrivals;
    }


    private static URL createURL(String stringURL) {
        URL url = null;

        try {
            url = new URL(stringURL);
        } catch (MalformedURLException e) {
            Log.e(TAG, "createURL: problem z budowaniem URLa", e);
        }
        return url;
    }

    private static String makeHttpRequest(URL url) {
        String jsonResponse = "";

        if (url == null){
            return jsonResponse;
        }

        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;

        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            //Jeżeli request jest ok (kod 200),
            //to odczytaj i zapisz odpowiedź
            if (urlConnection.getResponseCode() == 200) {
                inputStream = urlConnection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            } else {
                Log.i(TAG,
                        "makeHttpRequest: kod błędu:  " + urlConnection.getResponseCode());
            }
        } catch (IOException e) {
            Log.e(TAG, "makeHttpRequest: problem z pobraniem JSON", e);
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }

        }

        return jsonResponse;

    }

    private static String readFromStream(InputStream inputStream) throws IOException {
        StringBuilder output = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
        }

        return output.toString();
    }
}
