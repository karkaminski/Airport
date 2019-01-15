package com.karkaminski.airport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

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
        TextView estimatedTime = (TextView) listItemView.findViewById(R.id.estimated_time);
        TextView airlineName = (TextView) listItemView.findViewById(R.id.airline_name);
        TextView arrivalCode = (TextView) listItemView.findViewById(R.id.arrival_code);
        TextView flightNumber = (TextView) listItemView.findViewById(R.id.flight_number);
        TextView eventStatus = (TextView) listItemView.findViewById(R.id.event_status);

        scheduledTime.setText(currentDeparture.getScheduledTime());
        estimatedTime.setText(currentDeparture.getEstimatedTime());
        airlineName.setText(currentDeparture.getAirlineName());
        arrivalCode.setText(currentDeparture.getArrivalCode());
        flightNumber.setText(currentDeparture.getFlightNumber());
        eventStatus.setText(currentDeparture.getEventStatus());


        return listItemView;
    }
}
