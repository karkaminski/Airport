package com.karkaminski.airport;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EventAdapter extends ArrayAdapter<Event> {


    public EventAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Event currentEvent = getItem(position);

        TextView scheduledTime = (TextView) listItemView.findViewById(R.id.scheduled_time);
        TextView scheduledDate = (TextView) listItemView.findViewById(R.id.scheduled_date);

        TextView estimatedTime = (TextView) listItemView.findViewById(R.id.estimated_time);
        GradientDrawable delayBackground = (GradientDrawable) estimatedTime.getBackground();
        delayBackground.setColor(getDelayColor(currentEvent.getDelayInMinutes()));


        TextView airlineName = (TextView) listItemView.findViewById(R.id.airline_name);
        TextView arrivalCode = (TextView) listItemView.findViewById(R.id.city_code);
        TextView flightNumber = (TextView) listItemView.findViewById(R.id.flight_number);
        TextView eventStatus = (TextView) listItemView.findViewById(R.id.event_status);

        scheduledTime.setText(formatTime(currentEvent.getScheduledTime()));
        scheduledDate.setText(formatDate(currentEvent.getScheduledTime()));

        estimatedTime.setText(String.valueOf(currentEvent.getDelayInMinutes()));
        airlineName.setText(currentEvent.getAirlineName());
        arrivalCode.setText(currentEvent.getCityCode());
        flightNumber.setText(currentEvent.getFlightNumber());
        eventStatus.setText(currentEvent.getEventStatus());


        return listItemView;
    }

    private String formatTime(String dateJson) {
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

    private String formatDate(String dateJson) {
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

    private int getDelayColor(int delay) {
        int color = 0;
        if (delay == 0) {
            color = R.color.delay0;
        } else if (delay <= 15) {
            color = R.color.delay15;
        } else if (delay > 15 && delay <= 30) {
            color = R.color.delay30;
        } else if (delay > 30) {
            color = R.color.delay45;
        }
        return ContextCompat.getColor(getContext(), color);
    }
}
