package com.karkaminski.airport;

public class Departure {

    private String scheduledTime;
    private int delayInMinutes;
    private String airlineName;
    private String arrivalCode; //iataCode
    private String flightNumber; //iataNumber
    private String eventStatus;


    public Departure(String scheduledTime, int delayInMinutes, String airlineName, String arrivalCove, String flightNumber, String eventStatus) {
        this.scheduledTime = scheduledTime;
        this.delayInMinutes = delayInMinutes;
        this.airlineName = airlineName;
        this.arrivalCode = arrivalCove;
        this.flightNumber = flightNumber;
        this.eventStatus = eventStatus;
    }
    public Departure(){
        this.scheduledTime = "empty";
        this.delayInMinutes = 0;
        this.airlineName = "empty";
        this.arrivalCode = "empty";
        this.flightNumber = "empty";
        this.eventStatus = "empty";
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public int getDelayInMinutes() {
        return delayInMinutes;
    }

    public void setDelayInMinutes(int estimatedTime) {
        this.delayInMinutes = estimatedTime;
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
