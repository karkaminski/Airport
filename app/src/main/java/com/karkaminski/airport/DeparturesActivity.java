package com.karkaminski.airport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class DeparturesActivity extends AppCompatActivity {
    String json = "[\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T14:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T14:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T14:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T14:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T14:11:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"DUS\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"B29\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T16:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:49:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:49:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:46:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:46:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Eurowings\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"EW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EWG\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"9733\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"EW9733\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"EWG9733\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G9\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T14:50:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T14:50:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T14:50:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T14:59:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T14:59:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"CRL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EBCI\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T16:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:53:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:53:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:47:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:47:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"6729\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR6729\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR6729\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G13\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T14:56:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T14:56:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:06:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:06:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"DTM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDLW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T16:45:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:41:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:41:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"4925\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR4925\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR4925\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"4925\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*4925\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G13\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T14:56:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T14:56:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:06:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:06:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"DTM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDLW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T16:45:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:41:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:41:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"4925\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*4925\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G11\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:09:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:09:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"WAW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPWA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"6\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:55:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Aeroflot\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"SU\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"AFL\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3708\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"SU3708\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"AFL3708\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"LOT - Polish Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOT\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3906\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LO3906\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"LOT3906\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G11\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:09:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:09:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"WAW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPWA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"6\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:55:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"LOT - Polish Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOT\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3906\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LO3906\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"LOT3906\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G4\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:03:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:03:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"TRN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LIMF\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:37:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:37:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Blue Air\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"0B\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"BMS\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"4076\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"0B4076\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"BMS4076\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"005\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:23:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:23:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"VIE\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOWW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"06\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T16:20:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:12:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:12:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:08:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:08:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"LOT - Polish Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOT\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"5229\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LO5229\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"LOT5229\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Austrian\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"OS\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"AUA\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"598\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"OS598\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"AUA598\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"005\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:23:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:23:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"VIE\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOWW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"06\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T16:20:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:12:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:12:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:08:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:08:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Austrian\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"OS\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"AUA\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"598\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"OS598\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"AUA598\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G15\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:21:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:21:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T15:32:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T15:32:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LTN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EGGW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:59:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:59:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:54:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:54:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"easyJet\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"U2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EZY\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"2112\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"U22112\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"EZY2112\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G18\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 4,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:59:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:59:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:05:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"PFO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LCPH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T20:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:44:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T19:44:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"5087\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR5087\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR5087\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"5087\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*5087\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G18\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 4,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T15:59:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T15:59:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:05:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"PFO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LCPH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T20:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:44:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T19:44:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"5087\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*5087\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T16:35:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:37:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:37:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"AMS\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EHAM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"C6\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"11\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:22:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:22:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Air France\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"AF\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"AFR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"8288\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"AF8288\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"AFR8288\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"KLM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"KLM\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1996\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"KL1996\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"KLM1996\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T16:35:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:37:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:37:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"AMS\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EHAM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"C6\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"11\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:22:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:22:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"KLM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"KLM\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1996\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"KL1996\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"KLM1996\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G14\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 57,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:35:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:32:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:32:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:40:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"DUB\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EIDW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 58,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:38:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:38:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1902\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR1902\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR1902\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1902\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*1902\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G14\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 57,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T15:35:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T16:32:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T16:32:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T16:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T16:40:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"DUB\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EIDW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 58,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:38:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:38:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1902\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*1902\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G9\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T17:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T17:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T17:24:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T17:24:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"TSF\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LIPH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:50:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:46:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:46:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3850\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR3850\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR3850\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3850\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*3850\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G9\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T17:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T17:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T17:24:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T17:24:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"TSF\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LIPH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:50:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:46:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:46:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3850\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*3850\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"010\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:20:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T17:18:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T17:18:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"MUC\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"K21\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:23:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:23:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"LOT - Polish Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOT\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"5385\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LO5385\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"LOT5385\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"DLH\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LH1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"DLH1625\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"010\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:20:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T17:18:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T17:18:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"MUC\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"K21\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:23:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:23:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"SWISS\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LX\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"SWR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3807\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LX3807\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"SWR3807\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"DLH\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LH1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"DLH1625\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"010\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:20:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T17:18:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T17:18:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"MUC\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"K21\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:23:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:23:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"ANA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"NH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"ANA\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"6072\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"NH6072\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"ANA6072\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"DLH\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LH1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"DLH1625\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"010\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:20:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T17:18:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T17:18:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"MUC\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"K21\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:23:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:23:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Brussels Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"SN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"BEL\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"7136\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"SN7136\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"BEL7136\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"DLH\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LH1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"DLH1625\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"010\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:20:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T17:11:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T17:18:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T17:18:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"MUC\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDM\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"K21\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:29:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:23:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:23:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"DLH\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LH1625\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"DLH1625\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"active\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G18\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T17:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T17:43:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T17:43:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"MAN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EGCC\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"3\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T19:20:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:20:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"2142\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR2142\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR2142\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"2142\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*2142\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"active\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G18\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T17:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T17:43:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T17:43:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"MAN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EGCC\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"3\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T19:20:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:20:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"2142\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*2142\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"active\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G3\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 10,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T17:50:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:00:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:13:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:13:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LPA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"GCLP\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"21\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 3,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T22:25:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T22:28:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"4505\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR4505\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR4505\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"cancelled\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:00:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"GDN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPGD\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T19:20:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"LOT - Polish Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOT\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3502\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LO3502\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"LOT3502\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"011\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:25:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:17:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:17:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:26:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:26:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FRA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDF\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T20:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:49:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T19:49:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"LOT - Polish Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOT\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"5501\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LO5501\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"LOT5501\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa CityLine\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"CL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"CLH\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"CL1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"CLH1369\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"011\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:25:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:17:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:17:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:26:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:26:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FRA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDF\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T20:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:49:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T19:49:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Brussels Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"SN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"BEL\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"7120\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"SN7120\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"BEL7120\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa CityLine\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"CL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"CLH\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"CL1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"CLH1369\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"011\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:25:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:17:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:17:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:26:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:26:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FRA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDF\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T20:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:49:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T19:49:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LH\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"DLH\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LH1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"DLH1369\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa CityLine\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"CL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"CLH\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"CL1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"CLH1369\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"011\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:25:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:17:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:17:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:26:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:26:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FRA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EDDF\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T20:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:49:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T19:49:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Lufthansa CityLine\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"CL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"CLH\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"CL1369\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"CLH1369\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"landed\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G7\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 23,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:28:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T18:28:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T18:39:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T18:39:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"WAW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPWA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"5\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 30,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:25:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T19:25:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T19:12:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T19:12:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"LOT - Polish Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOT\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3924\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LO3924\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"LOT3924\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"active\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G13\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T18:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T18:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T19:09:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T19:09:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"ALC\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LEAL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"N\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"10A\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T22:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T22:05:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"9872\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR9872\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR9872\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"active\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G18\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T19:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T19:18:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T19:18:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KBP\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"UKBB\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"D\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T21:50:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T21:27:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"6640\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR6640\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR6640\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"6640\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*6640\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"active\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G18\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T19:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T19:18:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T19:18:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KBP\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"UKBB\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"D\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T21:50:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T21:27:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"6640\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*6640\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"active\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G7\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T19:45:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:27:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T19:27:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T19:39:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T19:39:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"HEL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EFHK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"22\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T22:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T22:28:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Finnair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"AY\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"FIN\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1164\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"AY1164\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"FIN1164\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Nordic Regional Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"N7\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"FCM\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1164\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"N71164\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"FCM1164\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"active\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G7\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T19:45:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T19:27:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualTime\": \"2019-01-16T19:27:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T19:39:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"actualRunway\": \"2019-01-16T19:39:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"HEL\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EFHK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"2\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"22\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T22:40:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T22:28:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Nordic Regional Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"N7\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"FCM\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1164\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"N71164\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"FCM1164\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"scheduled\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G15\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T20:30:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T20:30:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"BHX\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EGBB\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"delay\": 1,\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T22:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T22:11:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"1466\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR1466\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR1466\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"scheduled\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"gate\": \"G1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T20:55:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T20:55:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"ARN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"ESSA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"5\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T22:50:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T22:45:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Norwegian Air Shuttle\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"DY\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"NAX\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"4902\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"DY4902\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"NAX4902\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"scheduled\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T21:05:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedRunway\": \"2019-01-16T21:20:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"WAW\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPWA\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"baggage\": \"5\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T22:00:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"LOT - Polish Airlines\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"LO\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"LOT\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"3922\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"LO3922\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"LOT3922\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"scheduled\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T21:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T21:15:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"GDN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPGD\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T22:25:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T22:25:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"7151\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR7151\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR7151\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"codeshared\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"7151\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*7151\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"scheduled\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T21:15:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T21:15:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"GDN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPGD\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T22:25:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T22:25:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair Sun\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"RR*\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"7151\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"RR*7151\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\n" +
            "\"type\": \"departure\",\n" +
            "\n" +
            "\n" +
            "\"status\": \"scheduled\",\n" +
            "\n" +
            "\n" +
            "\"departure\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"KRK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EPKK\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T21:45:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T21:45:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"arrival\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"STN\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"EGSS\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"terminal\": \"1\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"scheduledTime\": \"2019-01-16T23:10:00.000\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"estimatedTime\": \"2019-01-16T23:10:00.000\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"airline\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"name\": \"Ryanair\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataCode\": \"FR\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoCode\": \"RYR\"\n" +
            "\n" +
            "\n" +
            "},\n" +
            "\n" +
            "\n" +
            "\"flight\": {\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"number\": \"2437\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"iataNumber\": \"FR2437\",\n" +
            "\n" +
            "\n" +
            "\n" +
            "\"icaoNumber\": \"RYR2437\"\n" +
            "\n" +
            "\n" +
            "}\n" +
            "\n" +
            "}\n" +
            "]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departure);



        ArrayList<Event> events = new ArrayList<Event>();


        try {
            //Whole JSON response is under in rootArrat object
            JSONArray rootArray = new JSONArray(json);

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


        EventAdapter adapter = new EventAdapter(this, events);
        ListView listView = (ListView) findViewById(R.id.departures_list_view);
        listView.setAdapter(adapter);
    }
}
