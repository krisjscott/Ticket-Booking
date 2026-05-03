package com.irctc.model;

import java.util.Map;
import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Train {

    private String trainId;
    private String trainNo;
    private Time Departure;
    private Time arrival;
    private List<List<Integer>> seats;
    private Map<String, String> stationTime;
    private List<String> stations;
    private String source;
    private String destination;



    public Train(){}

    public Train(String trainId, String trainNo, Time departure, Time arrival, List<List<Integer>> seats, Map<String, String> stationTime, List<String> stations) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.Departure = departure;
        this.arrival = arrival;
        this.seats = seats;
        this.stationTime = stationTime;
        this.stations = stations;
    }

    public Train(String trainId, String trainNo, String source, String destination) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.source = source;
        this.destination = destination;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public Time getDeparture() {
        return Departure;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s Train no: %S", trainId, trainNo);
    }

    public Time getArrival(){
        return arrival;
    }

    public List<String> getStation() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public void setArrival(Time arrival) {
        this.arrival = arrival;
    }

    public Map<String, String> getStationTime() {
        return stationTime;
    }

    public void setStationTime(Map<String, String> stationTime) {
        this.stationTime = stationTime;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }
}


