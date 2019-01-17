package com.karkaminski.airport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DepartureAdapter extends ArrayAdapter<Departure> {


    public DepartureAdapter(Context context, ArrayList<Departure> departures) {
        super(context, 0, departures);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Departure currentDeparture = getItem(position);

        TextView scheduledTime = (TextView) listItemView.findViewById(R.id.scheduled_time);
        TextView scheduledDate = (TextView) listItemView.findViewById(R.id.scheduled_date);
        TextView estimatedTime = (TextView) listItemView.findViewById(R.id.estimated_time);
        TextView airlineName = (TextView) listItemView.findViewById(R.id.airline_name);
        TextView arrivalCode = (TextView) listItemView.findViewById(R.id.arrival_code);
        TextView flightNumber = (TextView) listItemView.findViewById(R.id.flight_number);
        TextView eventStatus = (TextView) listItemView.findViewById(R.id.event_status);

        scheduledTime.setText(formatTime(currentDeparture.getScheduledTime()));
        scheduledDate.setText(formatDate(currentDeparture.getScheduledTime()));

        estimatedTime.setText(String.valueOf(currentDeparture.getDelayInMinutes()));
        airlineName.setText(currentDeparture.getAirlineName());
        arrivalCode.setText(currentDeparture.getArrivalCode());
        flightNumber.setText(currentDeparture.getFlightNumber());
        eventStatus.setText(currentDeparture.getEventStatus());
        return listItemView;
    }

    private String formatTime (String dateJson){
        SimpleDateFormat inputTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        SimpleDateFormat outputTime = new SimpleDateFormat("HH:mm");
        try {
            Date formattedDate = inputTime.parse(dateJson);
            String outputDate = outputTime.format(formattedDate);
            return outputDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return "exception";
        }
    }

    private String formatDate (String dateJson){
        SimpleDateFormat inputTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        SimpleDateFormat outputTime = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date formattedDate = inputTime.parse(dateJson);
            String outputDate = outputTime.format(formattedDate);
            return outputDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return "exception";
        }
    }
}
