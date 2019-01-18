package com.karkaminski.airport;

public class Event {

    private String scheduledTime;
    private int delayInMinutes;
    private String airlineName;
    private String cityCode; //iataCode
    private String flightNumber; //iataNumber
    private String eventStatus;


    public Event(String scheduledTime, int delayInMinutes, String airlineName, String arrivalCove, String flightNumber, String eventStatus) {
        this.scheduledTime = scheduledTime;
        this.delayInMinutes = delayInMinutes;
        this.airlineName = airlineName;
        this.cityCode = arrivalCove;
        this.flightNumber = flightNumber;
        this.eventStatus = eventStatus;
    }
    public Event(){
        this.scheduledTime = "empty";
        this.delayInMinutes = 0;
        this.airlineName = "empty";
        this.cityCode = "empty";
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

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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
