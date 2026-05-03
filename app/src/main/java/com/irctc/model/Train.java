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
    private Map<String, Date> stationTime;
    private List<String> stations;

    public Train(){}

    public Train(String trainId, String trainNo, Time departure, Time arrival, List<List<Integer>> seats, Map<String, Date> stationTime, List<String> stations) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.Departure = departure;
        this.arrival = arrival;
        this.seats = seats;
        this.stationTime = stationTime;
        this.stations = stations;
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
        trainNo = trainNo;
    }
    public Time getDeparture() {
        return Departure;
    }
    public String getTrainInfo(){
        return String.format("Train ID: %s Train no: %S", trainId, trainNo);
    }

}


