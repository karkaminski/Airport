package com.karkaminski.airport;

public class Departure {

    private String scheduledTime;
    private String estimatedTime;
    private String airlineName;
    private String arrivalCode; //iataCode
    private String flightNumber; //iataNumber
    private String eventStatus;


    public Departure(String scheduledTime, String estimatedTime, String airlineName, String arrivalCove, String flightNumber, String eventStatus) {
        this.scheduledTime = scheduledTime;
        this.estimatedTime = estimatedTime;
        this.airlineName = airlineName;
        this.arrivalCode = arrivalCove;
        this.flightNumber = flightNumber;
        this.eventStatus = eventStatus;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getArrivalCode() {
        return arrivalCode;
    }

    public void setArrivalCode(String arrivalCode) {
        this.arrivalCode = arrivalCode;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }
}
